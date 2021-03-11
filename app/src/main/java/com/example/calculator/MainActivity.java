package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.eclipsesource.v8.V8;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    private TextView txtDisplay;
    private TextView txtResult;

    private TextView txtZero;
    private TextView txtOne;
    private TextView txtTwo;
    private TextView txtThree;
    private TextView txtFour;
    private TextView txtFive;
    private TextView txtSix;
    private TextView txtSeven;
    private TextView txtEight;
    private TextView txtNine;
    private TextView txtPlus;
    private TextView txtMinus;
    private TextView txtMultiplication;
    private TextView txtDivision;
    private TextView txtDot;
    private TextView txtOpenParenthesis;
    private TextView txtCloseParenthesis;
    private TextView txtEqual;
    private ImageView ivBackspace;
    private ImageView ivHistory;
    private TextView txtClear;
    private ListView lvHistory;
    private TextView txtClearHistory;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map();
        OnClickEvent();
    }

    private void Map() {
        txtDisplay = findViewById(R.id.display);
        txtResult = findViewById(R.id.result);

        txtZero = findViewById(R.id.zero);
        txtOne = findViewById(R.id.one);
        txtTwo = findViewById(R.id.two);
        txtThree = findViewById(R.id.three);
        txtFour = findViewById(R.id.four);
        txtFive = findViewById(R.id.five);
        txtSix = findViewById(R.id.six);
        txtSeven = findViewById(R.id.seven);
        txtEight = findViewById(R.id.eight);
        txtNine = findViewById(R.id.nine);
        txtPlus = findViewById(R.id.plus);
        txtMinus = findViewById(R.id.minus);
        txtMultiplication = findViewById(R.id.multiplication);
        txtDivision = findViewById(R.id.division);
        txtDot = findViewById(R.id.dot);
        txtOpenParenthesis = findViewById(R.id.open_parenthesis);
        txtCloseParenthesis = findViewById(R.id.close_parenthesis);
        txtEqual = findViewById(R.id.equal);
        ivBackspace = findViewById(R.id.backspace);
        ivHistory = findViewById(R.id.history);
        txtClear = findViewById(R.id.clear);
        lvHistory = findViewById(R.id.lv_history);
        txtClearHistory = findViewById(R.id.txt_clear_history);
    }

    private void OnClickEvent() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        txtZero.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if ((size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2))) || currentExpression.equals("0"))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtZero.getText());
        });

        txtOne.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2)))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtOne.getText());
        });

        txtTwo.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2)))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtTwo.getText());
        });

        txtThree.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2)))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtThree.getText());
        });

        txtFour.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2)))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtFour.getText());
        });

        txtFive.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2)))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtFive.getText());
        });

        txtSix.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2)))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtSix.getText());
        });

        txtSeven.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2)))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtSeven.getText());
        });

        txtEight.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2)))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtEight.getText());
        });

        txtNine.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 1 && currentExpression.charAt(size - 1) == '0' && !isDigit(currentExpression.charAt(size - 2))
                    && !isDot(currentExpression.charAt(size - 2)))
                txtDisplay.setText(currentExpression.subSequence(0, size - 1));
            if (size == 0 || !isCloseParenthesis(currentExpression.charAt(size - 1)))
                txtDisplay.append(txtNine.getText());
        });

        txtPlus.setOnClickListener(v -> {
            int size = txtDisplay.getText().length();
            if (size > 0 && !isDot(txtDisplay.getText().charAt(size - 1)) &&
                !isOpenParenthesis(txtDisplay.getText().charAt(size - 1))) {
                if (isOperator(txtDisplay.getText().charAt(size - 1)))
                    txtDisplay.setText(txtDisplay.getText().subSequence(0, size - 1));
                txtDisplay.append(txtPlus.getText());
            }
        });

        txtMinus.setOnClickListener(v -> {
            int size = txtDisplay.getText().length();
            if (size > 0 && !isDot(txtDisplay.getText().charAt(size - 1)) &&
                    !isOpenParenthesis(txtDisplay.getText().charAt(size - 1))) {
                if (isOperator(txtDisplay.getText().charAt(size - 1)))
                    txtDisplay.setText(txtDisplay.getText().subSequence(0, size - 1));
                txtDisplay.append(txtMinus.getText());
            }
        });

        txtMultiplication.setOnClickListener(v -> {
            int size = txtDisplay.getText().length();
            if (size > 0 && !isDot(txtDisplay.getText().charAt(size - 1)) &&
                    !isOpenParenthesis(txtDisplay.getText().charAt(size - 1))) {
                if (isOperator(txtDisplay.getText().charAt(size - 1)))
                    txtDisplay.setText(txtDisplay.getText().subSequence(0, size - 1));
                txtDisplay.append(txtMultiplication.getText());
            }
        });

        txtDivision.setOnClickListener(v -> {
            int size = txtDisplay.getText().length();
            if (size > 0 && !isDot(txtDisplay.getText().charAt(size - 1)) &&
                    !isOpenParenthesis(txtDisplay.getText().charAt(size - 1))) {
                if (isOperator(txtDisplay.getText().charAt(size - 1)))
                    txtDisplay.setText(txtDisplay.getText().subSequence(0, size - 1));
                txtDisplay.append(txtDivision.getText());
            }
        });

        txtDot.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 0) {
                if (isDigit(currentExpression.charAt(size - 1))) {
                    boolean invalid = false;
                    for (int i = size - 1; i >= 0; i--) {
                        if (isDot(currentExpression.charAt(i))) {
                            invalid = true;
                            break;
                        }
                        if (!isDigit(currentExpression.charAt(i)))
                            break;
                    }
                    if (!invalid)
                        txtDisplay.append(txtDot.getText());
                }
            }
        });

        txtOpenParenthesis.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size == 0)
                txtDisplay.append(txtOpenParenthesis.getText());
            else {
                if (isOperator(currentExpression.charAt(size - 1)) ||
                    isOpenParenthesis(currentExpression.charAt(size - 1))) {
                    txtDisplay.append(txtOpenParenthesis.getText());
                }
            }
        });

        txtCloseParenthesis.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            int size = currentExpression.length();
            if (size > 0) {
                if (isDigit(currentExpression.charAt(size - 1)) ||
                    isCloseParenthesis(currentExpression.charAt(size - 1))) {
                        if (countOpenParenthesis(currentExpression) > countCloseParenthesis(currentExpression))
                            txtDisplay.append(txtCloseParenthesis.getText());
                }
            }
        });

        txtEqual.setOnClickListener(v -> {
            String currentExpression = txtDisplay.getText().toString();
            if (!currentExpression.isEmpty() && (countOpenParenthesis(currentExpression) == countCloseParenthesis(currentExpression))) {
                txtResult.setText(EvaluateResult());
                if (!txtResult.getText().toString().isEmpty()) {
                    editor.putString(txtDisplay.getText().toString(), txtResult.getText().toString());
                    editor.commit();
                }
            }
        });

        ivBackspace.setOnClickListener(v -> {
            if (txtDisplay.getText().length() > 0)
                txtDisplay.setText(txtDisplay.getText().subSequence(0, txtDisplay.getText().length() - 1));
        });

        ivHistory.setOnClickListener(v -> {
            if (lvHistory.getVisibility() == View.INVISIBLE) {
                lvHistory.setVisibility(View.VISIBLE);
                txtClearHistory.setVisibility(View.VISIBLE);
                loadListHistory(sharedPreferences);
            }
            else {
                lvHistory.setVisibility(View.INVISIBLE);
                txtClearHistory.setVisibility(View.INVISIBLE);
            }
        });

        txtClear.setOnClickListener(v -> {
            txtDisplay.setText("");
            txtResult.setText("");
        });

        txtClearHistory.setOnClickListener(v -> {
            editor.clear();
            editor.commit();
            loadListHistory(sharedPreferences);
        });
    }

    private String EvaluateResult() {
        StringBuilder expression = new StringBuilder(txtDisplay.getText().toString());
        for (int i = 0; i < expression.length(); i++){
            if (expression.charAt(i) == '−')
                expression.setCharAt(i, '-');
            if (expression.charAt(i) == '×')
                expression.setCharAt(i, '*');
            if (expression.charAt(i) == '÷')
                expression.setCharAt(i, '/');
        }
        String result = "";
        if (!isOperatorFront(expression.charAt(expression.length() - 1))) {
            V8 runtime = V8.createV8Runtime();
            result = String.valueOf(runtime.executeDoubleScript(expression.toString()));
            if (result.subSequence(result.length() - 2, result.length()).equals(".0"))
                result = result.subSequence(0, result.length() - 2).toString();
        }
        return result;
    }

    private void loadListHistory(SharedPreferences sharedPreferences) {
        List<Calculating> historyRecords = new Vector<>();
        Map<String, ?> keys = sharedPreferences.getAll();
        for (Map.Entry<String, ?> entry : keys.entrySet()) {
            historyRecords.add(new Calculating(entry.getKey(), entry.getValue().toString()));
        }
        HistoryAdapter historyAdapter = new HistoryAdapter(MainActivity.this, historyRecords);
        lvHistory.setAdapter(historyAdapter);
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '−' || c == '×' || c == '÷';
    }

    private boolean isOperatorFront(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private boolean isDot(char c) {
        return c == '.';
    }

    private boolean isDigit(char c) {
        return c >= 48 && c <= 57;
    }

    private boolean isOpenParenthesis(char c) {
        return c == '(';
    }

    private boolean isCloseParenthesis(char c) {
        return c == ')';
    }

    private int countOpenParenthesis(String expression) {
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (isOpenParenthesis(expression.charAt(i)))
                count++;
        }
        return count;
    }

    private int countCloseParenthesis(String expression) {
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (isCloseParenthesis(expression.charAt(i)))
                count++;
        }
        return count;
    }
}