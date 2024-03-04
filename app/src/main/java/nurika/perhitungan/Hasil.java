package nurika.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {
      private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        int Panjang = getIntent().getExtras().getInt("Panjang");
        int Lebar = getIntent().getExtras().getInt("Lebar");
        int Keliling = getIntent().getExtras().getInt("Keliling");
        int Luas = getIntent().getExtras().getInt("Luas");

        hasil = findViewById(R.id.textHasil);
        hasil.setText(" Panjang = " +Panjang + "\n Lebar = \t" + Lebar + "\n Keliling = \t" + Keliling + "\n Luas = \t" + Luas );

    }
}