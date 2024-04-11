package isisur.cl.prueba1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private View layautPrincipal, layautSecundario, layautCentral;
    private TextView TextTomate;

    private Button BotonPalta, BotonPepino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        layautPrincipal=findViewById(R.id.ID_Palta);
        layautSecundario=findViewById(R.id.ID_Pepino);
        layautCentral= findViewById(R.id.ID_Central);
        TextTomate= findViewById(R.id.ID_Tomate);



        BotonPalta=findViewById(R.id.button);
        BotonPepino=findViewById(R.id.button2);

        BotonPalta.setOnClickListener(view -> {
            cambiarColor(Color.parseColor("#26A11E"),"Palta", Color.parseColor("#4CAF50"));

        });

        BotonPepino.setOnClickListener(view -> {
            cambiarColor(Color.parseColor("#045E12"),"Pepino",Color.parseColor("#AF11AC"));
        });

    }

    private void cambiarColor(int colorFondo, String nuevoTexto, int colorCentral){
        layautPrincipal.setBackgroundColor(colorFondo);
        layautSecundario.setBackgroundColor(colorFondo);
        layautCentral.setBackgroundColor(colorCentral);
        TextTomate.setText(nuevoTexto);
    }
}