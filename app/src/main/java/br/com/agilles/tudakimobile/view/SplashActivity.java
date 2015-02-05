package br.com.agilles.tudakimobile.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.com.agilles.tudakimobile.R;

/**
 * Created by Inteligencia on 03/02/2015.
 */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //teste
        setContentView(R.layout.splash_layout);


        Handler h = new Handler();

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent it = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(it);
                finish();
            }
        },5000);
    }


}
