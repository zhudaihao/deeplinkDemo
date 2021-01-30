package com.gemini.cloud.app.deeplinkdemo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

import java.util.List;

public class DeepLinkUtils {

    //跳转指定应用页面
    public static boolean jumpApp(Context ctx, String url) {

        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse(url));

            List<ResolveInfo> queryIntentActivities = ctx.getPackageManager().queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                ctx.startActivity(intent);
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
