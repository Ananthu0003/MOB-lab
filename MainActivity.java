package com.example.caculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText c1,c2;
    Button a,s,m,d;
    String num1,num2,res;
    EditText ans;
    int num3,num4,sum;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        c1=(EditText)findViewById(R.id.c1);
        c2=(EditText)findViewById(R.id.c2);
        ans=(EditText)findViewById(R.id.ans);
        a=(Button)findViewById(R.id.button3) ;
        s=(Button)findViewById(R.id.button4);
        m=(Button)findViewById(R.id.button5);
        d=(Button)findViewById(R.id.button6);
        a.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
            num1=c1.getText().toString();
            num3=Integer.parseInt(num1);
            num2=c2.getText().toString();
            num4=Integer.parseInt(num2);
            sum=num3+num4;
            res=String.valueOf(sum);
            ans.setText(res);
            }
        });
        s.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                num1=c1.getText().toString();
                num3=Integer.parseInt(num1);
                num2=c2.getText().toString();
                num4=Integer.parseInt(num2);
                sum=num3-num4;
                res=String.valueOf(sum);
                ans.setText(res);
            }
        });
        m.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                num1=c1.getText().toString();
                num3=Integer.parseInt(num1);
                num2=c2.getText().toString();
                num4=Integer.parseInt(num2);
                sum=num3*num4;
                res=String.valueOf(sum);
                ans.setText(res);
            }
        });
        d.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                num1=c1.getText().toString();
                num3=Integer.parseInt(num1);
                num2=c2.getText().toString();
                num4=Integer.parseInt(num2);
                sum=num3%num4;
                res=String.valueOf(sum);
                ans.setText(res);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}