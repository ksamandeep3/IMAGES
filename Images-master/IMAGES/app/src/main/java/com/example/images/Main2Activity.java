package com.example.images;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner sp1;
    ImageView proImg;
    EditText et1,et2,et3;
    Button bt;
    int [] images ={R.drawable.keyboard,R.drawable.mouse,R.drawable.monitor,R.drawable.macbook,R.drawable.harddrive};
    int [] price = {200,100,1000,2000,700};
double pr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sp1 = findViewById(R.id.spin);
        proImg = findViewById(R.id.pImg);
        et1 = findViewById(R.id.etp);
        et2 = findViewById(R.id.etq);
        et3 = findViewById(R.id.ett);
        bt = findViewById(R.id.tot);

        List<String> products = new ArrayList<>();
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Monitor");
        products.add("Macbook");
        products.add("Harddrive");

        ArrayAdapter<String> proAdapter= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,products);
        proAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        sp1.setAdapter(proAdapter);
        sp1.setOnItemSelectedListener(this);
bt.setOnClickListener(this);




    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
       // ImageView.setImageResources(images[i]);

      proImg.setImageResource(images[i]);
       pr = new Double(price[i]);
     et1.setText(String.valueOf(pr));




    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view)
    {
        if(!et2.getText().equals(""))
        {

            Double  qua  = Double.parseDouble(et2.getText().toString());
            Double total = ((qua * (pr))*1.3);
            et3.setText(String.valueOf(total));
        }
    }
}
