package com.pritam.volleygetnpost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DoctorAdapter adapter;

    List<Doctor> doctorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doctorList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //adding some items to our list
        doctorList.add(
                new Doctor(
                        1,
                        "Dr. Tonmoy Chowdhury",
                        "Max Hospital & Diagnostic Center",
                        4.3,
                        700,
                        R.drawable.he));

        doctorList.add(
                new Doctor(
                        1,
                        "Dr. Mehedi Hasan",
                        "Chattogram General Hospital",
                        4.3,
                        350,
                        R.drawable.he));

        doctorList.add(
                new Doctor(
                        1,
                        "Dr. Ema Dhar",
                        "Sensive Hospital",
                        4.3,
                        400,
                        R.drawable.she));


        adapter = new DoctorAdapter(this, doctorList);
        recyclerView.setAdapter(adapter);
    }

}
