package com.mysaasa.modelviewlibrary;

import android.content.Context;
import android.util.AttributeSet;

import com.mysaasa.modelviews.IModelView;
import com.mysaasa.modelviews.ModelListView;

import java.util.List;

/**
 * Created by adamhammer2 on 2016-06-28.
 */
public class BlogPostListView extends ModelListView<SampleBlogPost> {
    public BlogPostListView(Context context) {
        super(context);
    }

    public BlogPostListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BlogPostListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public IModelView<SampleBlogPost> getView() {
        return new BlogPostView(getContext());
    }

    @Override
    public List<SampleBlogPost> getMockList() {
        return SampleBlogPost.MOCK_LIST;
    }
}
