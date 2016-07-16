package fragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by tanmay on 15/07/16.
 */
public class FragmentOne extends Fragment {
    Button button;
    int counter=0;
    Communicate communicate;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        view=inflater.inflate(R.layout.fragment_one,container,false);
        if(savedInstanceState!=null)
        {
            counter= Integer.parseInt(savedInstanceState.getString("count"));
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button=(Button)getActivity().findViewById(R.id.button);
        communicate=(Communicate)getActivity();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                communicate.respone("Button Clicked "+counter+" times");
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("count", String.valueOf(counter));
        super.onSaveInstanceState(outState);

    }
}
