package id.ac.polinema.cobaintent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class ViewSplash extends AppCompatActivity {

    private int lama = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(ViewSplash.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        }, lama);
    }
}

