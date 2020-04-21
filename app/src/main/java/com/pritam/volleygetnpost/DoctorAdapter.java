package com.pritam.volleygetnpost;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.DoctorViewHolder> {

    private Context ctx;
    private List<Doctor> doctorList;

    public DoctorAdapter(Context ctx, List<Doctor> doctorList) {
        this.ctx = ctx;
        this.doctorList = doctorList;
    }

    @NonNull
    @Override
    public DoctorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.list_layout, null);
        DoctorViewHolder holder = new DoctorViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorViewHolder holder, int position) {
        Doctor doctor = doctorList.get(position);
        holder.textViewName.setText(doctor.getName());
        holder.textViewHospital.setText(doctor.getHospital());
        holder.textViewRating.setText(String.valueOf(doctor.getRating()));
        holder.textViewVisit.setText(String.valueOf(doctor.getVisit()));
        holder.imageView.setImageDrawable(ctx.getResources().getDrawable(doctor.getImage()));
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }

    class DoctorViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewName, textViewHospital, textViewRating, textViewVisit;

        public DoctorViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewHospital = itemView.findViewById(R.id.textViewHospital);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewVisit = itemView.findViewById(R.id.textViewVisit);
        }
    }

}
