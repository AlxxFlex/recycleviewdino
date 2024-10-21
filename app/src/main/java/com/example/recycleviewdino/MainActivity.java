package com.example.recycleviewdino;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewdino.adapter.DinosaurioAdapter;
import com.example.recycleviewdino.models.Dinosaurio;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerDino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerDino = findViewById(R.id.recyclerView);
        List<Dinosaurio> dinosauriosList=new ArrayList<>();

        Color color1 = Color.valueOf(173, 216, 230);
        Color color2 = Color.valueOf(152, 251, 152);
        Color color3 = Color.valueOf(255, 182, 193);
        Color color4 = Color.valueOf(250, 250, 210);
        Color color5 = Color.valueOf(221, 160, 221);
        Color color6 = Color.valueOf(255, 222, 173);
        Color color7 = Color.valueOf(135, 206, 250);
        Color color8 = Color.valueOf(255, 160, 122);
        Color color9 = Color.valueOf(144, 238, 144);
        Color color10 = Color.valueOf(255, 228, 225);



        // Aquí crear color y pasarselo en la lista

        dinosauriosList.add(new Dinosaurio("T-Rex", "Carnívoro", "Muy feroz, rawr", color1, R.drawable.trex));
        dinosauriosList.add(new Dinosaurio("Triceratops", "Herbívoro", "Tiene tres cuernos y es amigable", color2, R.drawable.triceratops));
        dinosauriosList.add(new Dinosaurio("Velociraptor", "Carnívoro", "Rápido y ágil, caza en grupo", color3, R.drawable.velociraptor));
        dinosauriosList.add(new Dinosaurio("Brachiosaurus", "Herbívoro", "Cuello largo para alcanzar las copas de los árboles", color4, R.drawable.brachiosaurus));
        dinosauriosList.add(new Dinosaurio("Ankylosaurus", "Herbívoro", "Tiene una armadura dura y una cola con un mazo", color5, R.drawable.ankylosaurus));
        dinosauriosList.add(new Dinosaurio("Spinosaurus", "Carnívoro", "Gran espina en la espalda, caza en el agua", color6, R.drawable.spinosaurus));
        dinosauriosList.add(new Dinosaurio("Stegosaurus", "Herbívoro", "Tiene placas en la espalda y una cola con púas", color7, R.drawable.stegosaurus));
        dinosauriosList.add(new Dinosaurio("Parasaurolophus", "Herbívoro", "Tiene una cresta en la cabeza para hacer sonidos", color8, R.drawable.parasaurolophus));
        dinosauriosList.add(new Dinosaurio("Allosaurus", "Carnívoro", "Depredador feroz similar al T-Rex, pero más pequeño", color9, R.drawable.allosaurus));
        dinosauriosList.add(new Dinosaurio("Diplodocus", "Herbívoro", "Uno de los dinosaurios más largos, con un cuello y una cola extensos", color10, R.drawable.diplodocus));


        DinosaurioAdapter adapter=new DinosaurioAdapter(dinosauriosList);
        recyclerDino.setAdapter(adapter);
        recyclerDino.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerDino.setHasFixedSize(true);
    }
}
