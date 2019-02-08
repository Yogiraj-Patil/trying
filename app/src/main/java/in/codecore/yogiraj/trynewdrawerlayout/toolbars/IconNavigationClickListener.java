package in.codecore.yogiraj.trynewdrawerlayout.toolbars;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import in.codecore.yogiraj.trynewdrawerlayout.R;

public class IconNavigationClickListener implements View.OnClickListener {

    private AnimatorSet animatorSet = new AnimatorSet();
    private Context context;
    private View sheet;
    private Interpolator interpolator;
    private int height;
    private boolean backdropshow = false;
    private Drawable openIcon;
    private Drawable closeIcon;

    public IconNavigationClickListener(Context context, View sheet) {
        this(context,sheet,null);
    }
    public IconNavigationClickListener(Context context, View sheet, @Nullable Interpolator interpolator){
        this(context,sheet,interpolator,null,null);
    }
    public IconNavigationClickListener(Context context, View sheet, @Nullable Interpolator interpolator,@Nullable Drawable openIcon, @Nullable Drawable closeIcon)
    {
        this.context = context;
        this.sheet = sheet;
        this.interpolator = interpolator;
        this.openIcon = openIcon;
        this.closeIcon = closeIcon;

        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        height = displayMetrics.heightPixels;
        height = (int) (height/1.5);
    }


    @Override
    public void onClick(View v) {
       onclickListener(v);
    }

    public void onclickListener(View v)
    {
        backdropshow =! backdropshow;

        animatorSet.removeAllListeners();
        animatorSet.end();
        animatorSet.cancel();
        updateIcon(v);

        final int translateY = height - context.getResources().getDimensionPixelSize(R.dimen.shr_product_grid_reveal_height);

        ObjectAnimator animator = ObjectAnimator.ofFloat(sheet,"TranslationY",backdropshow ? translateY : 0);
        animator.setDuration(900);
        if(interpolator != null)
        {
            animator.setInterpolator(interpolator);
        }
        animatorSet.play(animator);
        animator.start();
    }

    private void updateIcon(View v){
        if(openIcon != null && closeIcon !=null)
        {
            if(!(v instanceof ImageView)){
                throw new IllegalArgumentException("UpdateIcon() must be call on imageView");
            }
            if(backdropshow){
                ((ImageView)v).setImageDrawable(closeIcon);
            }else{
                ((ImageView)v).setImageDrawable(openIcon);
            }
        }
    }
}
