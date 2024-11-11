package ru.samsung.itschool.mdev.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText objectA, objectB, objectC;
    public TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonSolve(View view) {
        double a = Double.parseDouble(((EditText)findViewById(R.id.a)).getText().toString());
        double b = Double.parseDouble(((EditText)findViewById(R.id.b)).getText().toString());
        double c = Double.parseDouble(((EditText)findViewById(R.id.c)).getText().toString());
        TextView result = findViewById(R.id.res);
        result.setText(solveEquation(a, b, c));
    }

    private String solveEquation(double a, double b, double c) {
        if (a == 0 && b == 0) {
            return "any";
        }
        double d =  Math.sqrt((b * b) - (4 * a * c));
        if (d < 0) {
            return "none";
        }
        if (d >= 0) {
            if (a == 0) {
                return String.valueOf(-c / b);
            }
            double x1 = (-b - d)/(2*a);
            double x2 = (-b + d)/(2*a);
            return "" + x1 + "" + x2;
        }
        return "wrong";
    }
}