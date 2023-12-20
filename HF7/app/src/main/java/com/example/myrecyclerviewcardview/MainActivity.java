package com.example.myrecyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AnimalAdapter animalAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Animal> animalList = generateAnimalList();
        animalAdapter = new AnimalAdapter(animalList, this);
        recyclerView.setAdapter(animalAdapter);
    }
    private List<Animal> generateAnimalList() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Cat",  14,R.drawable.cat));

        animalList.add(new Animal("Disunion",  1,R.drawable.disznyo));

        animalList.add(new Animal("Dog",  10,R.drawable.dog));

        animalList.add(new Animal( "Giraffe",  30,R.drawable.giraffe));

        animalList.add(new Animal( "Horse",  25,R.drawable.horse));

        animalList.add(new Animal( "Lion",  10,R.drawable.lion));

        return animalList;
    }
}