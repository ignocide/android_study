package kim.sungmin.androidstudy.widget;

/**
 * Created by Administrator on 2016-07-21.
 */
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by Administrator on 2016-07-21.
 */
public class RistView extends RecyclerView {

    public RistView(Context context) {
        super(context);
    }

    public RistView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RistView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }



    //스크롤 속도 조절
    @Override
    public boolean fling(int velocityX, int velocityY) {
//        return false;
        velocityY = (int) (velocityY/(4));
        velocityX = (int) (velocityX/(4));
        return super.fling(velocityX, velocityY);
    }
}
