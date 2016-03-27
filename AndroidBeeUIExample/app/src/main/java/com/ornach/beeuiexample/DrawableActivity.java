package com.ornach.beeuiexample;

import android.graphics.drawable.StateListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.alex.androbeeui.DrawableBee;
import com.alex.androbeeui.RandomColor;

public class DrawableActivity extends AppCompatActivity {

	Button btn1, btn2, btn3, btn4, btn5,btn6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drawable);

		btn1 = (Button) findViewById(R.id.btn_1);
		btn2 = (Button) findViewById(R.id.btn_2);
		btn3 = (Button) findViewById(R.id.btn_3);
		btn4 = (Button) findViewById(R.id.btn_4);
		btn5 = (Button) findViewById(R.id.btn_5);
		btn6 = (Button) findViewById(R.id.btn_6);



		btn1.setBackground(getDrawable());
		btn2.setBackground(getDrawable());
		btn3.setBackground(getDrawable());
		btn4.setBackground(getDrawable());
		btn5.setBackground(getDrawable());
		btn6.setBackground(getDrawable());
	}

	private StateListDrawable getDrawable(){
		int[] colors = new RandomColor().getRandomColor(2);
		StateListDrawable d = DrawableBee.makeSelector(colors[0], colors[1]);

		return  d;
	}
}
