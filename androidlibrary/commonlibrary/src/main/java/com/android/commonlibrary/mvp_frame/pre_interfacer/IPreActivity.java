package com.android.commonlibrary.mvp_frame.pre_interfacer;

/**
 * Title:获取Presenter对象的接口
 * description:
 * autor:pei
 * created on 2020/4/28
 */
public interface IPreActivity {

        <T extends PrePresenter>T getPresenter();
}
