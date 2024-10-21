package com.example.recycleviewdino.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewdino.DinosaurioDetalleActivity;
import com.example.recycleviewdino.R;
import com.example.recycleviewdino.models.Dinosaurio;

import java.util.List;

public class DinosaurioAdapter extends RecyclerView.Adapter<DinosaurioAdapter.DinosauroViewHolder> {
    private List<Dinosaurio>dinosauriosList;

    public DinosaurioAdapter(List<Dinosaurio>dinosaurioList){
        this.dinosauriosList = dinosaurioList;
    }

    @NonNull
    @Override
    public DinosaurioAdapter.DinosauroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdino, parent, false);
        return new DinosauroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DinosaurioAdapter.DinosauroViewHolder holder, int position) {
        holder.setData(dinosauriosList.get(position));

    }

    @Override
    public int getItemCount() {
        return dinosauriosList.size();
    }

    public class DinosauroViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtnombre,txttipo,txtdescrpicion;
        ImageView imagen;
        Dinosaurio dino;
        ConstraintLayout itemViewDino;
        public DinosauroViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre=itemView.findViewById(R.id.txtnombre);
            txttipo=itemView.findViewById(R.id.txttipo);
            txtdescrpicion=itemView.findViewById((R.id.txtdescripcion));
            itemViewDino = itemView.findViewById(R.id.itemViewDino);
            imagen = itemView.findViewById(R.id.imgdino);
            imagen.setOnClickListener(this);
        }

        public void setData(Dinosaurio dinosaurio) {
            dino = dinosaurio;
            txtnombre.setText(dino.getNombre());
            txttipo.setText(dino.getTipo());
            txtdescrpicion.setText(dino.getDescripcion());
            imagen.setImageResource(dino.getImagen());
            itemViewDino.setBackgroundColor(dino.getColor().toArgb());

        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), DinosaurioDetalleActivity.class);
            intent.putExtra("nombre", dino.getNombre());
            intent.putExtra("tipo", dino.getTipo());
            intent.putExtra("descripcion", dino.getDescripcion());
            intent.putExtra("imagen", dino.getImagen());
            view.getContext().startActivity(intent);
        }
    }
}
