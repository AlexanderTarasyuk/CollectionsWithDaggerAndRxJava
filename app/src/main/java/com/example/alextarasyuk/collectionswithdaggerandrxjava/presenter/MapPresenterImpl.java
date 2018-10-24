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
        DaggerModelComponent.builder().build();

    }


    @Override
    public void calculateAddNewElementToHashMap() {
        try {
            view.setAddNewInHashMap(mapDao.calculateAddNewElementToMap(hashMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void calculateFindElementInHashMapByKey() {
        try {
            view.setSelectInHashMap(mapDao.calculateFindElementInMapByKey(hashMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void calculateRemoveElementInHashMapByKey() {
        try {
            view.setRemoveInHashMap(mapDao.calculateRemoveElementInMapByKey(hashMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calculateAddNewElementToTreeMap() {
        try {
            view.setAddNewInTreeMap(mapDao.calculateAddNewElementToMap(treeMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void calculateFindElementInTreeMapByKey() {

        try {
            view.setSelectInTreeMap(mapDao.calculateFindElementInMapByKey(treeMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calculateRemoveElementInTreeMapByKey() {
        try {
            view.setRemoveInTreeMap(mapDao.calculateRemoveElementInMapByKey(treeMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
