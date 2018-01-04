package com.firstapp.fungame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class fun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);

        Button t=(Button) findViewById(R.id.button);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t1=(TextView)findViewById(R.id.editText);
                if(t1.getText().toString().isEmpty())
                {
                   message("Enter a number");
                }
                else {
                    int x = Integer.parseInt(t1.getText().toString());
                    boolean k=tri(x);
                    boolean lw=square(x);
                    if(k==true )
                    {
                       if(lw==true)
                        message(x+" "+"is tringular and square");
                        else
                           message(x+" "+"is tringular");
                    }

                    if(k==false)
                    {
                        if(lw==true)
                        message(x +" "+"is square number");
                    else
                        if(!lw)
                        message(x+" "+"is nothing");
                    }


                }
            }
        });

    }
public void message(String s){
    Toast.makeText(fun.this,s,Toast.LENGTH_SHORT).show();
}
public boolean tri(int i)
{
    int y=1;
    int t=1;
    while(t<i)
    {
        y++;
        t=t+y;
           }
           if(t==i)
               return true;
    else
        return  false;
}
public boolean square(int o){
    Double sq=Math.sqrt(o);
    if(sq==Math.floor(sq))
        return true;
    else
        return false;
}
}
