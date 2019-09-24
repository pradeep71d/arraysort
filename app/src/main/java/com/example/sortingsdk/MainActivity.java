package com.example.sortingsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sortinglib.ArraysSort;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArraysSort a=new ArraysSort();
        a.show();
    }
}
