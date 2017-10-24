package com.sunlight.mytaxi.splash;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.sunlight.mytaxi.R;

/**
 * Created by Amuro on 2017/10/24.
 */

public class SplashActivity extends AppCompatActivity
{
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		playLogoAnim();
	}

	private void playLogoAnim()
	{
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
		{
			AnimatedVectorDrawable logoAnim =
					(AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim_logo);
			ImageView imageViewLogo =
					(ImageView) findViewById(R.id.iv_logo);
			imageViewLogo.setImageDrawable(logoAnim);
			logoAnim.start();
		}

	}
}
