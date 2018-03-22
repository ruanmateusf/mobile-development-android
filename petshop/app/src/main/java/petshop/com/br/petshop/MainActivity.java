package petshop.com.br.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgCachorros;

    RadioButton rdbBorderCollie;
    RadioButton rdbPitBull;
    RadioButton rdbPastorAlemao;
    RadioButton rdbPastorCanadense;

    CheckBox chkFemea;
    CheckBox chkAdestrado;
    CheckBox chkVacinas;

    TextView txtResultado;

    double resultado = 0;

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgCachorros = findViewById(R.id.rdgCachorros);

        rdbBorderCollie = findViewById(R.id.rdbBorderCollie);
        rdbPitBull = findViewById(R.id.rdbPitBull);
        rdbPastorAlemao = findViewById(R.id.rdbPastorAlemao);
        rdbPastorCanadense = findViewById(R.id.rdbPastorCanadense);

        chkFemea = findViewById(R.id.chkFemea);
        chkAdestrado = findViewById(R.id.chkAdestrado);
        chkVacinas = findViewById(R.id.chkVacinas);

        txtResultado = findViewById(R.id.txtResultado);

    }

    public void calcularResultado (View view) {

        if (rdbBorderCollie.isChecked()){
            resultado += 800.00;
        }else if(rdbPitBull.isChecked()){
            resultado += 750.00;
        }else if(rdbPastorAlemao.isChecked()){
            resultado += 700.00;
        }else if(rdbPastorCanadense.isChecked()){
            resultado += 800.00;
        }

        if (chkFemea.isChecked()){
            resultado += 180.00;
        }
        if (chkAdestrado.isChecked()){
            resultado += 200.00;
        }
        if (chkVacinas.isChecked()){
            resultado += 400.00;
        }

        txtResultado.setText(nf.format(resultado));
        resultado = 0;
    }
}
