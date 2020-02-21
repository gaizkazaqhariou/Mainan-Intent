package id.ac.polinema.cobaintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String NAMA = "Nama";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button act1 = findViewById(R.id.bAct1);
        final EditText inNama = findViewById(R.id.etNama);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sNama = inNama.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivityTwo.class);
                intent.putExtra("Nama", sNama);
                startActivity(intent);
            }
        });
    }
}
