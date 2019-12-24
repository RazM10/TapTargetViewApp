package org.myself.taptargetviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_helloWorld;
    Button btn_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_helloWorld=findViewById(R.id.tv_helloWorld);
        btn_show=findViewById(R.id.btn_show);


    }
}
