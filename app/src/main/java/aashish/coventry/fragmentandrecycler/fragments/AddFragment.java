package aashish.coventry.fragmentandrecycler.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import aashish.coventry.fragmentandrecycler.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment implements View.OnClickListener {

    Button btncalculate;
    EditText txt1, txt2;

    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        txt1 = view.findViewById(R.id.txt1);
        txt2 = view.findViewById(R.id.txt2);
        btncalculate = view.findViewById(R.id.btncalculate);

        btncalculate.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int first = Integer.parseInt(txt1.getText().toString());
        int second = Integer.parseInt(txt2.getText().toString());
        int result = first + second;

        Toast.makeText(getActivity(), "Result is "+result, Toast.LENGTH_LONG).show();

    }
}
