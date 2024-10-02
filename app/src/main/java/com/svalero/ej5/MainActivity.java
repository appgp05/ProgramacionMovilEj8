package com.svalero.ej5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.svalero.beans.Usuario;
import com.svalero.datos.SeasData;

public class MainActivity extends AppCompatActivity {
    private EditText edtUser;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = findViewById(R.id.edtUsuario);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);

            btnEnviar.setOnClickListener((v) -> {
                Intent navegarEntrePantallas = new Intent(getBaseContext(), Pantalla2Activity.class);
//                navegarEntrePantallas.putExtra("USUARIO", edtUser.getText().toString());
                Usuario miUsuario = new Usuario();
                miUsuario.setEmail(edtUser.getText().toString());

                SeasData.setUsuario(miUsuario);

                startActivity(navegarEntrePantallas);
            });
    }
}