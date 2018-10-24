package com.example.alextarasyuk.collectionswithdaggerandrxjava.di;



import com.example.alextarasyuk.collectionswithdaggerandrxjava.presenter.ListPresenterImpl;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.presenter.MapPresenterImpl;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = CalculationModule.class)
@Singleton
public interface ModelComponent {

    void inject(ListPresenterImpl listPresenter);
    void inject(MapPresenterImpl mapPresenter);


}
