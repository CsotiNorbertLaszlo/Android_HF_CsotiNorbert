package com.example.hf2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActivityStateSaveTwo extends AppCompatActivity {
    private EditText editText;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_save_two);

        editText = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkBox);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("editTextValue", editText.getText().toString());
        outState.putBoolean("checkBoxState", checkBox.isChecked());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String editTextValue = savedInstanceState.getString("editTextValue");
        boolean checkBoxState = savedInstanceState.getBoolean("checkBoxState");

        editText.setText(editTextValue);
        checkBox.setChecked(checkBoxState);
    }
}