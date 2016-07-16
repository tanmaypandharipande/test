package test.pojotest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by tanmay on 15/07/16.
 */
public class GetActivity extends AppCompatActivity {

    EditText name,number,email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setTitle("Result Activity");
        setContentView(R.layout.get_activity);

        name=(EditText)findViewById(R.id.name_text);
        number=(EditText)findViewById(R.id.num_text);
        email=(EditText)findViewById(R.id.email_text);

        //Retreiving object through intent
        Person per=(Person)getIntent().getSerializableExtra("person");

        //Setting respective feild to edittext
        name.setText(per.getName());
        number.setText(per.getPhoneNumber());
        email.setText(per.getEmailId());
    }
}
