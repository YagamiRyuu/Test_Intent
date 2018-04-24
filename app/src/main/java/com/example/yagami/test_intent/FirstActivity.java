package com.example.yagami.test_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button1 = (Button) findViewById(R.id.btn_1);
        Button button3 = (Button)findViewById(R.id.btn_baidu);
        button1.setOnClickListener(this);
        button3.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_1:
                Toast.makeText(FirstActivity.this, "You clicked Button 1.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent("com.example.yagami.test_intent.ACTION_START");
                intent.addCategory("com.example.yagami.test_intent.MY_CATAGORY");
                startActivity(intent);
                break;
            case R.id.btn_baidu:
                Toast.makeText(FirstActivity.this, "You clicked Baidu.", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.baidu.com"));     //通过Uri.parse() 方法解析目标地址，再用setDate将Uri对象传递进去
                startActivity(intent1);
        }
    }
}