package com.example.alextarasyuk.collectionswithdaggerandrxjava.dao;

import android.os.AsyncTask;


import com.example.alextarasyuk.collectionswithdaggerandrxjava.Utils;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.contract.Contract;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.model.ObservableListModel;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.model.ObservableMapModel;

import java.util.Map;
import java.util.concurrent.ExecutionException;

import io.reactivex.BackpressureStrategy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public final class MapDaoImpl implements Contract.MapDao {


    public MapDaoImpl() {
    }


    @Override
    public String calculateAddNewElementToMap(Map<Integer, Integer> map)  {
        long temp = System.nanoTime();
        ObservableMapModel<Integer, Integer> observableMapModel = new ObservableMapModel<>(map);
        Disposable disposable=observableMapModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe()
        ;
        observableMapModel.addElement(1, 1);
        disposable.dispose();
        return String.valueOf(System.nanoTime() - temp);
    }

    @Override
    public String calculateFindElementInMapByKey(Map<Integer, Integer> map)  {
        long temp = System.nanoTime();
        ObservableMapModel<Integer, Integer> observableMapModel = new ObservableMapModel<>(map);
        Disposable disposable=observableMapModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe()
        ;
        observableMapModel.getIndexOfElementList(1);
        disposable.dispose();
        return String.valueOf(System.nanoTime() - temp);
    }

    @Override
    public String calculateRemoveElementInMapByKey(Map<Integer, Integer> map)  {
        long temp = System.nanoTime();
        ObservableMapModel<Integer, Integer> observableMapModel = new ObservableMapModel<>(map);
        Disposable disposable=observableMapModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe()
        ;
        observableMapModel.removeElement(2);
        disposable.dispose();
        return String.valueOf(System.nanoTime() - temp);
    }

}

