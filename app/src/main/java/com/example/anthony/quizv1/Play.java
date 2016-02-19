package com.example.anthony.quizv1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Play extends AppCompatActivity implements TextFrag.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_fragment_container,TextFrag.newInstance(null, null, null, null))
                    .addToBackStack(null)
                    .commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri)
    {

    }

}
