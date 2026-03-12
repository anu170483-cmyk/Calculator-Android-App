package com.example.calculator_app;

import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView display, expression;
    double num1 = 0;
    double num2 = 0;
    String operator = "";
    int maxLength = 30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
        expression = findViewById(R.id.expression);

        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("0");

        }
        });

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("1");}
        });

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("2");}
        });

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("3");}
        });

        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("4");}
        });

        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("5");}
        });

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("6");}
        });

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("7");}
        });

        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("8");}
        });

        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(v -> {
            if(display.getText().length() < maxLength){
            display.append("9");}
        });

        Button btnDot = findViewById(R.id.btnDot);
        btnDot.setOnClickListener(v -> {

            String text = display.getText().toString();

            if(text.isEmpty()){
                display.append("0.");
                return;
            }

            String[] parts = text.split(" ");

            if(parts.length == 1){
                if(!parts[0].contains(".")){
                    display.append(".");
                }
            }
            else if(parts.length == 3){
                if(!parts[2].contains(".")){
                    display.append(".");
                }
            }
        });


        Button AllClear = findViewById(R.id.btnAc);
        AllClear.setOnClickListener(v -> {
            display.setText("");
        });

        Button clear = findViewById(R.id.btnClear);
        clear.setOnClickListener(v -> {

            String text = display.getText().toString();

            if (!text.isEmpty()) {
                display.setText(text.substring(0, text.length() - 1));
            }
        });

        Button plus = findViewById(R.id.btnPlus);
        plus.setOnClickListener(v -> {

            String text = display.getText().toString();
            if(text.isEmpty()) return;

            String[] parts = text.split(" ");

            if(parts.length == 1){
                num1 = Double.parseDouble(parts[0]);
            }
            else if(parts.length == 3){
                double num2 = Double.parseDouble(parts[2]);

                switch(operator){
                    case "+":
                        num1 = num1 + num2;
                        break;
                    case "-":
                        num1 = num1 - num2;
                        break;
                    case "*":
                        num1 = num1 * num2;
                        break;
                    case "/":
                        num1 = num1 / num2;
                        break;
                    case "%":
                        num1 = num1 % num2;
                        break;
                }
            }

            operator = "+";
            if(num1 == (int) num1){
                display.setText((int)num1 + " + ");
            }else{
                display.setText(num1 + " + ");
            }
        });

        Button minus = findViewById(R.id.btnMinus);
        minus.setOnClickListener(v -> {

            String text = display.getText().toString();
            if(text.isEmpty()) return;

            String[] parts = text.split(" ");

            if(parts.length == 1){
                num1 = Double.parseDouble(parts[0]);
            }
            else if(parts.length == 3){
                double num2 = Double.parseDouble(parts[2]);

                switch(operator){
                    case "+":
                        num1 = num1 + num2;
                        break;
                    case "-":
                        num1 = num1 - num2;
                        break;
                    case "*":
                        num1 = num1 * num2;
                        break;
                    case "/":
                        num1 = num1 / num2;
                        break;
                    case "%":
                        num1 = num1 % num2;
                        break;
                }
            }

            operator = "-";
            if(num1 == (int) num1){
                display.setText((int)num1 + " - ");
            }else{
                display.setText(num1 + " - ");
            }
        });

        Button multi = findViewById(R.id.btnMultiply);
        multi.setOnClickListener(v -> {

            String text = display.getText().toString();
            if(text.isEmpty()) return;

            String[] parts = text.split(" ");

            if(parts.length == 1){
                num1 = Double.parseDouble(parts[0]);
            }
            else if(parts.length == 3){
                double num2 = Double.parseDouble(parts[2]);

                switch(operator){
                    case "+":
                        num1 = num1 + num2;
                        break;
                    case "-":
                        num1 = num1 - num2;
                        break;
                    case "*":
                        num1 = num1 * num2;
                        break;
                    case "/":
                        num1 = num1 / num2;
                        break;
                    case "%":
                        num1 = num1 % num2;
                        break;
                }
            }

            operator = "*";
            if(num1 == (int) num1){
                display.setText((int)num1 + " * ");
            }else{
                display.setText(num1 + " * ");
            }
        });

        Button divide = findViewById(R.id.btnDivide);
        divide.setOnClickListener(v -> {

            String text = display.getText().toString();
            if(text.isEmpty()) return;

            String[] parts = text.split(" ");

            if(parts.length == 1){
                num1 = Double.parseDouble(parts[0]);
            }
            else if(parts.length == 3){
                double num2 = Double.parseDouble(parts[2]);

                switch(operator){
                    case "+":
                        num1 = num1 + num2;
                        break;
                    case "-":
                        num1 = num1 - num2;
                        break;
                    case "*":
                        num1 = num1 * num2;
                        break;
                    case "/":
                        num1 = num1 / num2;
                        break;
                    case "%":
                        num1 = num1 % num2;
                        break;
                }
            }

            operator = "/";
            if(num1 == (int) num1){
                display.setText((int)num1 + " / ");
            }else{
                display.setText(num1 + " / ");
            }
        });

        Button mod = findViewById(R.id.btnMod);
        mod.setOnClickListener(v -> {

            String text = display.getText().toString();
            if(text.isEmpty()) return;

            String[] parts = text.split(" ");

            if(parts.length == 1){
                num1 = Double.parseDouble(parts[0]);
            }
            else if(parts.length == 3){
                double num2 = Double.parseDouble(parts[2]);

                switch(operator){
                    case "+":
                        num1 = num1 + num2;
                        break;
                    case "-":
                        num1 = num1 - num2;
                        break;
                    case "*":
                        num1 = num1 * num2;
                        break;
                    case "/":
                        num1 = num1 / num2;
                        break;
                    case "%":
                        num1 = num1 % num2;
                        break;
                }
            }

            operator = "%";
            if(num1 == (int) num1){
                display.setText((int)num1 + " % ");
            }else{
                display.setText(num1 + " % ");
            }
        });


        Button equal = findViewById(R.id.btnEqual);
        equal.setOnClickListener(v -> {

            String text = display.getText().toString();

            if(text.isEmpty()) return;

            if(operator.equals("")){
                return;
            }

            String[] parts = text.split(" ");
            if(parts.length < 3) return;

            num1 = Double.parseDouble(parts[0]);
            num2 = Double.parseDouble(parts[2]);
            double result = 0;

            switch(operator) {

                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if(num2 == 0){
                        display.setText("0");
                        return;
                    }
                    result = num1 / num2;
                    break;

                case "%":
                    if(num1 == 0 || num2 == 0){
                        result = 0;
                    } else {
                        result = num1 % num2;
                    }
                    break;
            }

            if(result == (int) result){
                display.setText(String.valueOf((int) result));
            } else {
                display.setText(String.valueOf(result));
            }

            num1 = result;
            operator = "";
        });


    }
}