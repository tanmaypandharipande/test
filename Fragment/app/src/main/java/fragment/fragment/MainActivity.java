package fragment.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Communicate{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Fragment Communication");
    }

    @Override
    public void respone(String data) {

        android.app.FragmentManager fragmentManager=getFragmentManager();
        FragmentTwo two=(FragmentTwo)fragmentManager.findFragmentById(R.id.fragment2);
        two.changeText(data);


    }

    @Override
    public void respond_two(String data) {
        android.app.FragmentManager fragmentManager=getFragmentManager();
        FragmentThree fragmentThree=(FragmentThree)fragmentManager.findFragmentById(R.id.fragment3);
        fragmentThree.res(data);
    }
}
