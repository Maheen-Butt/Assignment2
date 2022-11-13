package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    String [] mammal = {"Humans","Whale","Dolphin","Bat","Sheep","Goat"};
    String [] bird = {"hen","pigion","eagle","sparrow","parrot","crow"};
    String [] reptile = {"Turtle","Crocodilian","Lizard","Snake","Alligators","Dinosaur"};

    Button btnM, btnB, btnR;

    TextView textView1, textView2;
    int correctAns=0,wrongAns=0,index=0, catagory=0, range=0;
    String answer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1 = findViewById(R.id.textViewQ);
        btnM = findViewById(R.id.btnMammal);
        btnB = findViewById(R.id.btnBird);
        btnR = findViewById(R.id.btnReptile);
        textView2 = findViewById(R.id.textViewResult);

        GenerateLetter();
    }
    public void GenerateLetter() {
        Random rnd = new Random();
        catagory = rnd.nextInt(3);
        if (catagory ==0){
            index = rnd.nextInt(mammal.length);
            textView1.setText(mammal[index]);
            answer = "MAMMAL";
        } else if (catagory ==1){
            index = rnd.nextInt(bird.length);
            textView1.setText(bird[index]);
            answer = "BIRD";
        }else if (catagory ==2){
            index = rnd.nextInt(reptile.length);
            textView1.setText(reptile[index]);
            answer = "REPTILE";
        }
    btnM.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(answer=="MAMMAL"){
                correctAns++;
            }else {
                wrongAns++;
            }
            textView2.setText("RESULT\n Right :"+correctAns+"\n Wrong :"+wrongAns);
            GenerateLetter();
        }
    });
    btnB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(answer=="BIRD"){
                correctAns++;
            }else {
                wrongAns++;
            }
            textView2.setText("RESULT\n Right :"+correctAns+"\n Wrong :"+wrongAns);
            GenerateLetter();
        }
    });
    btnR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(answer=="REPTILE"){
                correctAns++;
            }else {
                wrongAns++;
            }
            textView2.setText("RESULT\n Right :"+correctAns+"\n Wrong :"+wrongAns);
            GenerateLetter();
        }
    });
    }
}