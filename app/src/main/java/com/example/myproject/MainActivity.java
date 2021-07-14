package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    CheckBox chkAgree;
    RadioGroup Rgroup;
    RadioButton Dog,Cat,Rabbit;
    Button btn;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1=findViewById(R.id.Text1);
        chkAgree = findViewById(R.id.ChkAgree);

        text2=findViewById(R.id.Text2);
        Rgroup=findViewById(R.id.Rgroup);
        Dog=findViewById(R.id.Dog);
        Cat=findViewById(R.id.Cat);
        Rabbit=findViewById(R.id.Rabbit);

        btn=findViewById(R.id.Btn);
        img=findViewById(R.id.Img);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);
                    Rgroup.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    Rgroup.setVisibility(View.INVISIBLE);
                    btn.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                switch (Rgroup.getCheckedRadioButtonId()){
                    case R.id.Dog:
                        img.setImageResource(R.drawable.dog);
                        break;
                    case R.id.Cat:
                        img.setImageResource(R.drawable.cat);
                        break;
                    case R.id.Rabbit:
                        img.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}