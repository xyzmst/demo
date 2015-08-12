package org.mst.applicationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ImageView gib = new ImageView(this);
        setContentView(gib);
        gib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(MainActivity.this)
                        .load("http://img5.duitang.com/uploads/item/201411/25/20141125200101_QQjNY.gif")
                        .into(gib);
            }
        });


    }


}
