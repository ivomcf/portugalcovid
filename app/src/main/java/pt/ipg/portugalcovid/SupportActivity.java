package pt.ipg.portugalcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
    }

    public void sendMessage(View view) {

        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        EditText editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editTextIdade = (EditText) findViewById(R.id.editTextIdade);

        String nome = editTextNome.getText().toString();
        String telefone = editTextTelefone.getText().toString();
        String email = editTextEmail.getText().toString();

        String StrIdade = editTextIdade.getText().toString();
        int idade=-1;
        try {
            idade = Integer.parseInt(StrIdade);
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        if (nome.length() == 0) {
            editTextNome.setError("Nome Obrigatorio!");
            editTextNome.requestFocus();
            return;
        }

        if (telefone.length() == 0) {
            editTextTelefone.setError("Telefone Obrigatorio!");
            editTextTelefone.requestFocus();
            return;
        }

        if (email.length() == 0) {
            editTextEmail.setError("Telefone Obrigatorio!");
            editTextEmail.requestFocus();
            return;
        }

        Intent intent = new Intent(this, DisplayDataActivity.class);
        startActivity(intent);
    }
}
