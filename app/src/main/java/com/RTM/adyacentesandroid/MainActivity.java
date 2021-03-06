package com.RTM.adyacentesandroid;

import static android.graphics.Color.rgb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button ccBtnNE,ccBtnNO,ccBtnSE,ccBtnSO;
private TextView resultado;
private int estadoNE=0,estadoNO=0,estadoSE=0,estadoSO=0,puntos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ccBtnNE = findViewById(R.id.btnNE);
        ccBtnNO = findViewById(R.id. btnNO);
        ccBtnSE = findViewById(R.id.btnSE);
        ccBtnSO = findViewById(R.id.btnSO);
        resultado = findViewById(R.id.tvRes);
    }

    public void clickNO(View view) {
        estadoNO=CambiarCelda(ccBtnNO,estadoNO);
        estadoNE=CambiarCelda(ccBtnNE,estadoNE);
        estadoSO=CambiarCelda(ccBtnSO,estadoSO);
        verifier_win(view);
    }

    public void clickNE(View view) {
        estadoNO=CambiarCelda(ccBtnNO,estadoNO);
        estadoNE=CambiarCelda(ccBtnNE,estadoNE);
        estadoSE=CambiarCelda(ccBtnSE,estadoSE);
        verifier_win(view);
    }

    public void clickSO(View view) {
        estadoNO=CambiarCelda(ccBtnNO,estadoNO);
        estadoSE=CambiarCelda(ccBtnSE,estadoSE);
        estadoSO=CambiarCelda(ccBtnSO,estadoSO);
        verifier_win(view);
    }

    public void clickSE(View view) {
        estadoSE=CambiarCelda(ccBtnSE,estadoSE);
        estadoNE=CambiarCelda(ccBtnNE,estadoNE);
        estadoSO=CambiarCelda(ccBtnSO,estadoSO);
        verifier_win(view);
    }
    private int CambiarCelda(Button btnCambiar,int estado){
        if (estado==1) {
            estado=0;
            btnCambiar.setBackgroundColor(rgb(112, 184, 199));
        }else{
            estado=1;
            btnCambiar.setBackgroundColor(rgb(134, 112, 199));
        }
        return estado;
    }
    private void verifier_win(View view){
        if ((estadoSO==estadoNE) && (estadoSO == estadoNO) && (estadoSO == estadoSE)){
            Toast notificacion= Toast.makeText(this,"Muy bien, GANASTE!!",Toast.LENGTH_LONG);
            notificacion.show();
            Toast notificacion2= Toast.makeText(resultado.getContext(), "OTRO PUNTITO!!",Toast.LENGTH_LONG);

            notificacion2.show();
            puntos++;
            resultado.setText(String.valueOf(puntos));
        }
    }

}