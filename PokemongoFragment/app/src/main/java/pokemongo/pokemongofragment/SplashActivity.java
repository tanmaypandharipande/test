package pokemongo.pokemongofragment;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Window;

/**
 * Created by tanmay on 23/07/16.
 */
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new SplashTask().execute();


    }
    public class SplashTask extends AsyncTask<Void,Void,Void>{

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Intent i=new Intent(SplashActivity.this,MainActivity.class);
            startActivity(i);
        }

        @Override
        protected Void doInBackground(Void... params) {
            try
            {
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                Log.e("Exception",e.getMessage());
            }
            return null;
        }
    }
}
