package com.example.corentinbourlet.test2;

import android.content.Intent;
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
        setContentView(R.layout.activity_main);
        command = new Command();

        Button buttonBottle = (Button) findViewById(R.id.buttonAddBottle);
        buttonBottle.setOnClickListener(this);

        Button buttonchecklist = (Button) findViewById(R.id.checkList);
        buttonchecklist.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.buttonAddBottle) {

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
