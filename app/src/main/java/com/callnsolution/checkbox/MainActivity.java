package com.callnsolution.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox Nokia, Samsung, Huawei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nokia = findViewById(R.id.nokia);
        Samsung = findViewById(R.id.samsung);
        Huawei = findViewById(R.id.huawei);

        if (Nokia.isChecked()) {
            Nokia.setChecked(false);
        }

        if (Samsung.isChecked()) {
            Samsung.setChecked(false);
        }

        if (Huawei.isChecked()) {
            Huawei.setChecked(false);
        }


    }
}
