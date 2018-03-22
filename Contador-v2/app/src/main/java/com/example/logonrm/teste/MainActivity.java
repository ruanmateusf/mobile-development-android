package com.example.logonrm.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber = findViewById(R.id.txtNumber);
    }

    public void mais(View view) {
        if(contador < 10){
            contador++;
            txtNumber.setText(String.valueOf(contador));
        }else{
            Toast.makeText(this, "Você não pode aumentar!", Toast.LENGTH_SHORT).show();
        }

    }

    public void menos(View view) {
        if(contador > 0){
            contador--;
            txtNumber.setText(String.valueOf(contador));
        }else{
            Toast.makeText(this, "Você não pode diminuir!", Toast.LENGTH_SHORT).show();
        }

    }

    public void zerar(View view) {
        if(contador != 0){
            contador = 0;
            txtNumber.setText(String.valueOf(contador));
        }else{
            Toast.makeText(this, "O numero já está zerado!", Toast.LENGTH_SHORT).show();
        }

    }
}
