package com.example.homework611;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView = findViewById(R.id.textView);
    String SAVED_DATA = "text";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle", "onCreate");
        textView.append("\nonCreate");
        Bundle saved = new Bundle();
        textView.append(saved.getString(SAVED_DATA));
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("Lifecycle", "OnPostCreate");
        textView.append("\nonPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Lifecycle", "onPostResume");
        textView.append("\nonPostResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "onStart");
        textView.append("\nonStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop");
        textView.append("\nonStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestriy");
        textView.append("\nonDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause");
        textView.append("\nonPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "onResume");
        textView.append("\nonResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", "onRestart");
        textView.append("\nonRestart");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyDown");
        textView.append("\nonKeyDown");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        Log.d("Lifecycle", "onBackPressed");
        textView.append("\nonBackPressed");
        super.onBackPressed();
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyLongPress");
        textView.append("\nonKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d("Lifecycle", "onSaveInstanceState");
        textView.append("\nonSaveInstanceState");
        outState.putString(SAVED_DATA, textView.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("Lifecycle", "onSaveInstanceState");
        textView.append("\nonSaveInstanceState");
        textView.setText(savedInstanceState.getString(SAVED_DATA));
        super.onRestoreInstanceState(savedInstanceState);
    }
}
