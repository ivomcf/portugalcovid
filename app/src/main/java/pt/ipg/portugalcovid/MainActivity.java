package pt.ipg.portugalcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuporte;
    private Button buttonCases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSuporte = findViewById(R.id.buttonSupport);
        buttonSuporte.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                moveToSupportActivity();
            }
        });
    }

    private void moveToSupportActivity(){

        Intent intent = new Intent(MainActivity.this, SupportActivity.class);
        startActivity(intent);

    }
}
