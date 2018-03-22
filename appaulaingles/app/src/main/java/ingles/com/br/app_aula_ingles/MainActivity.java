package ingles.com.br.app_aula_ingles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtPontos;
    ImageView imgWord;
    RadioGroup rdgOptions;

    RadioButton rdbOpcao1;
    RadioButton rdbOpcao2;
    RadioButton rdbOpcao3;

    int[] imgs = {
            R.drawable.palavra1,
            R.drawable.palavra2,
            R.drawable.palavra3
    };

    int score = 0;

    int words = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPontos = findViewById(R.id.txtPontos);
        imgWord = findViewById(R.id.imgWord);
        rdgOptions = findViewById(R.id.rdgOptions);
        rdbOpcao1 = findViewById(R.id.rdbOpcao1);
        rdbOpcao2 = findViewById(R.id.rdbOpcao2);
        rdbOpcao3 = findViewById(R.id.rdbOpcao3);

        rdbOpcao1.setText("Acordar");
        rdbOpcao2.setText("Carro");
        rdbOpcao3.setText("Rato");


    }

    public void defineImagem(int img) {
        if (img == 1) {
            imgWord.setImageResource(imgs[0]);
            rdbOpcao1.setText("Acordar");
            rdbOpcao2.setText("Carro");
            rdbOpcao3.setText("Rato");
        } else if (img == 2) {
            imgWord.setImageResource(imgs[1]);
            rdbOpcao1.setText("Notebook");
            rdbOpcao2.setText("Porco");
            rdbOpcao3.setText("Cadeira");
        } else if (img == 3) {
            imgWord.setImageResource(imgs[2]);
            rdbOpcao1.setText("Mesa");
            rdbOpcao2.setText("Óculos");
            rdbOpcao3.setText("Água");
        }
    }

    public void jump(View view) {
        if(words == 0) {
            words = 1;
        }else if (words == 1){
            words = 2;
        }else if (words == 2){
            words = 0;
        }

        score -= 1;
        defineImagem(words);

        txtPontos.setText(String.valueOf(score));


    }

    public void next(View view) {

        if(words == 0) {
            words = 1;
        }else if (words == 1){
            words = 2;
        }else if (words == 2){
            words = 0;
        }

        if(validaPalavra(words) == 1){
            score += 3;
            Toast.makeText(this, R.string.acertou, Toast.LENGTH_SHORT).show();
        }else{
            score -=2;
            Toast.makeText(this, R.string.errou, Toast.LENGTH_SHORT).show();
        }

        txtPontos.setText(String.valueOf(score));

    }

    public int validaPalavra(int img) {
        int retorno = 0;
        if (img == 1) {
            if (rdbOpcao1.isChecked()) {
                retorno = 1;
            } else {
                retorno = 0;
            }
        } else if (img == 2) {
            if (rdbOpcao2.isChecked()) {
                retorno = 1;
            } else {
                retorno = 0;
            }
        } else if (img == 3) {
            if (rdbOpcao3.isChecked()) {
                retorno = 1;
            } else {
                retorno = 0;
            }
        }
        return retorno;
}
}
