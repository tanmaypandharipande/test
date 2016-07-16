package intent.testintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendEmail("Hello Message");

    }
    public void sendEmail(String message)
    {
        Intent messageSendIntent = new Intent();
        messageSendIntent.setAction(Intent.ACTION_SEND);
        messageSendIntent.putExtra(Intent.EXTRA_TEXT,message);
        messageSendIntent.setType("text/plain");
        startActivity(messageSendIntent);
    }
}
