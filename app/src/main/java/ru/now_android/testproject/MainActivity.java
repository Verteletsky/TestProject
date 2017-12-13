package ru.now_android.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import ru.now_android.calcutils.CalcUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sum = CalcUtils.plus(4, 6);
        Toast.makeText(this, "" + sum, Toast.LENGTH_SHORT).show();
    }
}
