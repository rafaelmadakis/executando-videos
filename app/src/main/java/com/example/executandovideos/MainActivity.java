package com.example.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Método que será chamado quando o usuário
     * clicar em cima do botão (ImageExecutar)
     * no botão play em cima do vídeo.
     * @param view
     */
    public void abrirVideo(View view) {

        /**
         * Abrir outra Activity criada,
         * no caso a PlayerActivity.class que foi
         * criada para começar o video em que o caminho
         * esta na classe ActivityPlayer.
         * @see ActivityPlayer.java
         */
        startActivity(new Intent(this, PlayerActivity.class));
    }
}