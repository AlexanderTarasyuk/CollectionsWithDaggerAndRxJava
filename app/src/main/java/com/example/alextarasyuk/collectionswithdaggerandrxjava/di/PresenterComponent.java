package com.example.alextarasyuk.collectionswithdaggerandrxjava.di;




import com.example.alextarasyuk.collectionswithdaggerandrxjava.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = PresenterModule.class)
@Singleton
public interface PresenterComponent {

    void inject(MainActivity mainActivity);

}
