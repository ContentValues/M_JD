package com.sxjs.common.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Author：created by SugarT
 * Time：2019/10/8 15
 */
public class LifecycleFragment extends Fragment{

    private long timestamp;

    public String TAG = this.getClass().getName();

    @Override
    public void onAttach(Context context) {
        if (BaseConfig.isDEV()) {
            timestamp = SystemClock.elapsedRealtime();
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onAttach " + timestamp);
        }
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onCreate " + (SystemClock.elapsedRealtime() - timestamp));
        }
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onCreateView " + (SystemClock.elapsedRealtime() - timestamp));
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onViewCreated " + (SystemClock.elapsedRealtime() - timestamp));
        }
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onHiddenChanged " + hidden);
        }
        super.onHiddenChanged(hidden);

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onViewStateRestored");
        }
        super.onViewStateRestored(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onViewStateRestored");
        }
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onViewStateRestored");
        }
        super.onConfigurationChanged(newConfig);
    }


    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onInflate");
        }
        super.onInflate(context, attrs, savedInstanceState);
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onAttachFragment childFragment " + childFragment);
        }
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onStart() {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onStart");
        }
        super.onStart();

    }

    @Override
    public void onResume() {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onResume " + (SystemClock.elapsedRealtime() - timestamp));
        }
        super.onResume();

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onSaveInstanceState");
        }
        super.onSaveInstanceState(outState);
    }


    @Override
    public void onPause() {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onPause");
        }
        super.onPause();

    }


    @Override
    public void onStop() {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onStop");
        }
        super.onStop();

    }

    @Override
    public void onDestroyView() {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onDestroyView");
        }
        super.onDestroyView();

    }

    @Override
    public void onDestroy() {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onDestroy");
        }
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        if (BaseConfig.isDEV()) {
            Log.d(TAG,"FragmentLifeCircle " + this.getClass().getSimpleName() + " onDetach");
        }
        super.onDetach();

    }
}
