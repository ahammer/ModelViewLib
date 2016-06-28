package com.mysaasa.modelviews;

/**
 * Interface for model driven components.
 *
 * If it implements this interface it means it has a model.
 */
public interface IModel<T> {
    void setModel(T model);
    T getModel();
}
