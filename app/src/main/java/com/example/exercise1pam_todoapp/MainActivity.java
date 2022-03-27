package com.example.exercise1pam_todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    EditText ednama, edpasswordd;
    String nama, password;
    TextView lregist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin=findViewById(R.id.btLogin);
        ednama=findViewById(R.id.edNama);
        edpasswordd=findViewById(R.id.edPassword);

        lregist = findViewById(R.id.tregis);

        lregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Register.class));
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = ednama.getText().toString();
                password = edpasswordd.getText().toString();

                if(nama.equals("prgtyfzh")&& password.equals("791")){
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();

                    Bundle bn = new Bundle();

                    bn.putString("a", nama.trim());
                    bn.putString("b", password.trim());

                    Intent i = new Intent(MainActivity.this,Welcome.class);
                    i.putExtras(bn);
                    startActivity(i);

                } else if (nama.equals("prgtyfzh")&& password.equals(password)){
                    Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                } else if (nama.equals(nama)&& password.equals("791")){
                    Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}