package com.example.homeworktask1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    private ImageView time1;
    private ImageView time2;
    private ImageView time3;
    private ImageView time4;
    private ImageView time5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout clock1 = findViewById(R.id.time1);
        final ConstraintLayout clock2 = findViewById(R.id.time2);
        final ConstraintLayout clock3 = findViewById(R.id.time3);
        final ConstraintLayout clock4 = findViewById(R.id.time4);
        final ConstraintLayout clock5 = findViewById(R.id.time5);

        TextView city1 = clock1.findViewById(R.id.textView);
        TextView city2 = clock2.findViewById(R.id.textView);
        TextView city3 = clock3.findViewById(R.id.textView);
        TextView city4 = clock4.findViewById(R.id.textView);
        TextView city5 = clock5.findViewById(R.id.textView);

        city1.setText("Sydney");
        city2.setText("Tokyo");
        city3.setText("Ottawa");
        city4.setText("Paris");
        city5.setText("Rome");

        final TextClock sydney = clock1.findViewById(R.id.textClock);
        final TextClock tokyo = clock2.findViewById(R.id.textClock);
        final TextClock ottawa = clock3.findViewById(R.id.textClock);
        final TextClock paris = clock4.findViewById(R.id.textClock);
        final TextClock rome = clock5.findViewById(R.id.textClock);

        tokyo.setTimeZone("Japan");
        ottawa.setTimeZone("Canada");
        paris.setTimeZone("Europe/Paris");
        rome.setTimeZone("Europe/Paris");

        time1 = clock1.findViewById(R.id.imageView2);
        time1.setImageResource(R.drawable.sydney);
        time2 = clock2.findViewById(R.id.imageView2);
        time2.setImageResource(R.drawable.tokyo);
        time3 = clock3.findViewById(R.id.imageView2);
        time3.setImageResource(R.drawable.ottawa);
        time4 = clock4.findViewById(R.id.imageView2);
        time4.setImageResource(R.drawable.paris);
        time5 = clock5.findViewById(R.id.imageView2);
        time5.setImageResource(R.drawable.rome);




    }



    }



