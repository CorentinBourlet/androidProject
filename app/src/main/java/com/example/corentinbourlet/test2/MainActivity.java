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

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentAddBottle fragmentAdd = new FragmentAddBottle();

        fragmentTransaction.add(R.id.fragment, fragmentAdd);

        fragmentTransaction.commit();



        command = new Command();

    }

    public void onClick(View view) {
        if (view.getId() == R.id.buttonAddBottle) {


            //on replace maintenant


            String nameUsrChoice = ((EditText)findViewById(R.id.nameBox)).getText().toString();

            String priceUsrChoice =  ((EditText)findViewById(R.id.priceBox)).getText().toString();

            int priceUsrChoiceInt = Integer.parseInt(priceUsrChoice);

            command.addBottle(nameUsrChoice, priceUsrChoiceInt);


            totalCostView = findViewById(R.id.eurosPriceText);
            totalCostView.setText(""+command.totalCost());
            float dollarprice = (float) (command.totalCost()*0.8);
            dollarTotalCostView = findViewById(R.id.dollarPriceText);
            dollarTotalCostView.setText(""+dollarprice);

/*


  System.out.println(nameUsrChoice);
            Intent bottleCreation = new Intent(MainActivity.this , BottleCreation.class);
            startActivity(bottleCreation);*/
        }

        if (view.getId() == R.id.checkList) {
            System.out.println("nameUsrChoice");
            Intent bottleCreation = new Intent(MainActivity.this , BottleCreation.class);
            startActivity(bottleCreation);
        }
    }


}
