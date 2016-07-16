package fragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tanmay on 15/07/16.
 */
public class FragmentTwo extends Fragment
{
    TextView textView;
    Button button2;
    Communicate communicate;
    int counter=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view;
        view=inflater.inflate(R.layout.fragment_two,container,false);
        textView=(TextView)view.findViewById(R.id.textView);


        if (savedInstanceState!=null)
        {
            String a=savedInstanceState.getString("key");
            counter= Integer.parseInt(savedInstanceState.getString("count"));

            textView.setText(a);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView=(TextView)getActivity().findViewById(R.id.textView);
        button2=(Button)getActivity().findViewById(R.id.button2);
        communicate=(Communicate)getActivity();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                communicate.respond_two("Clicked on Fragment two "+counter+" times");
            }
        });
    }

    public void changeText(String data)
    {
    textView.setText(data);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("count", String.valueOf(counter));
        outState.putString("key",textView.getText().toString());
        super.onSaveInstanceState(outState);

    }
}
