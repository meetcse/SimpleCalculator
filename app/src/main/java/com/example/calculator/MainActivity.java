package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;


public class MainActivity extends AppCompatActivity {

    TextView expression;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.clearAll);
        expression = findViewById(R.id.mathsFormula);
    }


    public void buttonEqualsPressed(View view) {
        String exp = expression.getText().toString();
        Expression e = new Expression(exp);

        String res = String.valueOf(e.calculate());
//        result.setText(res);

        expression.setText(res);
    }


    public void buttonPressed(View view) {
        switch (view.getId()) {
            case R.id.zero: {
                String formula = expression.getText().toString();
                formula = formula + "0";
                expression.setText(formula);
                break;
            }
            case R.id.one: {
                String formula = expression.getText().toString();
                formula = formula + "1";
                expression.setText(formula);
                break;
            }
            case R.id.two: {
                String formula = expression.getText().toString();
                formula = formula + "2";
                expression.setText(formula);
                break;
            }
            case R.id.three: {
                String formula = expression.getText().toString();
                formula = formula + "3";
                expression.setText(formula);
                break;
            }
            case R.id.four: {
                String formula = expression.getText().toString();
                formula = formula + "4";
                expression.setText(formula);
                break;
            }
            case R.id.five: {
                String formula = expression.getText().toString();
                formula = formula + "5";
                expression.setText(formula);
                break;
            }
            case R.id.six: {
                String formula = expression.getText().toString();
                formula = formula + "6";
                expression.setText(formula);
                break;
            }
            case R.id.seven: {
                String formula = expression.getText().toString();
                formula = formula + "7";
                expression.setText(formula);
                break;
            }
            case R.id.eight: {
                String formula = expression.getText().toString();
                formula = formula + "8";
                expression.setText(formula);
                break;
            }
            case R.id.nine: {
                String formula = expression.getText().toString();
                formula = formula + "9";
                expression.setText(formula);
                break;
            }
            case R.id.dot: {
                String formula = expression.getText().toString();
                formula = formula + ".";
                expression.setText(formula);
                break;
            }
            case R.id.plus: {
                String formula = expression.getText().toString();
                formula = formula + "+";
                expression.setText(formula);
                break;
            }
            case R.id.minus: {
                String formula = expression.getText().toString();
                formula = formula + "-";
                expression.setText(formula);
                break;
            }
            case R.id.multiply: {
                String formula = expression.getText().toString();
                formula = formula + "*";
                expression.setText(formula);
                break;
            }
            case R.id.divide: {
                String formula = expression.getText().toString();
                formula = formula + "/";
                expression.setText(formula);
                break;
            }
            case R.id.clearAll: {
                expression.setText("");

                break;
            }

        }
    }
}
