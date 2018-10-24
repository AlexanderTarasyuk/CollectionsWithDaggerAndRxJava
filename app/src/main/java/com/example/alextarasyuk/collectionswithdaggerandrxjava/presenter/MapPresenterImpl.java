package com.example.alextarasyuk.collectionswithdaggerandrxjava.presenter;


import com.example.alextarasyuk.collectionswithdaggerandrxjava.contract.Contract;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.di.DaggerModelComponent;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

import javax.inject.Inject;

public final class MapPresenterImpl implements Contract.MapPresenter {
    private Contract.View view;
    @Inject
    Contract.MapDao mapDao;

    private Map<Integer, Integer> hashMap;
    private Map<Integer, Integer> treeMap;

    public Contract.View getView() {
        return view;
    }

    public MapPresenterImpl() {
        DaggerModelComponent.builder().build().inject(this);

    }


    @Override
    public void calculateAddNewElementToHashMap() {

            view.setAddNewInHashMap(mapDao.calculateAddNewElementToMap(hashMap));

    }

    @Override
    public void calculateFindElementInHashMapByKey() {
            view.setSelectInHashMap(mapDao.calculateFindElementInMapByKey(hashMap));

    }

    @Override
    public void calculateRemoveElementInHashMapByKey() {

            view.setRemoveInHashMap(mapDao.calculateRemoveElementInMapByKey(hashMap));
    }

    @Override
    public void calculateAddNewElementToTreeMap() {

            view.setAddNewInTreeMap(mapDao.calculateAddNewElementToMap(treeMap));

    }

    @Override
    public void calculateFindElementInTreeMapByKey() {

            view.setSelectInTreeMap(mapDao.calculateFindElementInMapByKey(treeMap));

    }

    @Override
    public void calculateRemoveElementInTreeMapByKey() {

            view.setRemoveInTreeMap(mapDao.calculateRemoveElementInMapByKey(treeMap));

    }

    @Override
    public void initializeMap(Integer size) {

        Random random = new Random();
        hashMap = new HashMap<>();
        treeMap = new TreeMap<>();

        for (int i = 0; i < size; i++) {
            hashMap.put(i, random.nextInt(100_000));
            treeMap.put(i, random.nextInt(100_000));
        }

    }


    @Override
    public void attachView(Contract.View view) {
        this.view = view;


    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
