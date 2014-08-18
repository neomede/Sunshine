package com.neomede.sunshine.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by neomede on 18/08/14.
 */
public class Utility {
    public static String getPreferredLocation(Context context){
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPrefs.getString(context.getString(R.string.pref_location_key), context.getString(R.string.pref_location_default));
    }
}
