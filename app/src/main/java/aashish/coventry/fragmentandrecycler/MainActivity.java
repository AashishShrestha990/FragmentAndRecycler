package aashish.coventry.fragmentandrecycler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import aashish.coventry.fragmentandrecycler.fragments.AddFragment;
import aashish.coventry.fragmentandrecycler.fragments.AreaFragment;

public class MainActivity extends AppCompatActivity {

    Button btnfragment;
    Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfragment = findViewById(R.id.btnfragment);

        btnfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    AddFragment firstFragment = new AddFragment();
                    fragmentTransaction.add(R.id.fragmentlayout, firstFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    btnfragment.setText("load Second Fragment");
                    status = false;
                } else {
                    AreaFragment secondFragment = new AreaFragment();
                    fragmentTransaction.add(R.id.fragmentlayout, secondFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    btnfragment.setText("load First Fragment");
                    status = true;
                }
            }
        });
    }
}
