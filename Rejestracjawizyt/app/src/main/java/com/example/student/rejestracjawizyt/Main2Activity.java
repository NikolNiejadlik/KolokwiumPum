package com.example.student.rejestracjawizyt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.recyler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this); //jak tego nie ma to nie otwiera sie drugie okienko

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Lekarz> lekarze = new ArrayList<>();
        lekarze.add(new Lekarz("Jan Kowalski","dermatolog"));
        lekarze.add(new Lekarz("Anna Kowalska", "neurolog"));
        lekarze.add(new Lekarz("Maria Mózg", "psychiatra"));
        lekarze.add(new Lekarz("Aleksanda Konieczna", "psycholog"));

        LekarzAdapter lekarzAdapter = new LekarzAdapter(lekarze);
        recyclerView.setAdapter(lekarzAdapter);
    }
}
