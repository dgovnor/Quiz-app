package com.example.jutina.quizapp;



import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scores;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeMachine time = new timeMachine();
        time.countdowntimer.start();
        submitText();
        submitText2();
        submitText3();
        submitText4();
        submitText5();
        submitText6();
        submitText7();
    }
public class timeMachine{
    final TextView textview = (TextView) findViewById(R.id.time);
    CountDownTimer countdowntimer = new CountDownTimer(60 * 1000, 1000) {
        public void onTick(long millisUntilFinished) {
            long seconds = millisUntilFinished /1000;
            long minutes = (seconds%360)/60;
            seconds = seconds % 60;
            textview.setText(String.format("Time\n" +"%02d:%02d", minutes,seconds));
        }

        public void onFinish() {
            textview.setText("Time\n" + 0);
            ViewDialog alert = new ViewDialog();
            alert.showDialog(MainActivity.this, "Your time is up\n"+"Your score is: "+ scores);

        }


    };
}
    public void submitText(){
        final RadioGroup rg;
        final Button buttonDisplay;
        rg = (RadioGroup) findViewById(R.id.radQue1);
        buttonDisplay = (Button) findViewById(R.id.button1);
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get selected radio button from radioGroup
                int radio = rg.getCheckedRadioButtonId();
                //get the score view and update
                TextView score = (TextView) findViewById(R.id.score);
                //find the return value from the radio
                RadioButton rb = (RadioButton) findViewById(radio);
                RadioButton correctButton = (RadioButton) findViewById(R.id.Qu1ch2);
                if(rb == correctButton){
                    scores++;
                    score.setText("Score:\n"+scores);
                }
                if(rb != null){
                    buttonDisplay.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    //Button code for second question
    public void submitText2(){
        final Button buttonDisplay;
        buttonDisplay = (Button) findViewById(R.id.buttonCheck);
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the checked boxes
                CheckBox isexecutive = (CheckBox) findViewById(R.id.executive_select);
                CheckBox isstate = (CheckBox) findViewById(R.id.state);
                CheckBox isLegislature = (CheckBox) findViewById(R.id.legislature);
                CheckBox isJudiciary = (CheckBox) findViewById(R.id.judiciary);
                //check selected boxes
                boolean isexe = isexecutive.isChecked();
                boolean issta = isstate.isChecked();
                boolean isleg = isLegislature.isChecked();
                boolean isjud = isJudiciary.isChecked();
                //get the score view and update
                TextView score = (TextView) findViewById(R.id.score);
                //find the return value from the radio

                //check if the button selected was the right one
                if(isexe && isjud && isleg ){
                    scores++;
                    score.setText("Score:\n"+scores);
                }
                //make button invisible when selected to avoid another selection
                if(isexe || isjud || isleg || issta){
                    buttonDisplay.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
    //Button code for second question
    public void submitText3(){
        final RadioGroup rg;
        final Button buttonDisplay;
        rg = (RadioGroup) findViewById(R.id.radQue2);
        buttonDisplay = (Button) findViewById(R.id.button2);
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get selected radio button from radioGroup
                int radio = rg.getCheckedRadioButtonId();
                //get the score view and update
                TextView score = (TextView) findViewById(R.id.score);
                //find the return value from the radio
                RadioButton rb = (RadioButton) findViewById(radio);
                RadioButton correctButton = (RadioButton) findViewById(R.id.Qu2ch2);
                //check if the button selected was the right one
                if(rb == correctButton){
                    scores++;
                    score.setText("Score:\n"+scores);
                }
                //make button invisible when selected to avoid another selection
                if(rb != null){
                    buttonDisplay.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
    //Button code for third question
    public void submitText4(){
        final RadioGroup rg;
        final Button buttonDisplay;
        rg = (RadioGroup) findViewById(R.id.radQue3);
        buttonDisplay = (Button) findViewById(R.id.button3);
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get selected radio button from radioGroup
                int radio = rg.getCheckedRadioButtonId();
                //get the score view and update
                TextView score = (TextView) findViewById(R.id.score);
                //find the return value from the radio
                RadioButton rb = (RadioButton) findViewById(radio);
                RadioButton correctButton = (RadioButton) findViewById(R.id.Qu3ch3);
                //check if the button selected was the right one
                if(rb == correctButton){
                    scores++;
                    score.setText("Score:\n"+scores);
                }
                //make button invisible when selected to avoid another selection
                if(rb != null){
                    buttonDisplay.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
    //button onclick for button 5
    public void submitText5(){
        final Button buttonDisplay;
        buttonDisplay = (Button) findViewById(R.id.buttonedit);
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get score view
                TextView score = (TextView) findViewById(R.id.score);
                //get submitted word from user
                EditText edit = (EditText) findViewById(R.id.name_view);
                String name = edit.getText().toString().toLowerCase();
                if(name.equals("october")){
                    scores++;
                    score.setText("Score:\n"+scores);
                }
                if(!name.isEmpty() && name.length() > 3){
                    buttonDisplay.setVisibility(View.INVISIBLE);
                }

                //update score if word is correct
            }
        });
    }
    //Button code for sixth question
    public void submitText6(){
        final RadioGroup rg;
        final Button buttonDisplay;
        rg = (RadioGroup) findViewById(R.id.radQue4);
        buttonDisplay = (Button) findViewById(R.id.button4);
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get selected radio button from radioGroup
                int radio = rg.getCheckedRadioButtonId();
                //get the score view and update
                TextView score = (TextView) findViewById(R.id.score);
                //find the return value from the radio
                RadioButton rb = (RadioButton) findViewById(radio);
                RadioButton correctButton = (RadioButton) findViewById(R.id.Qu4ch2);
                //check if the button selected was the right one
                if(rb == correctButton){
                    scores++;
                    score.setText("Score:\n"+scores);
                }
                //make button invisible when selected to avoid another selection
                if(rb != null){
                    buttonDisplay.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
    //Button code for seventh question
    public void submitText7(){
        final RadioGroup rg;
        final Button buttonDisplay;
        rg = (RadioGroup) findViewById(R.id.radQue5);
        buttonDisplay = (Button) findViewById(R.id.button5);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get selected radio button from radioGroup
                int radio = rg.getCheckedRadioButtonId();
                //get the score view and update
                TextView score = (TextView) findViewById(R.id.score);
                //find the return value from the radio
                RadioButton rb = (RadioButton) findViewById(radio);
                RadioButton correctButton = (RadioButton) findViewById(R.id.Qu5ch4);
                //check if the button selected was the right one
                if(rb == correctButton){
                    scores++;
                    score.setText("Score:\n"+scores);
                }
                //dialog box for the Message
                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(MainActivity.this, "Your score is: " + scores);

            }
        });
    }
}





