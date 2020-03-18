package daiki2.example.demo2;

import android.graphics.Color;
import android.net.Uri;

import android.os.Bundle;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

public class MainActivity extends TapActivity {
    private TextView counter1;
    private TextView counter2;
    private TextView counter3;
    private TextView counter4;
    private TextView counter5;
    private TextView counter6;
    private TextView counter7;
    private TextView counter8;
    private TextView counter9;
    private TextView textView1;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private ImageButton imageButton;
    private int count1;
    private int count2;
    private int count3;
    private int count4;
    private int count5;
    private int count6;
    private int count7;
    private int count8;
    private int count9;

    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.button1:
                    Counter1();
                    break;
                case R.id.button2:
                    Counter2();
                    break;
                case R.id.button3:
                    Counter3();
                    break;
                case R.id.button4:
                    Counter4();
                    break;
                case R.id.button5:
                    Counter5();
                    break;
                case R.id.button6:
                    Counter6();
                    break;
                case R.id.button7:
                    Counter7();
                    break;
                case R.id.button8:
                    Counter8();
                    break;
                case R.id.button9:
                    Counter9();
                    break;
                case R.id.imageButton:

                    initCounter();

                    break;

            }

        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViewGroup((RelativeLayout) findViewById(R.id.tapLayout));


        VideoView videoView = findViewById(R.id.video_View);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.g2;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();
        counter1 = (TextView) findViewById(R.id.counter1);
        counter2 = (TextView) findViewById(R.id.counter2);
        counter3 = (TextView) findViewById(R.id.counter3);
        counter4 = (TextView) findViewById(R.id.counter4);
        counter5 = (TextView) findViewById(R.id.counter5);
        counter6 = (TextView) findViewById(R.id.counter6);
        counter7 = (TextView) findViewById(R.id.counter7);
        counter8 = (TextView) findViewById(R.id.counter8);
        counter9 = (TextView) findViewById(R.id.counter9);
        textView1 = (TextView) findViewById(R.id.textView1) ;
        textView3 = (TextView) findViewById(R.id.textView3) ;
        textView4 = (TextView) findViewById(R.id.textView4) ;
        textView5 = (TextView) findViewById(R.id.textView5) ;
        textView6 = (TextView) findViewById(R.id.textView6) ;
        textView7 = (TextView) findViewById(R.id.textView7) ;
        textView8 = (TextView) findViewById(R.id.textView8) ;
        textView9 = (TextView) findViewById(R.id.textView9) ;
        textView10 = (TextView) findViewById(R.id.textView10) ;
        counter1.setTextColor(Color.BLACK);
        counter2.setTextColor(Color.BLACK);
        counter3.setTextColor(Color.BLACK);
        counter4.setTextColor(Color.BLACK);
        counter5.setTextColor(Color.BLACK);
        counter6.setTextColor(Color.BLACK);
        counter7.setTextColor(Color.BLACK);
        counter8.setTextColor(Color.BLACK);
        counter9.setTextColor(Color.BLACK);
        textView1.setTextColor(Color.BLACK);
        textView3.setTextColor(Color.BLACK);
        textView4.setTextColor(Color.BLACK);
        textView5.setTextColor(Color.BLACK);
        textView6.setTextColor(Color.BLACK);
        textView7.setTextColor(Color.BLACK);
        textView8.setTextColor(Color.BLACK);
        textView9.setTextColor(Color.BLACK);
        textView10.setTextColor(Color.BLACK);
        counter1.setBackgroundColor(Color.parseColor("white"));
        counter2.setBackgroundColor(Color.parseColor("white"));
        counter3.setBackgroundColor(Color.parseColor("white"));
        counter4.setBackgroundColor(Color.parseColor("white"));
        counter5.setBackgroundColor(Color.parseColor("white"));
        counter6.setBackgroundColor(Color.parseColor("white"));
        counter7.setBackgroundColor(Color.parseColor("white"));
        counter8.setBackgroundColor(Color.parseColor("white"));
        counter9.setBackgroundColor(Color.parseColor("white"));
        textView1.setBackgroundColor(Color.parseColor("white"));
        textView3.setBackgroundColor(Color.parseColor("white"));
        textView4.setBackgroundColor(Color.parseColor("white"));
        textView5.setBackgroundColor(Color.parseColor("white"));
        textView6.setBackgroundColor(Color.parseColor("white"));
        textView7.setBackgroundColor(Color.parseColor("white"));
        textView8.setBackgroundColor(Color.parseColor("white"));
        textView9.setBackgroundColor(Color.parseColor("white"));
        textView10.setBackgroundColor(Color.parseColor("white"));



        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(clickListener);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(clickListener);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(clickListener);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(clickListener);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(clickListener);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(clickListener);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(clickListener);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(clickListener);
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(clickListener);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(clickListener);


        button1.setOnTouchListener(new View.OnTouchListener() {
            // ボタンがタッチされた時のハンドラ
            public boolean onTouch(View v, MotionEvent event) {
                float pointX = event.getX()+950;
                float pointY = event.getY();
                float dp = getResources().getDisplayMetrics().density;
                int imgSize = (int) (50 * dp);
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    final ImageView img = new ImageView(getApplicationContext());
                    img.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img.setLayoutParams(params);

                    img.setX(pointX-imgSize/2);
                    img.setY(pointY-imgSize/2);
                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                    img.setScaleX(0.5f);
                    img.setScaleY(0.5F);
                    viewGroup.addView(img);
                    ViewCompat.animate(img)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(1)
                            .scaleY(1)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();

                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    final ImageView img2 = new ImageView(getApplicationContext());
                    img2.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img2.setLayoutParams(params2);

                    img2.setX(pointX-imgSize/2);
                    img2.setY(pointY-imgSize/2);
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);

                    viewGroup.addView(img2);

//0.3秒かけて縮小しながら透明になるアニメーション
                    ViewCompat.animate(img2)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(0.01f)
                            .scaleY(0.01f)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img2);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();
                }
                return false;
            }
        });
        button2.setOnTouchListener(new View.OnTouchListener() {
            // ボタンがタッチされた時のハンドラ
            public boolean onTouch(View v, MotionEvent event) {
                float pointX = event.getX()+820;
                float pointY = event.getY()+180;
                float dp = getResources().getDisplayMetrics().density;
                int imgSize = (int) (50 * dp);
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    final ImageView img = new ImageView(getApplicationContext());
                    img.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img.setLayoutParams(params);

                    img.setX(pointX-imgSize/2);
                    img.setY(pointY-imgSize/2);
                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                    img.setScaleX(0.5f);
                    img.setScaleY(0.5F);
                    viewGroup.addView(img);
                    ViewCompat.animate(img)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(1)
                            .scaleY(1)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();

                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    final ImageView img2 = new ImageView(getApplicationContext());
                    img2.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img2.setLayoutParams(params2);

                    img2.setX(pointX-imgSize/2);
                    img2.setY(pointY-imgSize/2);
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);

                    viewGroup.addView(img2);

//0.3秒かけて縮小しながら透明になるアニメーション
                    ViewCompat.animate(img2)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(0.01f)
                            .scaleY(0.01f)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img2);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();
                }
                return false;
            }
        });
        button3.setOnTouchListener(new View.OnTouchListener() {
            // ボタンがタッチされた時のハンドラ
            public boolean onTouch(View v, MotionEvent event) {
                float pointX = event.getX()+1030;
                float pointY = event.getY()+180;
                float dp = getResources().getDisplayMetrics().density;
                int imgSize = (int) (50 * dp);
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    final ImageView img = new ImageView(getApplicationContext());
                    img.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img.setLayoutParams(params);

                    img.setX(pointX-imgSize/2);
                    img.setY(pointY-imgSize/2);
                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                    img.setScaleX(0.5f);
                    img.setScaleY(0.5F);
                    viewGroup.addView(img);
                    ViewCompat.animate(img)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(1)
                            .scaleY(1)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();

                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    final ImageView img2 = new ImageView(getApplicationContext());
                    img2.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img2.setLayoutParams(params2);

                    img2.setX(pointX-imgSize/2);
                    img2.setY(pointY-imgSize/2);
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);

                    viewGroup.addView(img2);

//0.3秒かけて縮小しながら透明になるアニメーション
                    ViewCompat.animate(img2)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(0.01f)
                            .scaleY(0.01f)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img2);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();
                }
                return false;
            }
        });
        button4.setOnTouchListener(new View.OnTouchListener() {
            // ボタンがタッチされた時のハンドラ
            public boolean onTouch(View v, MotionEvent event) {
                float pointX = event.getX()+820;
                float pointY = event.getY()+360;
                float dp = getResources().getDisplayMetrics().density;
                int imgSize = (int) (50 * dp);
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    final ImageView img = new ImageView(getApplicationContext());
                    img.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img.setLayoutParams(params);

                    img.setX(pointX-imgSize/2);
                    img.setY(pointY-imgSize/2);
                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                    img.setScaleX(0.5f);
                    img.setScaleY(0.5F);
                    viewGroup.addView(img);
                    ViewCompat.animate(img)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(1)
                            .scaleY(1)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();

                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    final ImageView img2 = new ImageView(getApplicationContext());
                    img2.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img2.setLayoutParams(params2);

                    img2.setX(pointX-imgSize/2);
                    img2.setY(pointY-imgSize/2);
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);

                    viewGroup.addView(img2);

//0.3秒かけて縮小しながら透明になるアニメーション
                    ViewCompat.animate(img2)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(0.01f)
                            .scaleY(0.01f)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img2);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();
                }
                return false;
            }
        });
        button5.setOnTouchListener(new View.OnTouchListener() {
            // ボタンがタッチされた時のハンドラ
            public boolean onTouch(View v, MotionEvent event) {
                float pointX = event.getX()+1030;
                float pointY = event.getY()+360;
                float dp = getResources().getDisplayMetrics().density;
                int imgSize = (int) (50 * dp);
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    final ImageView img = new ImageView(getApplicationContext());
                    img.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img.setLayoutParams(params);

                    img.setX(pointX-imgSize/2);
                    img.setY(pointY-imgSize/2);
                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                    img.setScaleX(0.5f);
                    img.setScaleY(0.5F);
                    viewGroup.addView(img);
                    ViewCompat.animate(img)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(1)
                            .scaleY(1)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();

                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    final ImageView img2 = new ImageView(getApplicationContext());
                    img2.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img2.setLayoutParams(params2);

                    img2.setX(pointX-imgSize/2);
                    img2.setY(pointY-imgSize/2);
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);

                    viewGroup.addView(img2);

//0.3秒かけて縮小しながら透明になるアニメーション
                    ViewCompat.animate(img2)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(0.01f)
                            .scaleY(0.01f)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img2);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();
                }
                return false;
            }
        });
        button6.setOnTouchListener(new View.OnTouchListener() {
            // ボタンがタッチされた時のハンドラ
            public boolean onTouch(View v, MotionEvent event) {
                float pointX = event.getX()+900;
                float pointY = event.getY()+570;
                float dp = getResources().getDisplayMetrics().density;
                int imgSize = (int) (50 * dp);
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    final ImageView img = new ImageView(getApplicationContext());
                    img.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img.setLayoutParams(params);

                    img.setX(pointX-imgSize/2);
                    img.setY(pointY-imgSize/2);
                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                    img.setScaleX(0.5f);
                    img.setScaleY(0.5F);
                    viewGroup.addView(img);
                    ViewCompat.animate(img)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(1)
                            .scaleY(1)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();

                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    final ImageView img2 = new ImageView(getApplicationContext());
                    img2.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img2.setLayoutParams(params2);

                    img2.setX(pointX-imgSize/2);
                    img2.setY(pointY-imgSize/2);
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);

                    viewGroup.addView(img2);

//0.3秒かけて縮小しながら透明になるアニメーション
                    ViewCompat.animate(img2)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(0.01f)
                            .scaleY(0.01f)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img2);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();
                }
                return false;
            }
        });
        button7.setOnTouchListener(new View.OnTouchListener() {
            // ボタンがタッチされた時のハンドラ
            public boolean onTouch(View v, MotionEvent event) {
                float pointX = event.getX()+660;
                float pointY = event.getY()+560;
                float dp = getResources().getDisplayMetrics().density;
                int imgSize = (int) (50 * dp);
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    final ImageView img = new ImageView(getApplicationContext());
                    img.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img.setLayoutParams(params);

                    img.setX(pointX-imgSize/2);
                    img.setY(pointY-imgSize/2);
                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                    img.setScaleX(0.5f);
                    img.setScaleY(0.5F);
                    viewGroup.addView(img);
                    ViewCompat.animate(img)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(1)
                            .scaleY(1)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();

                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    final ImageView img2 = new ImageView(getApplicationContext());
                    img2.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img2.setLayoutParams(params2);

                    img2.setX(pointX-imgSize/2);
                    img2.setY(pointY-imgSize/2);
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);

                    viewGroup.addView(img2);

//0.3秒かけて縮小しながら透明になるアニメーション
                    ViewCompat.animate(img2)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(0.01f)
                            .scaleY(0.01f)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img2);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();
                }
                return false;
            }
        });
        button8.setOnTouchListener(new View.OnTouchListener() {
            // ボタンがタッチされた時のハンドラ
            public boolean onTouch(View v, MotionEvent event) {
                float pointX = event.getX()+1150;
                float pointY = event.getY()+580;
                float dp = getResources().getDisplayMetrics().density;
                int imgSize = (int) (50 * dp);
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    final ImageView img = new ImageView(getApplicationContext());
                    img.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img.setLayoutParams(params);

                    img.setX(pointX-imgSize/2);
                    img.setY(pointY-imgSize/2);
                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                    img.setScaleX(0.5f);
                    img.setScaleY(0.5F);
                    viewGroup.addView(img);
                    ViewCompat.animate(img)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(1)
                            .scaleY(1)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();

                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    final ImageView img2 = new ImageView(getApplicationContext());
                    img2.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img2.setLayoutParams(params2);

                    img2.setX(pointX-imgSize/2);
                    img2.setY(pointY-imgSize/2);
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);

                    viewGroup.addView(img2);

//0.3秒かけて縮小しながら透明になるアニメーション
                    ViewCompat.animate(img2)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(0.01f)
                            .scaleY(0.01f)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img2);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();
                }
                return false;
            }
        });
        button9.setOnTouchListener(new View.OnTouchListener() {
            // ボタンがタッチされた時のハンドラ
            public boolean onTouch(View v, MotionEvent event) {
                float pointX = event.getX()+880;
                float pointY = event.getY()+800;
                float dp = getResources().getDisplayMetrics().density;
                int imgSize = (int) (50 * dp);
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    final ImageView img = new ImageView(getApplicationContext());
                    img.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img.setLayoutParams(params);

                    img.setX(pointX-imgSize/2);
                    img.setY(pointY-imgSize/2);
                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                    img.setScaleX(0.5f);
                    img.setScaleY(0.5F);
                    viewGroup.addView(img);
                    ViewCompat.animate(img)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(1)
                            .scaleY(1)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();

                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    final ImageView img2 = new ImageView(getApplicationContext());
                    img2.setImageResource(R.drawable.ic_favorite_red_400_36dp);
                    LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(imgSize, imgSize);
                    img2.setLayoutParams(params2);

                    img2.setX(pointX-imgSize/2);
                    img2.setY(pointY-imgSize/2);
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);

                    viewGroup.addView(img2);

//0.3秒かけて縮小しながら透明になるアニメーション
                    ViewCompat.animate(img2)
                            .setDuration(300)
                            .alpha(0)
                            .scaleX(0.01f)
                            .scaleY(0.01f)
                            .setListener(new ViewPropertyAnimatorListener() {
                                @Override
                                public void onAnimationStart(View view) {

                                }

                                @Override
                                public void onAnimationEnd(View view) {
                                    viewGroup.removeView(img2);
                                }

                                @Override
                                public void onAnimationCancel(View view) {

                                }
                            }).start();
                }
                return false;
            }
        });

        count1 = 0;
        count2 = 0;
        count3 = 0;
        count4 = 0;
        count5 = 0;
        count6 = 0;
        count7 = 0;
        count8 = 0;
        count9 = 0;
        counter1.setText(count1 + "");
        counter2.setText(count2 + "");
        counter3.setText(count3 + "");
        counter4.setText(count4 + "");
        counter5.setText(count5 + "");
        counter6.setText(count6 + "");
        counter7.setText(count7 + "");
        counter8.setText(count8 + "");
        counter9.setText(count9 + "");

    }
    private void initCounter(){

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                count1 = 0;
                count2 = 0;
                count3 = 0;
                count4 = 0;
                count5 = 0;
                count6 = 0;
                count7 = 0;
                count8 = 0;
                count9 = 0;
                counter1.setText(count1 + "");
                counter2.setText(count2 + "");
                counter3.setText(count3 + "");
                counter4.setText(count4 + "");
                counter5.setText(count5 + "");
                counter6.setText(count6 + "");
                counter7.setText(count7 + "");
                counter8.setText(count8 + "");
                counter9.setText(count9 + "");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.touch);
                view.startAnimation(animation);

            }
        });
    }
    private void Counter1(){
        count1++;
        counter1.setText(count1 + "");
    }
    private void Counter2(){
        count2++;
        counter2.setText(count2 + "");
    }
    private void Counter3(){
        count3++;
        counter3.setText(count3 + "");
    }
    private void Counter4(){
        count4++;
        counter4.setText(count4 + "");
    }
    private void Counter5(){
        count5++;
        counter5.setText(count5 + "");
    }
    private void Counter6(){
        count6++;
        counter6.setText(count6 + "");
    }
    private void Counter7(){
        count7++;
        counter7.setText(count7 + "");
    }
    private void Counter8(){
        count8++;
        counter8.setText(count8 + "");
    }
    private void Counter9(){
        count9++;
        counter9.setText(count9 + "");
    }


}
