package com.example.corentinbourlet.test2;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    public static Command command;
    private TextView totalCostView;
    private TextView dollarTotalCostView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container);
        command = new Command();




        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentAddBottle fragmentAdd = new FragmentAddBottle();

//container parent que l'on passe à fragment
        fragmentTransaction.add(R.id.fragmentRelative, fragmentAdd );


        Bundle bundle = new Bundle();
        bundle.putSerializable("command",command);
        //bundle.putString("key", "data");

        fragmentAdd.setArguments(bundle);

        fragmentTransaction.commit();



/*
        Bundle bundle = new Bundle();
        bundle.putString("key", "data");
        FragmentAddBottle myFragment = new FragmentAddBottle ();
        myFragment.setArguments(bundle);
*/

    }

    public void onClick(View view) {


    System.out.println("nameUsrChoice");
    Intent bottleCreation = new Intent(MainActivity.this , BottleCreation.class);


        if (view.getId() == R.id.checkList) {

//traitement sur fragment add
            fragmentAdd
                    recuperation du bundle

                    //traitement sur la liste

            System.out.println("nameUsrChoice");
            bottleCreation = new Intent(MainActivity.this , BottleCreation.class);
            startActivity(bottleCreation);
        }
    }


}
