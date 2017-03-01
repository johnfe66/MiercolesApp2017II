package com.johnfe.miercolesapp2017ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtSaludar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSaludar= (TextView) findViewById(R.id.txtDato);

        Bundle bundle;
        bundle= this.getIntent().getExtras();

        txtSaludar.append(" "+bundle.get("nombre"));
        Toast.makeText(this, "Email :"+bundle.getString("email"), Toast.LENGTH_LONG).show();

    }
}
