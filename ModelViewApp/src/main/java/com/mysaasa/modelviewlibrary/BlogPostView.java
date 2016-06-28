package com.mysaasa.modelviewlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.mysaasa.modelviews.ModelFrameLayout;

/**
 * This class extends ModelFrameLayout with a type SampleBlogPost
 */
public class BlogPostView extends ModelFrameLayout<SampleBlogPost> {
    TextView title,subtitle,body,author;

    public BlogPostView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public BlogPostView(Context context) {
        super(context);
    }

    public BlogPostView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int getLayoutId() {
        return R.layout.blog_post_layout;
    }

    @Override
    public void bindViews() {
        title = (TextView) findViewById(R.id.title);
        subtitle = (TextView) findViewById(R.id.subtitle);
        body = (TextView) findViewById(R.id.body);
        author = (TextView) findViewById(R.id.author);
    }

    @Override
    public void bindData() {
        SampleBlogPost model = getModel();
        title.setText(model.title);
        subtitle.setText(model.subtitle);
        body.setText(model.body);
        author.setText(model.author);
    }

    @Override
    public void clearViews() {
        title.setText("");
        subtitle.setText("");
        body.setText("");
        author.setText("");
    }

    @Override
    public SampleBlogPost getMock() {
        return SampleBlogPost.MOCK_LIST.get(0);
    }
}
