package com.zys.ndkjnitest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by zhuys on 2016/8/16 0016.
 */
public class MainActivity extends ActionBarActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) this.findViewById(R.id.test);

        NdkJniUtils jni = new NdkJniUtils();

        mTextView.setText(jni.getCLanguageString());
    }
}
