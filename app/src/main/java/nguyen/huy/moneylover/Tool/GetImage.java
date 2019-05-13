package nguyen.huy.moneylover.Tool;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import nguyen.huy.moneylover.R;

public class GetImage {

    public static Bitmap getBitmapFromString(Context context,String BitmapString) {
        Resources res = context.getResources();
        Bitmap bitmap = null;
        if (res.getString(R.string.ts_awarded).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_award96);
        } else if (res.getString(R.string.ts_bill).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_bill128);
        } else if (res.getString(R.string.ts_business).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_business96);
        } else if (res.getString(R.string.ts_eating).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_eat96);
        } else if (res.getString(R.string.ts_education).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_education96);
        } else if (res.getString(R.string.ts_entertainment).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_entertainment96);
        } else if (res.getString(R.string.ts_fee).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_fee);
        } else if (res.getString(R.string.ts_friend_n_love).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_heart96);
        } else if (res.getString(R.string.ts_gift).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_gift96);
        } else if (res.getString(R.string.ts_health).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_health96);
        } else if (res.getString(R.string.ts_home).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_home96);
        } else if (res.getString(R.string.ts_income_other).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_gift96);
        } else if (res.getString(R.string.ts_insurance).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_insurrance96);
        } else if (res.getString(R.string.ts_interest).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.tienlai);
        } else if (res.getString(R.string.ts_invest).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_invest96);
        } else if (res.getString(R.string.ts_reward).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_reward96);
        } else if (res.getString(R.string.ts_salary).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_salary_96);
        } else if (res.getString(R.string.ts_sale).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_sale96);
        } else if (res.getString(R.string.ts_deposit).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.guitien);
        } else if (res.getString(R.string.ts_shopping).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_shopping96);
        } else if (res.getString(R.string.ts_transport).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_transportation);
        } else if (res.getString(R.string.ts_travel).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.minh_travel96);
        } else if (res.getString(R.string.ts_withdraw).equals(BitmapString)) {
            bitmap = BitmapFactory.decodeResource(res, R.drawable.ruttien);
        }
        return bitmap;
    }
}
