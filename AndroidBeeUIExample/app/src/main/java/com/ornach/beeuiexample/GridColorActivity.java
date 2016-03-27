package com.ornach.beeuiexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.alex.androbeeui.RandomColor;

import java.util.List;

public class GridColorActivity extends AppCompatActivity {

	GridView gvColor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_color);

		gvColor = (GridView) findViewById(R.id.gv_color);

		RandomColor randColor = new RandomColor();
		int[] colors = randColor.getRandomColor(20);

		CustomAdapter adapter = new CustomAdapter(this, colors, R.layout.row_single_color_view);
		gvColor.setAdapter(adapter);


	}



	class CustomAdapter extends BaseAdapter{
		Context context;
		int[] colors;
		int layoutResourceId;

		CustomAdapter(Context c, int[] colors, int layoutResourceId){
			this.context =c;
			this.colors = colors;
			this.layoutResourceId = layoutResourceId;
		}

		@Override
		public int getCount() {
			return colors.length;
		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			View row = convertView;
			final int i = position;

			ViewHolder holder = null;

			if (row == null) {
				LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				row = inflater.inflate(layoutResourceId, null);

				holder = new ViewHolder(row);
				row.setTag(holder);
			} else {
				holder = (ViewHolder) row.getTag();
			}

			final int color = colors[i];

			holder.vColor.setBackgroundColor(color);

			return row;
		}


		class ViewHolder {

			TextView vColor;

			ViewHolder(View v) {
				vColor = (TextView) v.findViewById(R.id.view_color);
			}


		}
	}
}
