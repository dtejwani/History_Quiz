package com.dhsk.history_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView quesTextView=findViewById(R.id.quesTextView);
        quesTextView.setText("In which year did India gain its independence?");

    }
    int flag=0;

    int score=0;
    int ques=1;
   public void Submit_Clicked(View v){
       update_score(flag);
   }

    public void checkButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.A_radio:
                if (checked)
                    flag=1;

                Toast.makeText(this, "Selected Radio Button: A",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.B_radio:
                if (checked)
                    flag=2;
                Toast.makeText(this, "Selected Radio Button: B",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.C_radio:
                if (checked)
                    flag=3;
                Toast.makeText(this, "Selected Radio Button: C",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.D_radio:
                if (checked)
                    flag=4;
                Toast.makeText(this, "Selected Radio Button: D",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
    private void update_score(int flag){
        if((flag==1)&&(ques==1)||((flag==2)&&(ques==2))||((flag==2)&&(ques==3))||((flag==4)&&(ques==4))||((flag==3)&&(ques==5))){
            score++;
            flag=0;
        }

        ques++;
        update_ques(ques);
    }
    private void update_ques(int ques){
        TextView quesTextView=findViewById(R.id.quesTextView);
        TextView A_veiw= findViewById(R.id.A_veiw);
        TextView B_veiw= findViewById(R.id.B_veiw);
        TextView C_veiw= findViewById(R.id.C_veiw);
        TextView D_veiw= findViewById(R.id.D_veiw);
        if(ques==2){
            quesTextView.setText(" Who built Taj Mahal?");
            A_veiw.setText("Akbar");
            B_veiw.setText("Shah Jahan");
            C_veiw.setText("Babur");
            D_veiw.setText("Humayun");

        }
        if(ques==3){
            quesTextView.setText(" WHEN WAS CONGRESS CREATED?");
            A_veiw.setText("1875");
            B_veiw.setText("1885");
            C_veiw.setText("1902");
            D_veiw.setText("1947");

        }if(ques==4){
            quesTextView.setText("What is Date of birth Of Mahatama Gandhi");
            A_veiw.setText("15 August");
            B_veiw.setText("1 August");
            C_veiw.setText("26 January");
            D_veiw.setText("2 October");

        }if(ques==5){
            quesTextView.setText(" Who is iron man of India?");
            A_veiw.setText("Bhagat Singh");
            B_veiw.setText("Mahatama Gandhi");
            C_veiw.setText("Vallabhbhai Jhaverbhai Patel");
            D_veiw.setText("Humayun");

        }
        if(ques==6){
            Toast.makeText(this,"Your score in the quiz is "+score, Toast.LENGTH_SHORT).show();
            reset();
        }

    }
    private void reset(){
        TextView quesTextView=findViewById(R.id.quesTextView);
        TextView A_veiw= findViewById(R.id.A_veiw);
        TextView B_veiw= findViewById(R.id.B_veiw);
        TextView C_veiw= findViewById(R.id.C_veiw);
        TextView D_veiw= findViewById(R.id.D_veiw);
        ques=1;
        score=0;
        flag=0;
        quesTextView.setText(" In which year did India gain its independence??");
        A_veiw.setText("1947");
        B_veiw.setText("1950");
        C_veiw.setText("1951");
        D_veiw.setText("1953");
    }
}

