package com.example.filmhub;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class CommentReviewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate (Bundle savedInstance ){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_review_commentaire);
        recyclerView = (RecyclerView) findViewById(R.id.CommentReviewRecyclerView);

        ArrayList<String> commentaires = new ArrayList<>();
        commentaires.add("Commentaire 1");
        commentaires.add("Commentaire 2");
        commentaires.add("Commentaire 3");
        commentaires.add("Commentaire 4");
        commentaires.add("Commentaire 1");
        commentaires.add("Commentaire 2");
        commentaires.add("Commentaire 3");
        commentaires.add("Commentaire 4");
        commentaires.add("Commentaire 1");
        commentaires.add("Commentaire 2");
        commentaires.add("Commentaire 3");
        commentaires.add("Commentaire 4");
        commentaires.add("Commentaire 1");
        commentaires.add("Commentaire 2");
        commentaires.add("Commentaire 3");
        commentaires.add("Commentaire 4");


        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        //recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        adapter = new CommentaireAdapter(commentaires);
        recyclerView.setAdapter(adapter);

    }
}

