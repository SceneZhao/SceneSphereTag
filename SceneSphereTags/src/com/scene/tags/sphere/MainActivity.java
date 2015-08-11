package com.scene.tags.sphere;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		CloudView view = (CloudView) findViewById(R.id.cloudview);
		ArrayList<TagView> tags = new ArrayList<TagView>();
		int len = 20;
		for (int i = 0; i  < len; i ++) {
			TagView tag = new TagView(this);
			tag.setText("PL" + i);
			tag.setTextColor(Color.BLACK);
			tag.setGravity(Gravity.CENTER);
			RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
			view.addView(tag, p);
			tags.add(tag);
		}
		view.setCloudTags(tags);
	}

}
