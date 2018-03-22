package fiap.com.br.app_petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdgCachorros;
    CheckBox chkFemea;
    CheckBox chkAdestrado;
    CheckBox chkAllVacinas;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgCachorros = findViewById(R.id.rdgCachorros);
        chkAdestrado = findViewById(R.id.chkAdestrado);
        chkAllVacinas = findViewById(R.id.chkAdestrado);
        chkAdestrado = findViewById(R.id.chkAdestrado);
        txtResultado = findViewById(R.id.txtCalculo);
    }

    public void calcular(View view) {

        double resultado;

        switch(resultado){
            case rdbBooderCollie.R.id
        }
    }
}
