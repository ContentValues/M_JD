package com.sxjs.common;

import android.content.Context;

import com.sxjs.common.model.DataManager;
import com.sxjs.common.model.dao.DataBaseHelper;
import com.sxjs.common.model.http.HttpHelper;
import com.sxjs.common.model.sp.SharePreferenceHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by admin on 2017/3/10.
 */
public class AppComponent {

    public static AppComponent instance = null;

    private static Context mContext;
    private static DataManager mDataManager;

    private AppComponent() {
        mDataManager = new DataManager(mContext, new HttpHelper(mContext), new SharePreferenceHelper(mContext), new DataBaseHelper(mContext));

    }

    public static synchronized AppComponent newInstance(Context context) {
        mContext = context;
        if (instance == null) {
            instance = new AppComponent();
        }
        return instance;

    }

    public Context getContext() {
        return mContext;
    }


    public DataManager getDataManager() {
        return mDataManager;
    }


}
