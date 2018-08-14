package com.example.melg.mvc;

import android.support.v7.app.AppCompatActivity;

public class Presenter implements MainActMVP.presenter{

    private final MainActMVP.view view;

    public Presenter (MainActMVP.view view){
        this.view = view;
    }


    @Override
    public void clickedPopButton() {
        // we call the view to input logic - we used the view because it's changing the view appearance
        view.displayName();
        view.changeBackgeround();

    }
}
