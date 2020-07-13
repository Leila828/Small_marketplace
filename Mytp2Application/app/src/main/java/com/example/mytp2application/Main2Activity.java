package com.example.mytp2application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private SectionStatePageAdapter msectionStatePageAdapter;
    private ViewPager mViewPage;
    RadioButton R3;
    TextView text;
    int valeur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final RadioButton R1=(RadioButton)  findViewById(R.id.R1);
        final RadioButton R2=(RadioButton)  findViewById(R.id.R2);

        text=(TextView) findViewById(R.id.prix);
        final RadioGroup g=(RadioGroup) findViewById(R.id.g1);
        final TextView url1=(TextView) findViewById(R.id.URL);



        url1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.amazon.com/";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });





        msectionStatePageAdapter =new SectionStatePageAdapter(getSupportFragmentManager());
        mViewPage=(ViewPager) findViewById(R.id.container);
        setUpViewPager(mViewPage);
        Intent intent = getIntent();
        valeur=intent.getIntExtra("var",0);

        mViewPage.setCurrentItem(valeur);
        g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                findCheckedButton(checkedId,valeur);

            }
        });



    }
  public void  findCheckedButton(int checkeId,int valeur){
        text=(TextView) findViewById(R.id.prix);
        if (valeur==0 && checkeId==R.id.R1){
            text.setText("5500 DA");
        }else if (valeur==0 && checkeId==R.id.R2){
            text.setText("5000 DA");
        }else if (valeur==1 && checkeId==R.id.R1){
            text.setText("8000 DA");
        }else if (valeur==1 && checkeId==R.id.R2){
            text.setText("7500 DA");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("my_text",text.getText().toString());
        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        text.setText(savedInstanceState.getString("my_text"));
        super.onRestoreInstanceState(savedInstanceState);

    }
    private void setUpViewPager(ViewPager viewPager) {
        SectionStatePageAdapter adapter=new SectionStatePageAdapter(getSupportFragmentManager());
        adapter.addFragment(new fragment1(),"fram1");
        adapter.addFragment(new fragment2(),"fram2");
        viewPager.setAdapter(adapter);

    }
}
