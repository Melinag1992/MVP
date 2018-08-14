package com.example.melg.mvc;

public interface MainActMVP {

    // this interface will have all the methods needed to complete an action for the view and it's presenter.

    interface view{
        void displayName();

        void changeBackgeround();
    }
    interface presenter {
        void clickedPopButton();

    }
}
