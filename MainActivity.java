package org.deepakyadav.careeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private CareerExpert expert = new CareerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindCareer(View view) {
        //Get a reference to the TextView
        TextView career_options = (TextView) findViewById(R.id.career_options);
        //Get a reference to the Spinner
        Spinner stream = (Spinner) findViewById(R.id.stream);
        //Get the selected item in the Spinner
        String careerType = String.valueOf(stream.getSelectedItem());
        //Display the selected item
       //career_options.setText(careerType);


        //Get recommendations from the CareerExpert class
        List<String> careerList = expert.getStreams(careerType);
        StringBuilder streamFormatted = new StringBuilder();
        for (String career : careerList) {
        streamFormatted.append(career).append('\n');
        }
        //Display the career
        career_options.setText(streamFormatted);

    }
    }