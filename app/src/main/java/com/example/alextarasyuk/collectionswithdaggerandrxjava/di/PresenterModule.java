package com.example.alextarasyuk.collectionswithdaggerandrxjava.di;



import com.example.alextarasyuk.collectionswithdaggerandrxjava.contract.Contract;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.presenter.ListPresenterImpl;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.presenter.MapPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {


    @Provides
    @Singleton
    public static Contract.ListPresenter provideListPresenter() {
        return new ListPresenterImpl();
    }

    @Provides
    @Singleton
    public static Contract.MapPresenter provideMapPresenter() {
        return new MapPresenterImpl();
    }


}
