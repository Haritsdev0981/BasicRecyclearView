package com.haritsdeveloper.basicrecyclearview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterBasicRecyclear extends RecyclerView.Adapter<AdapterBasicRecyclear.MekHolder> {

    String [] idMek = {
            "1", "2", "3","4", "5", "6", "7", "8", "9", "10"
    };

    String [] namaMek={
          "Apel", "Mangga", "Manggis", "Semangka","Melon","Kiwi","Jeruk","Durian","Alpukat","Rambutan"
    };

    String [] desMek = {
            "Apel berasal dari Amerika", "Mangga berasal dari Perbatasan India & Burma", "Manggis berasal dari semenangjung malaya ","Semangka berasal dari gurun di Afrika bagian selatan","melon berasal dari lembah persia (Syiria)","Kiwi berasal dari Selandia baru","Jeruk dari Asia timur","Durian dari Asia Tenggara","Alpukat dari Meksiko dan Amerika Tengah","Rambutan dari Asia Tenggara"
    };

    int[] gambarMek ={
            R.drawable.apel, R.drawable.mangga, R.drawable.mangis,R.drawable.semangka,R.drawable.melon,R.drawable.kiwi,R.drawable.jeruk,R.drawable.durian,R.drawable.alpukat,R.drawable.rambutan
    };

    Context context;
    LayoutInflater inflater;

    public AdapterBasicRecyclear(MainActivity activity) {
        this.context = activity;
        inflater = LayoutInflater.from(activity);
    }

    @NonNull
    @Override
    public MekHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_recyclearview,viewGroup, false);
        AdapterBasicRecyclear.MekHolder Holder = new AdapterBasicRecyclear.MekHolder(view);
        return Holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MekHolder Holder, int posisi) {
        Holder.txtMek.setText(namaMek[posisi]);
        Holder.txtDesMek.setText(desMek[posisi]);
        Holder.imgMek.setImageResource(gambarMek[posisi]);
        Holder.idBuah = idMek[posisi];
    }

    @Override
    public int getItemCount() {
        return namaMek.length;
    }


    public class MekHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txtMek, txtDesMek;
        ImageView imgMek;
        String idBuah;

        public MekHolder(@NonNull View itemView) {
            super(itemView);

            txtMek = itemView.findViewById(R.id.txtJudul);
            txtDesMek = itemView.findViewById(R.id.txtSubJudul);
            imgMek = itemView.findViewById(R.id.imgNtol);
            itemView.setOnClickListener(this);

        }
        @Override
        public void onClick(View v) {
            String id = idBuah;
            itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailActivity.class)
            .putExtra(DetailActivity.KEY, id));

        }
    }
}
