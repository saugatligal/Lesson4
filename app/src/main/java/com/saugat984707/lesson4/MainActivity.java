package com.saugat984707.lesson4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button convertButton;
    EditText convertEditText;
    TextView euro,pound,indian,nepaliRupee,euroText,poundText,indianText,nepaliText;
    LinearLayout layout,layoutConvert,layoutDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams mainlayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        layout = new LinearLayout(this);
        layout.setGravity(Gravity.CENTER);

        layoutConvert = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.setMargins(0,0,20,0);

        layoutDetail = new LinearLayout(this);
        convertEditText = new EditText(this);
        convertButton =  new Button(this);
        convertButton.setText("Convert");
        euroText = new TextView(this);




        euro = new TextView(this);
        pound = new TextView(this);
        indian = new TextView(this);
        nepaliRupee = new TextView(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layoutConvert.setOrientation(LinearLayout.VERTICAL);
        layoutDetail.setOrientation(LinearLayout.VERTICAL);
        convertEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        convertEditText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
        convertEditText.setInputType(InputType.TYPE_NUMBER_FLAG_SIGNED);
        convertEditText.setHint("USD");
        euro.setText("00.00 euro");
        pound.setText("00.00  pound");
        indian.setText("00.00 indian rupee");
        nepaliRupee.setText("00.00  nepali rupee");


        layoutConvert.addView(convertEditText,layoutParams);
        layoutConvert.addView(convertButton,layoutParams);
        layoutDetail.addView(euro);
        layoutDetail.addView(pound);
        layoutDetail.addView(indian);
        layoutDetail.addView(nepaliRupee);
        layout.addView(layoutConvert);
        layout.addView(layoutDetail);


        setContentView(layout,mainlayoutParams);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    euro.setText(Integer.parseInt(convertEditText.getText().toString()) * 0.95 + " euro");
                    pound.setText(Integer.parseInt(convertEditText.getText().toString()) * 0.66 + "  pound");
                    indian.setText(Integer.parseInt(convertEditText.getText().toString()) * 66.52 + " indian rupee");
                    nepaliRupee.setText(Integer.parseInt(convertEditText.getText().toString()) * 107.88 + "  nepali rupee");
                }catch (NullPointerException e){
                    Toast.makeText(getApplication(),"Please enter USD",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }


}
