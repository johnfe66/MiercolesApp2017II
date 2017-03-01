package com.johnfe.miercolesapp2017ii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityUno extends AppCompatActivity {

    private EditText usuario;
    private EditText pws;
    private Button btnLogin;
    private Button btnSalir;
    private Button btnRecordar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);


        usuario = (EditText) findViewById(R.id.txtEmail);
        pws = (EditText) findViewById(R.id.txtClave);
        btnLogin = (Button) findViewById(R.id.btnEntrar);
        btnSalir = (Button) findViewById(R.id.btnSalir);
        btnRecordar = (Button) findViewById(R.id.btnRecodarClave);

        final Intent intent = new Intent(ActivityUno.this,MainActivity.class);

        final Bundle bundle= new Bundle();



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(usuario.getText().toString().equalsIgnoreCase("admin@admin") && pws.getText().toString().equalsIgnoreCase("1234") ){

                    Toast.makeText(getApplicationContext(),"contraseña correcta",Toast.LENGTH_SHORT).show();
                    bundle.putString("email",usuario.getText().toString().trim());
                    bundle.putString("nombre","Clase Miercoles");

                    intent.putExtras(bundle);

                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"contraseña y/o usuario incorrectos",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}
