package com.haritsdeveloper.basicrecyclearview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    public static final String KEY = "KEY";
    String idBuah;
    TextView txtJudul, txtSubJudul;
    ImageView imgDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtJudul = findViewById(R.id.idJudulDetail);
        txtSubJudul = findViewById(R.id.idSubJudulDetail);
        imgDetail = findViewById(R.id.imgDetai);

        idBuah = getIntent().getStringExtra(KEY);
        Toast.makeText(this, idBuah, Toast.LENGTH_SHORT).show();

        if (idBuah.equals("1")){
            txtJudul.setText("Apel");
            txtSubJudul.setText("Selama ribuan tahun, buah apel menjadi makanan penting, khususnya di Asia, Eropa, Argentina, dan Amerika Serikat. Pertama kali, buah apel masuk ke Benua Amerika dibawa oleh para kolonis pada abad ke-17. Kemudian, buah apel itu dibudidayakan dan ditanam di berbagai area perkebunan berhawa dingin.");
            imgDetail.setImageResource(R.drawable.apel);
        }else if (idBuah.equals("2")){
            txtJudul.setText("Mangga");
            txtSubJudul.setText("Berasal dari daerah di sekitar perbatasan India dengan Burma, mangga telah menyebar ke Asia Tenggara sekurang-kurangnya semenjak 1500 tahun yang silam. Buah ini dikenal pula dalam berbagai bahasa daerah, seperti pelem atau poh (Jw.).");
            imgDetail.setImageResource(R.drawable.mangga);
        }else if (idBuah.equals("3")){
            txtJudul.setText("Manggis");
            txtSubJudul.setText("Manggis (Garcinia mangostana L.) adalah sejenis pohon hijau abadi dari daerah tropika yang diyakini berasal dari Semenanjung Malaya dan menyebar ke Kepulauan Nusantara. Tumbuh hingga mencapai 7 sampai 25 meter.");
            imgDetail.setImageResource(R.drawable.mangis);
        }else if (idBuah.equals("4")){
            txtJudul.setText("Semangka");
            txtSubJudul.setText("Semangka atau tembikai (Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan (Cucurbitaceae), melon (Cucumis melo) dan ketimun (Cucumis sativus).");
            imgDetail.setImageResource(R.drawable.semangka);
        }else if (idBuah.equals("5")){
            txtJudul.setText("Melon");
            txtSubJudul.setText("Melon merupakan nama buah sekaligus tanaman yang menghasilkannya, yang termasuk dalam suku labu-labuan atau Cucurbitaceae. Buahnya biasanya dimakan segar sebagai buah meja atau diiris-iris sebagai campuran es buah. Bagian yang dimakan adalah daging buah (mesokarp). Teksturnya lunak, berwarna putih sampai merah, tergantung kultivarnya.");
            imgDetail.setImageResource(R.drawable.melon);
        }else if (idBuah.equals("6")){
            txtJudul.setText("Kiwi");
            txtSubJudul.setText("Buah ini awalnya bernama Gosberi Cina, buah ini dinamai kembali dengan alasan ekspor marketing pada tahun 1950-an, menjadi melonette, kemudian kiwi. Nama buah ini berasal dari kiwi — burung yang tak bisa terbang dari Selandia Baru.");
            imgDetail.setImageResource(R.drawable.kiwi);
        }else if (idBuah.equals("7")){
            txtJudul.setText("Jeruk");
            txtSubJudul.setText("Asal jeruk adalah dari Asia Timur dan Asia Tenggara, membentuk sebuah busur yang membentang dari Jepang terus ke selatan hingga kemudian membelok ke barat ke arah India bagian timur. Jeruk manis dan sitrun (lemon) berasal dari Asia Timur, sedangkan jeruk bali, jeruk nipis dan jeruk purut berasal dari Asia Tenggara.");
            imgDetail.setImageResource(R.drawable.jeruk);
        }else if (idBuah.equals("8")){
            txtJudul.setText("Durian");
            txtSubJudul.setText("Durian adalah nama tumbuhan tropis yang berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan. Nama ini diambil dari ciri khas kulit buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri. Sebutan populernya adalah \"raja dari segala buah\" (King of Fruit).");
            imgDetail.setImageResource(R.drawable.durian);
        }else if (idBuah.equals("9")){
            txtJudul.setText("Aplukat");
            txtSubJudul.setText("Buah ini mengandung lemak yang baik untuk kesehatan dan rasanya enak bagi yang menyukainya. Namun Anda mungkin akan sedikit geli bila mengetahui asal nama buah ini. Alpukat berasal dari Meksiko dan Amerika Tengah dan biasa dimakan oleh suku asli Nahua.");
            imgDetail.setImageResource(R.drawable.alpukat);
        }else if (idBuah.equals("10")){
            txtJudul.setText("Rambutan");
            txtSubJudul.setText("Rambutan adalah tanaman tropis yang tergolong ke dalam suku lerak-lerakan atau Sapindaceae, berasal dari daerah di Asia Tenggara. Kata \"rambutan\" berasal dari bentuk buahnya yang mempunyai kulit menyerupai rambut.");
            imgDetail.setImageResource(R.drawable.rambutan);
        }

    }
}
