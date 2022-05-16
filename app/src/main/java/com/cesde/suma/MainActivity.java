package com.cesde.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnum1;
    EditText txtnum2;
    EditText txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnum1=(EditText)findViewById(R.id.txtnum1);
        txtnum2=(EditText)findViewById(R.id.txtnum2);
        txtresult=(EditText)findViewById(R.id.txtresult);
    }
    public void Sumar(View v){
        int n1=Integer.parseInt(txtnum1.getText().toString());
        int n2=Integer.parseInt(txtnum2.getText().toString());
        int result=n1+n2;
        txtresult.setText(String.valueOf(result));
    }
}