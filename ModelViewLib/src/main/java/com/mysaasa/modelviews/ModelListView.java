package com.mysaasa.modelviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by adamhammer2 on 2016-06-28.
 */
public abstract class ModelListView<T> extends ListView {
    private List<T> data;

    public ModelListView(Context context) {
        super(context);
        init();
    }

    public ModelListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ModelListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (isInEditMode()) {
            setData(getMockList());
        }
    }

    public void setData(final List<T> data) {
        this.data = data;
        super.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return data.size();
            }

            @Override
            public Object getItem(int position) {
                return data.get(position);
            }

            @Override
            public long getItemId(int position) {
                return getItem(position).hashCode();
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                IModelView<T> view = ModelListView.this.getView();
                view.setModel((T)getItem(position));
                return (View) view;
            }
        });
    }

    @Override
    public void setAdapter(ListAdapter adapter) {
        throw new IllegalStateException("Override getView to create a IModelView for this list");
    }

    public abstract IModelView<T> getView();

    public abstract List<T> getMockList();

}
