package cjd19.gpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button GPAbtn = (Button) findViewById(R.id.GPAbtn);
        GPAbtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                EditText FirstGradeET = (EditText) findViewById(R.id.FirstGradeET);
                EditText SecondGradeET = (EditText) findViewById(R.id.SecondGradeET);
                EditText ThirdGradeET = (EditText) findViewById(R.id.ThirdGradeET);
                EditText FourthGradeET = (EditText) findViewById(R.id.FourthGradeET);
                EditText FifthGradeET = (EditText) findViewById(R.id.FifthGradeET);
                TextView Result = (TextView) findViewById(R.id.Result);

                int num1 = Integer.parseInt(FirstGradeET.getText().toString());
                int num2 = Integer.parseInt(SecondGradeET.getText().toString());
                int num3 = Integer.parseInt(ThirdGradeET.getText().toString());
                int num4 = Integer.parseInt(FourthGradeET.getText().toString());
                int num5 = Integer.parseInt(FifthGradeET.getText().toString());
                int Add = num1+num2+num3+num4+num5;
                int AVG = Add/5;

                Result.setText(AVG + "");
                String a;

                if(AVG < 60) {
                    //set background to red
                } else if (AVG < 79)
                {
                    //set background to yellow
                }
                else
                    {
                        //set background to green
                }

            }
        });
    }
}
