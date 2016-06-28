package com.mysaasa.modelviews;

import android.content.Context;
import android.view.ViewGroup;

/**
 *
 */
public interface IModelView<T> extends IModel<T> {
    int getLayoutId();

    /**
     * Get's the Context of the View Group
     * @return
     */
    Context getContext();


    ViewGroup getTargetViewGroup();

    void bindViews();
    void bindData();
    void clearViews();
    T getMock();

}
