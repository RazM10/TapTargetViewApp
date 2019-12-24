package org.myself.taptargetviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetSequence;

public class Main2Activity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        new TapTargetSequence(this)
                .targets(
                        TapTarget.forView(btn1, "Button 1", "Button Description.")
                                .outerCircleColor(R.color.colorAccent)
                                .tintTarget(true)
                                .targetCircleColor(R.color.colorWhite)
                                .transparentTarget(true),
                        TapTarget.forView(btn2, "Button 2", "Button Description.")
                                .outerCircleColor(R.color.colorPrimary)
                                .tintTarget(true)
                                .transparentTarget(true)
                )
                .continueOnCancel(true).considerOuterCircleCanceled(true).listener(new TapTargetSequence.Listener() {
                    @Override
                    public void onSequenceFinish() {
                        Toast.makeText(Main2Activity.this, "View Finish", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSequenceStep(TapTarget lastTarget, boolean targetClicked) {

                    }

                    @Override
                    public void onSequenceCanceled(TapTarget lastTarget) {

                    }
                }).start();

    }
}
