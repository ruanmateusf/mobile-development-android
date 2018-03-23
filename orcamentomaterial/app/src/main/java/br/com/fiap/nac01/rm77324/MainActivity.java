package br.com.fiap.nac01.rm77324;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgMateriais;
    RadioButton rdbPisoBranco;
    RadioButton rdbPisoAlbania;
    RadioButton rdbPorcelanatoPerlato;
    RadioButton rdbRevestimentoMosaico;

    EditText edtMedida;

    CheckBox chkFrete;

    TextView txtResultado;

    double resultado = 0;
    int selecionado = 0;
    int metros = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgMateriais = findViewById(R.id.rdgMateriais);
        rdbPisoBranco = findViewById(R.id.rdbPisoBranco);
        rdbPisoAlbania = findViewById(R.id.rdbPisoAlbania);
        rdbPorcelanatoPerlato = findViewById(R.id.rdbPorcelanatoPerlato);
        rdbRevestimentoMosaico = findViewById(R.id.rdbRevestimentoMosaico);
        edtMedida = findViewById(R.id.edtMedida);
        chkFrete= findViewById(R.id.chkFrete);
        txtResultado= findViewById(R.id.txtResultado);
    }

    public void calcularOrcamento(View view) {

        metros = Integer.parseInt(edtMedida.getText().toString());

        selecionado = rdgMateriais.getCheckedRadioButtonId();

        if (rdbPisoBranco.isChecked()){
            resultado = metros * 24.9;
        }else if(rdbPisoAlbania.isChecked()){
            resultado = metros * 11.9;
        }else if(rdbPorcelanatoPerlato.isChecked()){
            resultado = metros * 39.9;
        }else if(rdbRevestimentoMosaico.isChecked()){
            resultado = metros * 16.9;
        }

        if (chkFrete.isChecked()){
            resultado *= 1.3;
        }

        txtResultado.setText(String.format("R$ %.2f", resultado));
    }
}
