package com.jwy.game2048;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by kim on 15-3-5.
 */
public class Card extends FrameLayout {
    public Card(Context context) {
        super(context);

        label = new TextView(getContext());
        label.setTextSize(32);
        label.setGravity(Gravity.CENTER);
        label.setBackgroundColor(0x33ffffff);
//        if(getNum() == 2) {
//        }else if(getNum() == 4){
//            label.setBackgroundColor(0x00f3d774);
//        }else if(getNum() == 8){
//            label.setTextColor(0x00f9f6f2);
//            label.setBackgroundColor(0x00f2b179);
//        }


        LayoutParams lp = new LayoutParams(-1, -1);
        lp.setMargins(10, 10, 0, 0);
        addView(label, lp);

        setNum(0);
    }

    private int num = 0;

    private TextView label;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;

        if (num == 0) {
            label.setText("");
        } else {
            label.setText(num + "");
        }
    }

    public boolean equals(Card o) {
        return getNum() == o.getNum();
    }
}
