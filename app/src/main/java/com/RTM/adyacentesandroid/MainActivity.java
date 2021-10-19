package com.RTM.adyacentesandroid;

import static android.graphics.Color.*;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button ccBtnNE,ccBtnNO,ccBtnSE,ccBtnSO;
private int estadoNE=0,estadoNO=0,estadoSE=0,estadoSO=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ccBtnNE = findViewById(R.id.btnNE);
        ccBtnNO = findViewById(R.id. btnNO);
        ccBtnSE = findViewById(R.id.btnSE);
        ccBtnSO = findViewById(R.id.btnSO);
    }

    public void clickNO(View view) {
        estadoNO=CambiarCelda(ccBtnNO,estadoNO);
        estadoNE=CambiarCelda(ccBtnNE,estadoNE);
        estadoSO=CambiarCelda(ccBtnSO,estadoSO);
    }

    public void clickNE(View view) {
        estadoNO=CambiarCelda(ccBtnNO,estadoNO);
        estadoNE=CambiarCelda(ccBtnNE,estadoNE);
        estadoSE=CambiarCelda(ccBtnSE,estadoSE);
    }

    public void clickSO(View view) {
        estadoNO=CambiarCelda(ccBtnNO,estadoNO);
        estadoSE=CambiarCelda(ccBtnSE,estadoSE);
        estadoSO=CambiarCelda(ccBtnSO,estadoSO);
    }

    public void clickSE(View view) {
        estadoSE=CambiarCelda(ccBtnSE,estadoSE);
        estadoNE=CambiarCelda(ccBtnNE,estadoNE);
        estadoSO=CambiarCelda(ccBtnSO,estadoSO);
    }
    private int CambiarCelda(Button btnCambiar,int estado){
        if (estado==1) {
            estado=0;
            btnCambiar.setBackgroundColor(rgb(155, 50, 50));
        }else{
            estado=1;
            btnCambiar.setBackgroundColor(rgb(155, 155, 155));
        }
        return estado;
    }


}