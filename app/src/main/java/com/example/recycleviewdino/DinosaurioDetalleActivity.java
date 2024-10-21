package com.example.recycleviewdino;

import android.widget.TextView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DinosaurioDetalleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinosaurio_detalle);

        // Obtener referencias a los componentes del layout
        TextView txtNombre = findViewById(R.id.txtNombreDetalle);
        TextView txtTipo = findViewById(R.id.txtTipoDetalle);
        TextView txtDescripcion = findViewById(R.id.txtDescripcionDetalle);
        ImageView imgDino = findViewById(R.id.imgDinoDetalle);

        // Obtener los datos pasados desde el Intent
        String nombre = getIntent().getStringExtra("nombre");
        String tipo = getIntent().getStringExtra("tipo");
        String descripcion = getIntent().getStringExtra("descripcion");
        int imagen = getIntent().getIntExtra("imagen", 0);

        // Mostrar los datos en los componentes
        txtNombre.setText(nombre);
        txtTipo.setText(tipo);
        txtDescripcion.setText(descripcion);
        imgDino.setImageResource(imagen);
    }
}