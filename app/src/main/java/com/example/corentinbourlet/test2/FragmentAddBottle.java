package com.example.corentinbourlet.test2;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import static com.example.corentinbourlet.test2.MainActivity.command;

public class FragmentAddBottle extends Fragment implements View.OnClickListener {



    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootview = inflater.inflate(R.layout.activity_main, container, false);

        Bundle bundle = getArguments();
        final Command command = (Command) bundle.getSerializable("command");

        // Here is your arguments
        /*
        Bundle bundle = getArguments();
        String data = bundle.getString("key");
        */




        // Inflate the layout for this fragment


        Button buttonBottle = rootview.findViewById(R.id.buttonAddBottle);

        buttonBottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                EditText temp = rootview.findViewById(R.id.priceBox);

                String priceUsrChoice = temp.getText().toString();

                EditText temp2 = rootview.findViewById(R.id.nameBox);
                String nameUsrChoice = temp2.getText().toString();

                int priceUsrChoiceInt = Integer.parseInt(priceUsrChoice);


                command.addBottle(nameUsrChoice, priceUsrChoiceInt);


                TextView totalCostView = rootview.findViewById(R.id.eurosPriceText);
                totalCostView.setText(""+command.totalCost());
                float dollarprice = (float) (command.totalCost()*0.8);
                TextView dollarTotalCostView = rootview.findViewById(R.id.dollarPriceText);
                dollarTotalCostView.setText(""+dollarprice);

            }
        });


        Button buttonchecklist = rootview.findViewById(R.id.checkList);
        buttonchecklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
                // Do something because button has been clicked
            }
        });

        return rootview;
    }

    @Override
    public void onClick(View v) {
        /*
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        if (v.getId() == R.id.buttonAddBottle) {

            //on replace maintenant
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            EditText temp = v.findViewById(R.id.priceBox);
            String priceUsrChoice = temp.getText().toString();

            EditText temp2 = v.findViewById(R.id.nameBox);
            String nameUsrChoice = temp.getText().toString();

            int priceUsrChoiceInt = Integer.parseInt(priceUsrChoice);

            //command.addBottle(nameUsrChoice, priceUsrChoiceInt);

                /*
                totalCostView = findViewById(R.id.eurosPriceText);
                totalCostView.setText(""+command.totalCost());
                float dollarprice = (float) (command.totalCost()*0.8);
                dollarTotalCostView = findViewById(R.id.dollarPriceText);
                dollarTotalCostView.setText(""+dollarprice);*/

        }
    }

