package fragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tanmay on 15/07/16.
 */
public class FragmentThree extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        view=inflater.inflate(R.layout.fragment_three,container,false);
        textView=(TextView)view.findViewById(R.id.textView3);

        if (savedInstanceState!=null)
        {
            String text=savedInstanceState.getString("text");
            textView.setText(text);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView=(TextView)getActivity().findViewById(R.id.textView3);
    }

    public void res(String data)
    {
        textView.setText(data);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("text",textView.getText().toString());
        super.onSaveInstanceState(outState);
    }
}
