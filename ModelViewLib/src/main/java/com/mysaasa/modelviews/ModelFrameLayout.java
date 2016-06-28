package com.mysaasa.modelviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by adamhammer2 on 2016-06-25.
 */
public abstract class ModelFrameLayout<T> extends FrameLayout implements IModelView<T> {
    ModelViewDelegate<T> modelViewDelegate = new ModelViewDelegate(this);

    public ModelFrameLayout(Context context) {
        super(context);
        modelViewDelegate.initialize();
    }

    public ModelFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        modelViewDelegate.initialize();
    }

    public ModelFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        modelViewDelegate.initialize();
    }

    @Override
    public ViewGroup getTargetViewGroup() {
        return this;
    }

    @Override
    public void setModel(T model) {
        modelViewDelegate.setModel(model);
    }

    @Override
    public T getModel() {
        return modelViewDelegate.getModel();
    }
}
