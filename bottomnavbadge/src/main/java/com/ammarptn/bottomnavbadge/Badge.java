package com.ammarptn.bottomnavbadge;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class Badge extends AppCompatTextView {


    public Badge(Context context) {
        super(context);
    }

    public Badge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Badge(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setNumber(int number) {
        setText(String.valueOf(number));
    }

    public void hide() {
        setVisibility(GONE);
    }

    public void show() {
        setVisibility(VISIBLE);

    }


}
