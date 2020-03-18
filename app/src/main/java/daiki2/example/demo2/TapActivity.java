package daiki2.example.demo2;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

public class TapActivity extends Activity {

    //ViewGroupを定義
    ViewGroup viewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //ViewGroupを受け取るメソッドを準備
    public void setViewGroup(ViewGroup vg){
        viewGroup = vg;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float pointX = event.getX();
        float pointY = event.getY();
        float dp = getResources().getDisplayMetrics().density;
        int imgSize = (int)(50 * dp);

//switch文でアクションを分岐
        switch (event.getAction()){
//画面タップ時
            case MotionEvent.ACTION_DOWN:

                break;

//画面から指が離れた時
            case MotionEvent.ACTION_UP:
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
                break;

//画面タップのまま指を動かした時
            case MotionEvent.ACTION_MOVE:
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
                break;
        }


        return super.onTouchEvent(event);
    }
}