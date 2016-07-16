package pokemongo.pokemongofragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Pokemon Go");

        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentOne fragmentOne=new FragmentOne();
                android.app.FragmentManager fragmentManager1=getFragmentManager();
                FragmentTransaction fragmentTransaction1=fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.fragment_container,fragmentOne);
                fragmentTransaction1.commit();
                one.setVisibility(View.GONE);
                two.setVisibility(View.VISIBLE);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTwo fragmentTwo= new FragmentTwo();
                android.app.FragmentManager fragmentManager2=getFragmentManager();
                FragmentTransaction fragmentTransaction2=fragmentManager2.beginTransaction();
                fragmentTransaction2.replace(R.id.fragment_container,fragmentTwo);
                fragmentTransaction2.commit();
                two.setVisibility(View.GONE);
                three.setVisibility(View.VISIBLE);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentThree fragmentThree=new FragmentThree();
                android.app.FragmentManager fragmentManager3=getFragmentManager();
                FragmentTransaction fragmentTransaction3=fragmentManager3.beginTransaction();
                fragmentTransaction3.replace(R.id.fragment_container,fragmentThree);
                fragmentTransaction3.commit();
                three.setVisibility(View.GONE);
                four.setVisibility(View.VISIBLE);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentFour fragmentFour=new FragmentFour();
                android.app.FragmentManager fragmentManager4=getFragmentManager();
                FragmentTransaction fragmentTransaction4=fragmentManager4.beginTransaction();
                fragmentTransaction4.replace(R.id.fragment_container,fragmentFour);
                fragmentTransaction4.commit();
                four.setVisibility(View.GONE);
                five.setVisibility(View.VISIBLE);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentFive fragmentFive=new FragmentFive();
                android.app.FragmentManager fragmentManager5=getFragmentManager();
                FragmentTransaction fragmentTransaction5=fragmentManager5.beginTransaction();
                fragmentTransaction5.replace(R.id.fragment_container,fragmentFive);
                fragmentTransaction5.commit();
                five.setVisibility(View.GONE);
                six.setVisibility(View.VISIBLE);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentOne fragmentTwo2= new FragmentOne();
                android.app.FragmentManager fragmentManager6=getFragmentManager();
                FragmentTransaction fragmentTransaction6=fragmentManager6.beginTransaction();
                fragmentTransaction6.replace(R.id.fragment_container,fragmentTwo2);
                fragmentTransaction6.commit();
                six.setVisibility(View.GONE);
                two.setVisibility(View.VISIBLE);
            }
        });
    }
}
