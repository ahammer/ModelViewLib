package com.mysaasa.modelviewlibrary;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;

/**
 * This Activity demonstrates the usage of this library
 *
 * It Shows a sample ModelFrameLayout and a ModelListView working
 * with the SampleBlogPost class included
 */
public class TestActivity extends Activity {
    BlogPostView blogPostView;
    BlogPostListView blogPostListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //Find Views
        blogPostView = (BlogPostView) findViewById(R.id.single_item);
        blogPostListView = (BlogPostListView) findViewById(R.id.list);

        //Setup List
        blogPostListView.setData(SampleBlogPost.MOCK_LIST);
        blogPostListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //When Clicking a Item, put it in the Single Item place
                SampleBlogPost selected = (SampleBlogPost) parent.getAdapter().getItem(position);
                blogPostView.setModel(selected);
            }
        });
    }

}
