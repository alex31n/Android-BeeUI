package com.ornach.beeuiexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alex.androbeeui.RandomColor;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	Button btnBackgroundColor, btnGridColor, btnDrawable;

	View container;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		container = findViewById(R.id.layout_container);

		btnBackgroundColor = (Button) findViewById(R.id.btn_background);
		btnGridColor = (Button) findViewById(R.id.btn_grid_color);
		btnDrawable = (Button) findViewById(R.id.btn_drawable);

		btnBackgroundColor.setOnClickListener(this);
		btnGridColor.setOnClickListener(this);
		btnDrawable.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {

		if (v.getId()==R.id.btn_background){

			changeBackground();

		}else if (v.getId()==R.id.btn_grid_color){

			Intent i = new Intent(this, GridColorActivity.class);
			startActivity(i);

		}else if (v.getId()==R.id.btn_drawable){

			Intent i = new Intent(this, DrawableActivity.class);
			startActivity(i);

		}


	}


	private void changeBackground(){
		RandomColor randColor = new RandomColor();
		int color = randColor.getRandomColor();
		container.setBackgroundColor(color);
	}
}
