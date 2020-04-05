package com.example.android.assignment11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText ed1,ed2;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        ed1=findViewById(R.id.editText);
        ed2=findViewById(R.id.editText2);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float dis,lastprice,amount,dis_price;
                dis=Float.valueOf(ed2.getText().toString());
                amount=Float.valueOf(ed1.getText().toString());
                dis_price=amount*(dis/100);
                lastprice = amount-dis_price;
                t1.setText("Discount:"+Float.toString(dis_price));
                t2.setText("Last Price:"+Float.toString(lastprice));
                t1.setVisibility(TextView.VISIBLE);
                t2.setVisibility(TextView.VISIBLE);
            }
        });
    }
}
