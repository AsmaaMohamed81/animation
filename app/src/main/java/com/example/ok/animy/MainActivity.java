package com.example.ok.animy;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button i1;
EditText name ,pass;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(Button) findViewById(R.id.btn_login);
        name=(EditText) findViewById(R.id.edit_name);
        pass=(EditText) findViewById(R.id.edit_password);

        final Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.newanim);
//        i1.startAnimation(animation);
i1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if (TextUtils.isEmpty(name.getText())||TextUtils.isEmpty((pass.getText()))){
            name.startAnimation(animation);
            pass.startAnimation(animation);
        }else {
        Intent i = new Intent(MainActivity.this, TransitionActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }}
});

    }


}
