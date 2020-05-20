package pt.ipg.portugalcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuporte;
    private Button buttonCases;
    float x1,y1,x2,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCases = findViewById(R.id.buttonCases);
        buttonCases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                moveToCasesActivity();
            }
        });

        buttonSuporte = findViewById(R.id.buttonSupport);
        buttonSuporte.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                moveToSupportActivity();
            }
        });
    }

    public boolean onTouchEvent(MotionEvent touchEvent) {
        switch (touchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if (x1 < x2) {
                    Intent i = new Intent(MainActivity.this, ConfirmedActivity.class);
                    startActivity(i);
                } else if (x1 > x2) {
                    Intent i = new Intent(MainActivity.this, RecoveredActivity.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }

    private void moveToSupportActivity(){

        Intent intent = new Intent(MainActivity.this, SupportActivity.class);
        startActivity(intent);

    }

    private void moveToCasesActivity(){

        Intent intent = new Intent(MainActivity.this, CasesActivity.class);
        startActivity(intent);
    }

}
