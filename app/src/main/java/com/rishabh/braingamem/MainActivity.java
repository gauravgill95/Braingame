package com.rishabh.braingamem;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button a;
    Button w;
    Button x;
    Button y;
    Button z;
    Button as;
    TextView d;
    TextView m;
    RelativeLayout we;
    ArrayList<Integer> e = new ArrayList<Integer>();
    int f;
    int s=0;
    int t=0;
    TextView j;
    TextView o;
    public void play(View view){
        s=0;
        t=0;
        m.setText("30s");
        o.setText("0/0");
        j.setText("");
        u();
        as.setVisibility(View.INVISIBLE);
        w.setVisibility(View.VISIBLE);
        x.setVisibility(View.VISIBLE);
        y.setVisibility(View.VISIBLE);
        z.setVisibility(View.VISIBLE);
        m.setVisibility(View.VISIBLE);
        o.setVisibility(View.VISIBLE);
        d.setVisibility(View.VISIBLE);
        m.setText("0s");
        new CountDownTimer(30100,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                m.setText(String.valueOf(millisUntilFinished/1000)+"s");
            }

            @Override
            public void onFinish() {
                as.setVisibility(View.VISIBLE);
                w.setVisibility(View.INVISIBLE);
                x.setVisibility(View.INVISIBLE);
                y.setVisibility(View.INVISIBLE);
                z.setVisibility(View.INVISIBLE);
                m.setVisibility(View.INVISIBLE);
                o.setVisibility(View.INVISIBLE);
                d.setVisibility(View.INVISIBLE);
                m.setText("0s");
                j.setText("Your score:"+Integer.toString(s)+"/"+Integer.toString(t));
            }
        }.start();
    }
    public void ca (View q){
        if(q.getTag().toString().equals(Integer.toString(f))){
            s++;
            j.setText("Correct!");
            u();
        }
        else{
            j.setText("Wrong!");
        }
        t++;
        o.setText(Integer.toString(s)+"/"+Integer.toString(t));
    }
    public void u (){
        Random r = new Random();
        int b = r.nextInt(51);
        int c = r.nextInt(51);
        int g;
        d.setText(Integer.toString(b) + " + " + Integer.toString(c));
        f = r.nextInt(4);
        e.clear();
        for (int i=0;i<4;i++){
            if(i==f){
                e.add(b+c);
            }
            else {
                g=r.nextInt(51);
                while(g == b+c){
                    g=r.nextInt(51);
                }
                e.add(g);
            }
        }
        w.setText(Integer.toString(e.get(0)));
        x.setText(Integer.toString(e.get(1)));
        y.setText(Integer.toString(e.get(2)));
        z.setText(Integer.toString(e.get(3)));
    }
    public void start (View v){
        a.setVisibility(View.INVISIBLE);
        we.setVisibility(RelativeLayout.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a =(Button) findViewById(R.id.button4);
        w = (Button) findViewById(R.id.button0);
        x = (Button) findViewById(R.id.button1);
        y = (Button) findViewById(R.id.button2);
        z = (Button) findViewById(R.id.button3);
        d = (TextView) findViewById(R.id.textView2);
        j = (TextView) findViewById(R.id.textView4);
        o = (TextView) findViewById(R.id.textView3);
        m = (TextView) findViewById(R.id.textView);
        as=(Button) findViewById(R.id.button6);
        we=(RelativeLayout) findViewById(R.id.ab);
        u();
        play(findViewById(R.id.button6));


    }
}
