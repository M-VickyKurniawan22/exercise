package com.example.activity3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ActivityDaftar extends AppCompatActivity {

    EditText edtNama,edtAlamat,edtMail,edtPass,edtrepass;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtMail = findViewById(R.id.edMail);
        edtPass = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edRePass);
        fab = findViewById(R.id.fabSimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty() ||
                        edtMail.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view ,"Wajib isi seluruh data !!",Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if(edtPass.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(),"Pendaftaran Berhasil",
                                Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view,"Password dan RePassword tidak sesuai !",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}