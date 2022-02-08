package com.example.demo02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","onRestart");
        setContentView(R.layout.activity_main);
        TextView textView1=findViewById(R.id.tv);
        TextView textView2=findViewById(R.id.tv_third);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(intent);
//                Intent intent=new Intent("com.example.activitytest.ACTION_START");
//                intent.addCategory("com.example.activitytest.MY_CATEGORY");
//                startActivity(intent);
//                   Intent intent=new Intent(Intent.ACTION_VIEW);
//                   intent.setData(Uri.parse("https://www.baidu.com"));
                   startActivity(intent);
            }
        });
//        textView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.baidu.com"));
//                startActivity(intent);
//            }
//        });

    }
}