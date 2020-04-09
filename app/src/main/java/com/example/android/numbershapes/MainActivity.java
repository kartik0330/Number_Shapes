package com.example.android.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{

        int number;

        public boolean isTriangular(){

            int x = 1;

            int triangularNumber = 1;

            while(triangularNumber < number){

                x++;

                triangularNumber = triangularNumber + x;

            }

            if(triangularNumber == number){

                return true;

            } else {

                return false;

            }

        }

        public boolean isSquare(){

            double squareRoot = Math.sqrt(number);

            if(squareRoot == Math.floor(squareRoot)){

                return true;

            }else{

                return false;

            }

        }

    }

    public void testNumber(View view){

        Log.i("Info", "Button Pressed!");

        EditText editText = (EditText) findViewById(R.id.editText);

        String message = editText.getText().toString();

        if(editText.getText().toString().isEmpty()){

            message += "Please enter a number.";

        }else {

            Number myNum = new Number();

            myNum.number = Integer.parseInt(editText.getText().toString());

            if (myNum.isSquare() && myNum.isTriangular()) {

                message += " is both triangular as well as square number";

            } else if (myNum.isTriangular()) {

                message += " is triangular but not square number";

            } else if (myNum.isSquare()) {

                message += " is square but not a triangular number";

            } else {

                message += " is neither of them";

            }
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
