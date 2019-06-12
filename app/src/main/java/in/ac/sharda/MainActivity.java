package in.ac.sharda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_TEXT = "in.ac.sharda.EXTRA_TEXT";
    EditText userName, password;
    Button btnSubmit;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnRegister= (Button)findViewById(R.id.btnRegister);




        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username1 = userName.getText().toString();
                String password1 = password.getText().toString();
                if(TextUtils.isEmpty(username1)){
                    userName.setError("Enter User Name");
                }
                else if(TextUtils.isEmpty(password1)){
                    password.setError("Enter password");
                }
                else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra(EXTRA_TEXT, username1 );
                    startActivity(intent);

                }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent2);
            }
        });
    }


}
