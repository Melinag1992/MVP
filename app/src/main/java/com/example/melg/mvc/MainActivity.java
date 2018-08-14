package com.example.melg.mvc;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainActMVP.view {

    @BindView(R.id.name)
    TextView name_tv;

    @BindView(R.id.popup)
    Button popButton;

    @BindView(R.id.layout_background)
    ConstraintLayout background;

    Presenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates a new instance of presenter
        presenter = new Presenter(this);

        ButterKnife.bind(this);

        popButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calls presenter to click and change ui
                presenter.clickedPopButton();

            }
        });



    }

    @Override
    public void displayName() {
        // once the presenter -> view -> mainAct. You come back here to input your logic
        name_tv.setText("Mike");
        name_tv.setTextColor(getResources().getColor(R.color.whitey));
    }

    @Override
    public void changeBackgeround() {

        background.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

    }
}
