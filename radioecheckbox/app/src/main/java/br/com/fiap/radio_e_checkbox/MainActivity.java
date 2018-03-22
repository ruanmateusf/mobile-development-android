package br.com.fiap.radio_e_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CheckBox chkEstouAprendendo;
    RadioGroup rdgDificuldade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkEstouAprendendo = findViewById(R.id.chkEstouAprendendo);
        rdgDificuldade = findViewById(R.id.rdgDificuldade);
    }

    public void salvar(View view) {
        boolean marcado = chkEstouAprendendo.isChecked();
        Toast.makeText(this, "Estou aprendendo Android?: ", Toast.LENGTH_SHORT).show();

        int selecionado = rdgDificuldade.getCheckedRadioButtonId();

        if(selecionado == R.id.rdbDificil){
            Toast.makeText(this, R.string.btndificil, Toast.LENGTH_SHORT).show();
        }else if (selecionado == R.id.rdbMedio){
            Toast.makeText(this, R.string.btnMedio, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, R.string.btnFacil, Toast.LENGTH_SHORT).show();
        }
    }



}


