package pt.ipg.portugalcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CasesActivity extends AppCompatActivity {

    private Button buttonConfirmed;
    private Button buttonSuspected;
    private Button buttonRecovered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cases);

        buttonConfirmed = findViewById(R.id.buttonConfirmados);
        buttonConfirmed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                moveToConfirmedActivity();
            }
        });
    }

    private void moveToConfirmedActivity(){

        Intent intent = new Intent(CasesActivity.this, ConfirmedActivity.class);
        startActivity(intent);

    }
}
