package com.saugat984707.lesson4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

   Button convertButton;
    EditText convertEditText;
    TextView euro,pound,indian,nepaliRupee;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        convertEditText = (EditText)findViewById(R.id.convert_edittext_id);
        convertButton =  (Button)findViewById(R.id.convert_button_id);
        euro = (TextView)findViewById(R.id.euro_id);
        pound = (TextView)findViewById(R.id.pound_id);
        indian = (TextView)findViewById(R.id.indian_id);
        nepaliRupee = (TextView)findViewById(R.id.nepali_id);


        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    euro.setText(Integer.parseInt(convertEditText.getText().toString()) * 0.95 + " euro");
                    pound.setText(Integer.parseInt(convertEditText.getText().toString()) * 0.66 + "  pound");
                    indian.setText(Integer.parseInt(convertEditText.getText().toString()) * 66.52 + " indian rupee");
                    nepaliRupee.setText(Integer.parseInt(convertEditText.getText().toString()) * 107.88 + "  nepali rupee");
                } catch (NullPointerException e) {
                    Toast.makeText(getApplication(), "Please enter USD", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


}
