package test.pojotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    EditText name,number,email;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.name);
        number=(EditText)findViewById(R.id.number);
        email=(EditText)findViewById(R.id.email);

        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validation
                if(name.getText().toString().equals("")||number.getText().toString().equals("")||email.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please enter all the details",Toast.LENGTH_SHORT).show();
                }

                else {
                    //Setting the object parameters
                    Person person=new Person();
                    person.setName(name.getText().toString());
                    person.setPhoneNumber(number.getText().toString());
                    person.setEmailId(email.getText().toString());

                    Intent i=new Intent(MainActivity.this,GetActivity.class);
                    i.putExtra("person", person);//Passing object through intent
                    startActivity(i);

                }
            }
        });

    }
}
