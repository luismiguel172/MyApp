package br.com.etecia.myapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.etecia.myapp.databinding.SplashLayoutBinding;

public class Splash_Activity extends AppCompatActivity {

    List<Filmes> filmesList;

    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        idRecyclerView = findViewById(R.id.idListadeFilmes);

        filmesList = new ArrayList<>();

        filmesList.add(
                new Filmes("desejos","Romance","Daora",R.drawable.desejos));
        new Filmes("dois mil e sessenta e sete","Ação","Daora",R.drawable.doismilesessetnaesete);
        new Filmes("medo profundo","Terror","Daora",R.drawable.medo);
        new Filmes("menina que matou os pais","Drama","Daora",R.drawable.menina);
        new Filmes("Ponta bala","Ação","Daora",R.drawable.pontabala);



        MyAdapter adapter = new MyAdapter(getApplicationContext(), filmesList);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);

    }}