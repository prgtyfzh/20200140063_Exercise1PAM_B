package com.example.exercise1pam_todoapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    EditText edtTask, edtType, edtTime;
    String task,type, time;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        edtTask = findViewById(R.id.edTask);
        edtType = findViewById(R.id.edJenis);
        edtTime = findViewById(R.id.edTime);

        fab = findViewById(R.id.fabAdd);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtTask.getText().toString().isEmpty() ||
                        edtType.getText().toString().isEmpty() ||
                        edtTime.getText().toString().isEmpty())
                {
                    Toast.makeText(Welcome.this,"Wajib isi seluruh data!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Welcome.this, "Task Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();

                    Bundle bn = new Bundle();

                    bn.putString("a", task.trim());
                    bn.putString("b", type.trim());
                    bn.putString("c", time.trim());

                    Intent i = new Intent(getApplicationContext(), Result.class);
                    i.putExtras(bn);
                    startActivity(i);
                }
            }
        });
    }
}