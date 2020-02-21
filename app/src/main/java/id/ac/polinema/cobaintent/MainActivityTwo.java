package id.ac.polinema.cobaintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        Button act2 = findViewById(R.id.bAct2);

        String nama = getIntent().getStringExtra(MainActivity.NAMA);
        TextView hNama = findViewById(R.id.tvHasil);
        hNama.setText("Haloo " + nama);

        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityTwo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
