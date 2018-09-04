package com.phj;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
/**
 * 测试
 * Created by Administrator on 2018/9/4.
 */

public class SelfView extends android.support.v7.widget.AppCompatTextView {

    public SelfView(Context context) {
        this(context,null);
    }

    public SelfView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,R.attr.attr_defStyle);
    }

    public SelfView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.SelfView,defStyleAttr,0);
        String text1 = typedArray.getString(R.styleable.SelfView_text1);
        String text2 = typedArray.getString(R.styleable.SelfView_text2);
        String text3 = typedArray.getString(R.styleable.SelfView_text3);
        String text4 = typedArray.getString(R.styleable.SelfView_text4);
        typedArray.recycle();

        Log.e(getClass().getSimpleName(), "SelfView: " +text1 );
        Log.e(getClass().getSimpleName(), "SelfView: " +text2 );
        Log.e(getClass().getSimpleName(), "SelfView: " +text3 );
        Log.e(getClass().getSimpleName(), "SelfView: " +text4 );

    }
}
