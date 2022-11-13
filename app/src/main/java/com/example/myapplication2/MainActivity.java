package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String [] mammal = {"Humans","Whale","Dolphin","Bat","Sheep","Goat"};
    String [] bird = {"hen","pegion","eagle","sparrow","parrot","crow"};
    String [] reptile = {"Turtle","Crocodilian","Lizard","Snake","Alligators","Dinosaur"};
    Button btnM, btnB, btnR;
    TextView textView, textViewQ, textViewR;
    int correctAns=0,wrongAns=0,index=0;
    String answer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        textViewQ=findViewById(R.id.textViewQ);
        btnM=findViewById(R.id.btnMammal);
        btnM.setOnClickListener(this);
        btnB=findViewById(R.id.btnBird);
        btnB.setOnClickListener(this);
        btnR=findViewById(R.id.btnReptile);
        btnR.setOnClickListener(this);
        textViewR=findViewById(R.id.textViewResult);
        GenerateRandom();
    }
    private void GenerateRandom(){
        Random rnd=new Random();
        int number=rnd.nextInt(3);
        if (number==0){
            index = rnd.nextInt(mammal.length);
            textViewQ.setText(mammal[index]);
            answer = "MAMMAL";
        } else if (number ==1){
            index=rnd.nextInt(bird.length);
            textViewQ.setText(bird[index]);
            answer="BIRD";
        }else if (number ==2){
            index = rnd.nextInt(reptile.length);
            textViewQ.setText(reptile[index]);
            answer = "REPTILE";
        }
    }
    @Override public void onClick(View view){
        switch (view.getId()){

            case R.id.btnMammal:
                if (answer == "MAMMAL") {
                    correctAns++;
                } else {
                    wrongAns++;
                }
                textViewR.setText("RESULTS \nRight " + correctAns + "\nWrong " + wrongAns);
                break;

            case R.id.btnBird:
                if(answer=="BIRDS"){
                    correctAns++;
                } else{
                    wrongAns++;
                }
                textViewR.setText("RESULTS \nRight " + correctAns + "\nWrong " + wrongAns);
                break;

            case R.id.btnReptile:
                if (answer == "REPTILE") {
                    correctAns++;
                } else {
                    wrongAns++;
                }
                textViewR.setText("RESULTS \nRight " + correctAns + "\nWrong " + wrongAns);
                break;
        }
        GenerateRandom();
    }
}