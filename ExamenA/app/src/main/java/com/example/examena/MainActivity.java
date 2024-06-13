package com.example.examena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTN;
    Button btnGenerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencias a las vistas con findViewById
        editTN = findViewById(R.id.editTN);
        btnGenerar = findViewById(R.id.btnGenerar);

        //define la acción que se realizará cuando se haga clic en el botón
        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroStr = editTN.getText().toString();  //obtiene el texto ingresado y lo convierte a una cadena
                if (!numeroStr.isEmpty()) {
                    int numero = Integer.parseInt(numeroStr); //Convierte la cadena a un enter
                    if (numero > 0) {
                        Intent intent = new Intent(MainActivity.this, Activity_generada.class);
                        intent.putExtra("numero", numero);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}
