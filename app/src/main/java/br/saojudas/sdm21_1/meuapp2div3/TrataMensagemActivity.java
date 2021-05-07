package br.saojudas.sdm21_1.meuapp2div3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TrataMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trata_mensagem);
        TextView textViewMensagem = findViewById(R.id.textoMensagem);
        Intent intent = getIntent();
        String texto = intent.getStringExtra(Intent.EXTRA_TEXT);
        textViewMensagem.setText(texto);
    }
}