package com.mysaasa.modelviewlibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class is Mock data to verify that the system works the way it does
 */
public class SampleBlogPost {
    static final List<SampleBlogPost> MOCK_LIST;
    static {

        MOCK_LIST = Collections.unmodifiableList(Arrays.asList(
            new SampleBlogPost("First Post",
                    "This is the First Post",
                    "This is the body of the first post",
                    "Adam H"),

            new SampleBlogPost("Second Post",
                    "This is the Second Post",
                    "This is the body of the second post",
                    "John K"),

            new SampleBlogPost("Third Post",
                    "This is the Third Post",
                    "This is the body of the third post",
                    "Mike N"),

            new SampleBlogPost("Fourth Post",
                    "If you can guess, this is the Fourth post",
                    "This is the body of the fourth post",
                    "Evan L")));
    }


    public final String title;
    public final String subtitle;
    public final String body;
    public final String author;

    public SampleBlogPost(String title, String subtitle, String body, String author) {
        this.title = title;
        this.subtitle = subtitle;
        this.body = body;
        this.author = author;
    }

    @Override
    public String toString() {
        return "SampleBlogPost{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
