package com.example.alextarasyuk.collectionswithdaggerandrxjava.di;





import com.example.alextarasyuk.collectionswithdaggerandrxjava.contract.Contract;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.dao.ListDaoImpl;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.dao.MapDaoImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CalculationModule {

    @Singleton
    @Provides
    public static Contract.ListDao provideListModel() {

        return new ListDaoImpl();

    }

    @Singleton
    @Provides
    public static Contract.MapDao provideMapModel() {
        return new MapDaoImpl();
    }
}
