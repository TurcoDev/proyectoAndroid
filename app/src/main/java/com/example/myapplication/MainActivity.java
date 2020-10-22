package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int create = 0;
    int start = 0;
    int resume = 0;
    int pause = 0;
    int stop = 0;
    int restart = 0;
    int destroy = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // se activa cuando el sistema crea tu actividad
        create++;
        Toast.makeText(this, "OnCreate #" + Integer.toString(create), Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        //Inicia los preparativos finales de la actividad para pasar al primer plano y convertirse en interactiva
        start++;
        Toast.makeText(this, "OnStart #" + Integer.toString(start), Toast.LENGTH_SHORT).show();
        super.onStart();
    }
    @Override
    protected void onResume() {
        //Se inicia justo antes de que la actividad comience a interactuar con el usuario
        //aqui se captura ttodo lo que el usuario ingresa
        //La mayor parte de la funcionalidad principal de una app se implementa en el método
        resume++;
        Toast.makeText(this, "OnResume #" + Integer.toString(resume), Toast.LENGTH_SHORT).show();
        super.onResume();
    }
    @Override
    protected void onPause() {
        //Se ejecuta cuando la actividad pierde el foco y pasa al estado Detenida
        //Ocurre generalmente cuando el usuario presiona el botón Atrás o Recientes
        //Esta actividad está a punto de ser DETENIDA.
        pause++;
        Toast.makeText(this, "OnPause #" + Integer.toString(pause), Toast.LENGTH_SHORT).show();
        super.onPause();
    }
    @Override
    protected void onStop() {
        // la actividad ya no es visible para el usuario
        stop++;
        Toast.makeText(this, "OnStop #" + Integer.toString(stop), Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        //Se invoca cuando la actividad ha estado Detenida y está por volver a iniciarse
        restart++;
        Toast.makeText(this, "OnRestart #" + Integer.toString(restart), Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        // El sistema invoca esta devolución de llamada antes de que se elimine una actividad.
        destroy++;
        Toast.makeText(this, "OnDestroy #" + Integer.toString(destroy), Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}
