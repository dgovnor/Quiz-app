package com.example.jutina.quizapp;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int scores;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_Question();
        third_Question();
        fourth_Qustion();
        fifth_Question();
        sixth_Question();
        seventh_Question();
    }
    //Method for first question
    public void first_Question(){
        final RadioGroup rg;
        rg = (RadioGroup) findViewById(R.id.radQue1);
                //get selected radio button from radioGroup
            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    //get all the radioButton
                    RadioButton rb1=(RadioButton) findViewById(R.id.Qu1ch1);
                    RadioButton rb2=(RadioButton) findViewById(R.id.Qu1ch2);
                    RadioButton rb3=(RadioButton) findViewById(R.id.Qu1ch3);
                    RadioButton rb4=(RadioButton) findViewById(R.id.Qu1ch4);
                    //find the return value from the radio
                    RadioButton rb = (RadioButton) findViewById(checkedId);
                    if(rb == rb2){
                        scores = scores + 100;
                        Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                        rb1.setEnabled(false);
                        rb2.setEnabled(false);
                        rb3.setEnabled(false);
                        rb4.setEnabled(false);
                    }
                    else{
                        rb1.setEnabled(false);
                        rb2.setEnabled(false);
                        rb3.setEnabled(false);
                        rb4.setEnabled(false);
                        Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_LONG).show();

                    }
                }
            });
            }
    //Method code for second question
    public void checkBox(View view){
        boolean checked = ((CheckBox)view).isChecked();
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
                //check if the button selected was the right one
                if(isexe==checked && isjud==checked && isleg==checked ){
                    scores = scores + 100;
                    Toast.makeText(this, "Correct", Toast.LENGTH_LONG).show();
                    isexecutive.setEnabled(false);
                    isstate.setEnabled(false);
                    isLegislature.setEnabled(false);
                    isJudiciary.setEnabled(false);
                }
    }
    //method code for second question
    public void third_Question(){
        final RadioGroup rg;
        rg = (RadioGroup) findViewById(R.id.radQue2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //get all the radioButton
                RadioButton rb1=(RadioButton) findViewById(R.id.Qu2ch1);
                RadioButton rb2=(RadioButton) findViewById(R.id.Qu2ch2);
                RadioButton rb3=(RadioButton) findViewById(R.id.Qu2ch3);
                RadioButton rb4=(RadioButton) findViewById(R.id.Qu2ch4);
                //find the return value from the radio
                RadioButton rb = (RadioButton) findViewById(checkedId);
                //check if the button selected was the right one
                if(rb == rb2){
                    scores = scores + 100;
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    rb1.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                else{
                    rb1.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    //Method code for fourth question
    public void fourth_Qustion(){
        final RadioGroup rg;
        //Get the radio group id
        rg = (RadioGroup) findViewById(R.id.radQue3);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //get all the radioButton
                RadioButton rb1=(RadioButton) findViewById(R.id.Qu3ch1);
                RadioButton rb2=(RadioButton) findViewById(R.id.Qu3ch2);
                RadioButton rb3=(RadioButton) findViewById(R.id.Qu3ch3);
                RadioButton rb4=(RadioButton) findViewById(R.id.Qu3ch4);
                //find the return value from the radio
                RadioButton rb = (RadioButton) findViewById(checkedId);
                //check if the button selected was the right one
                if(rb == rb3){
                    scores = scores + 100;
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    rb1.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                else{
                    rb1.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    //Method code  for question 5
    public void fifth_Question(){
                //get submitted word from user
                final EditText edit = (EditText) findViewById(R.id.name_view);
                edit.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        //Noting
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        //get editable and convert it to string and to lowercase
                        String name = s.toString().toLowerCase();
                        if(name.equals("october") && name.length() > 3){
                            scores = scores+100;
                            Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                            edit.setFocusable(false);
                        }
                    }
                });
    }
    //Button code for sixth question
    public void sixth_Question(){
        final RadioGroup rg;
        rg = (RadioGroup) findViewById(R.id.radQue4);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //get all the radioButton
                RadioButton rb1=(RadioButton) findViewById(R.id.Qu4ch1);
                RadioButton rb2=(RadioButton) findViewById(R.id.Qu4ch2);
                RadioButton rb3=(RadioButton) findViewById(R.id.Qu4ch3);
                RadioButton rb4=(RadioButton) findViewById(R.id.Qu4ch4);
                //find the return value from the radio
                RadioButton rb = (RadioButton) findViewById(checkedId);
                //check if the button selected was the right one
                if(rb == rb2){
                    scores = scores+100;
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    rb1.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                else{
                    rb1.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    //Button code for seventh question
    public void seventh_Question(){
        final RadioGroup rg;
        rg = (RadioGroup) findViewById(R.id.radQue5);
                //get selected radio button from radioGroup
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //get all the radioButton
                RadioButton rb1=(RadioButton) findViewById(R.id.Qu5ch1);
                RadioButton rb2=(RadioButton) findViewById(R.id.Qu5ch2);
                RadioButton rb3=(RadioButton) findViewById(R.id.Qu5ch3);
                RadioButton rb4=(RadioButton) findViewById(R.id.Qu5ch4);
                //find the return value from the radio
                RadioButton rb = (RadioButton) findViewById(checkedId);
                //check if the button selected was the right one
                if(rb == rb4){
                    scores = scores + 100;
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    rb1.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                else{
                    rb1.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    public void submitButton(View view){
        Toast.makeText(this, "Your score is:" + scores, Toast.LENGTH_LONG).show();
        Handler handler;
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }
}





