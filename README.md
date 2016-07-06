# ModelViewLib
An Android Library to Help facilitate Model backed ViewGroups and Lists. Think ViewHolder++.

# Benefits

1) Facilitates a clean and consistent pattern
2) Encourages mock data for XML layout previews
3) Makes Views and Lists easy to adapt to your models

# Usage of ModelFrameLayout
- Extend ModelFrameLayout<T> to create simple Model Backed views.

1) Apply a type <T> to map to your Model.
2) Implement bindViews, which does your findViewById() or your Butterknife.injectViews() or however you'd like to do it.
3) Implement bindData() which maps your model to your views
4) Implement clearViews() which sets up your Views Empty state (setModel(null))
5) Implement T getMockData() which returns a default mock object for your view

# Usage of ModelListView
- Extend ModelListView<T> to create a simple model backed list

1) Apply a type <T> to map to your model
2) Implement getView() which returns a IModelView<T> of your type. This is likely a ModelFrameLayout<T> that you implemented for your Model already
3) Implement List<T> getMockList() which is a Mock list of data so your can accurately preview your list in the Layout Editor
