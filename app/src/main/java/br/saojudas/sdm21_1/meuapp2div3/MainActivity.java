package br.saojudas.sdm21_1.meuapp2div3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarMensagem(View view) {
        EditText mensagemEditText = findViewById(R.id.mensagemEditText);
        String mensagem = mensagemEditText.getEditableText().toString();
        Intent enviarMensagemIntent = new Intent();
        enviarMensagemIntent.setAction(Intent.ACTION_SEND);
        enviarMensagemIntent.setType("text/plain");
        enviarMensagemIntent.putExtra(Intent.EXTRA_TEXT, mensagem);
        enviarMensagemIntent = Intent.createChooser(enviarMensagemIntent, null);
        startActivity(enviarMensagemIntent);
    }
}