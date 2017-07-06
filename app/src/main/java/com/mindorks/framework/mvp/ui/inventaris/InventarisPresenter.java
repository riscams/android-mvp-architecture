package com.mindorks.framework.mvp.ui.inventaris;

import com.mindorks.framework.mvp.data.DataManager;
import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.ui.base.MvpView;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by RISCA on 6/14/2017.
 */

public class InventarisPresenter <V extends MvpView> extends BasePresenter<V> implements InventarisMvpPresenter<V> {

    private static final String TAG = "InventarisPresenter";

    @Inject

  public InventarisPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
    super(dataManager, schedulerProvider, compositeDisposable);
  }
}
