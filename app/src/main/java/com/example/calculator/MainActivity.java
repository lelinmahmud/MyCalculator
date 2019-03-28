package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView display;
    Button buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix,buttonSeven,buttonEight,buttonNine,buttonZero,buttonPlus,buttonMinus,buttonMulti,buttonDivided,buttonClear,buttonCe,buttonEqulas,buttonPoint;
    TextView resultShow;
    static double firstNumber;
    static double secondNumber;
    static String operation;
    static double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=findViewById(R.id.dispaly);
        buttonOne=findViewById(R.id.buttonOne);
        buttonCe=findViewById(R.id.buttonCl);
        buttonClear=findViewById(R.id.buttonClear);
        buttonDivided=findViewById(R.id.buttonDivided);
        buttonEight=findViewById(R.id.buttonEight);
        buttonEqulas=findViewById(R.id.buttonEqulas);
        buttonFive=findViewById(R.id.buttonFive);
        buttonFour=findViewById(R.id.buttonFour);
        buttonMinus=findViewById(R.id.buttonMinus);
        buttonMulti=findViewById(R.id.buttonMultiple);
        buttonNine=findViewById(R.id.buttonNine);
        buttonPlus=findViewById(R.id.buttonPlus);
        buttonSeven=findViewById(R.id.buttonSeven);
        buttonSix=findViewById(R.id.buttonSix);
        buttonThree=findViewById(R.id.buttonThree);
        buttonTwo=findViewById(R.id.buttonTwo);
        buttonZero=findViewById(R.id.buttonZero);
        buttonPoint=findViewById(R.id.buttonPoint);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonZero.setOnClickListener(this);
        buttonPoint.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonDivided.setOnClickListener(this);
        buttonEqulas.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonCe.setOnClickListener(this);









    }

    @Override
    public void onClick(View v) {

         String first;
         String last;



        if (v.getId()==R.id.buttonOne){
            display.append(buttonOne.getText());
        }
        if (v.getId()==R.id.buttonTwo){
            display.append(buttonTwo.getText());
        }
        if (v.getId()==R.id.buttonThree){
            display.append(buttonThree.getText());
        }
        if (v.getId()==R.id.buttonFour){
            display.append(buttonFour.getText());
        }
        if (v.getId()==R.id.buttonFive){
            display.append(buttonFive.getText());
        }
        if (v.getId()==R.id.buttonSix){
            display.append(buttonSix.getText());
        }
        if (v.getId()==R.id.buttonSeven){
            display.append(buttonSeven.getText());
        }
        if (v.getId()==R.id.buttonEight){
            display.append(buttonEight.getText());
        }
        if (v.getId()==R.id.buttonNine){
            display.append(buttonNine.getText());
        }
        if (v.getId()==R.id.buttonZero){
            display.append(buttonZero.getText());
        }
        if (v.getId()==R.id.buttonPoint){
            display.append(buttonPoint.getText());
        }
        if (v.getId()==R.id.buttonClear){
            try{
                String s=display.getText().toString();
                s=s.substring(0,s.length()-1);
                display.setText(s);
            }catch (Exception e){
                display.setText("");
            }
        }
        if (v.getId()==R.id.buttonCl){
            display.setText("");
        }
        if (v.getId()==R.id.buttonPlus){
            first=display.getText().toString();
            firstNumber=Double.parseDouble(first);
            display.setText("");
            operation=buttonPlus.getText().toString();

        }
        if (v.getId()==R.id.buttonMinus){
            first=display.getText().toString();
            firstNumber=Double.parseDouble(first);
            display.setText("");
            operation=buttonMinus.getText().toString();

        }
        if (v.getId()==R.id.buttonMultiple){
            first=display.getText().toString();
            firstNumber=Double.parseDouble(first);
            display.setText("");
            operation=buttonMulti.getText().toString();

        }
        if (v.getId()==R.id.buttonDivided){
            first=display.getText().toString();
            firstNumber=Double.parseDouble(first);
            display.setText("");
            operation=buttonDivided.getText().toString();

        }

        if (v.getId()==R.id.buttonEqulas){
           last=display.getText().toString();
           secondNumber=Double.parseDouble(last);
            switch (operation){
                case "+":
                    result=firstNumber+secondNumber;
                    display.setText(String.format("%s", result));
                    break;
                case "-":
                    result=firstNumber-secondNumber;
                    display.setText(String.format("%s", result));
                    break;
                case "*":
                   result=firstNumber*secondNumber;
                    display.setText(String.format("%s", result));
                    break;
                case "/":
                   result=firstNumber/secondNumber;
                    display.setText(String.format("%s", result));
                    break;
            }


        }

    }
}
