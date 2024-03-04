package nurika.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edtPanjang, edtLebar;
Integer Lebar, Panjang, Keliling, Luas;
Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        btnHitung= findViewById(R.id.btn_Hitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Panjang = Integer.parseInt(edtPanjang.getText().toString());
                Lebar = Integer.parseInt(edtLebar.getText().toString());

                Keliling = 2 * (Panjang + Lebar);
                Luas = Panjang * Lebar;

                //edtKeliling.setText(" " + Keliling)

                Intent i = new Intent(MainActivity.this, Hasil.class);
                i.putExtra("Panjang", Panjang);
                i.putExtra("Lebar", Lebar);
                i.putExtra("Keliling", Keliling);
                i.putExtra("Luas", Luas);
                startActivity(i);

            }
        });

    }
}