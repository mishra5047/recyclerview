package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {
private TextView name, description, remarks;
private Bundle extras;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();

     name = (TextView) findViewById(R.id.dNameId);
     description = (TextView) findViewById(R.id.dDescriptionId);
     remarks = (TextView) findViewById(R.id.dRemarksId);

    if(extras != null){
        name.setText(extras.getString("name"));
         description.setText(extras.getString("description"));
         remarks.setText(extras.getString("remarks"));
    }

    }
}
