package com.mysaasa.modelviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by adamhammer2 on 2016-06-28.
 */
public class ModelViewDelegate<T> implements IModel<T> {
    private final ViewGroup parent;
    private final IModelView modelview;
    private T model;

    public <T> ModelViewDelegate(ViewGroup parent) {
        this.parent = parent;
        if (!(parent instanceof IModelView)) {
            throw new IllegalArgumentException("Parent viewgroup must implement IModelView");
        }
        modelview = (IModelView) parent;
    }

    @Override
    public void setModel(T model) {
        this.model = model;
        if (model != null) {
            modelview.bindData();
        } else {
            modelview.clearViews();
        }
    }

    @Override
    public T getModel() {
        return model;
    }

    public void initialize() {
        ((LayoutInflater) modelview
                .getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(modelview.getLayoutId(),modelview.getTargetViewGroup());

        modelview.bindViews();

        if (parent.isInEditMode()) {
            modelview.setModel(modelview.getMock());
        } else {
            modelview.clearViews();
        }
    }
}
