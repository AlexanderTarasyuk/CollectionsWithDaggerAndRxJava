package com.example.alextarasyuk.collectionswithdaggerandrxjava.dao;



import com.example.alextarasyuk.collectionswithdaggerandrxjava.Utils;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.contract.Contract;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.model.ObservableListModel;

import java.util.List;
import java.util.concurrent.ExecutionException;


import io.reactivex.BackpressureStrategy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public final class ListDaoImpl implements Contract.ListDao {


    public ListDaoImpl() {

    }


    @Override
    public String calculateInsertAtTheBeginning(List<Integer> list)  {
        long temp = System.nanoTime();

        ObservableListModel<Integer> observableListModel = new ObservableListModel<>(list);
        observableListModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe()
        ;
        observableListModel.addElement(1, 1);

        return String.valueOf(System.nanoTime() - temp);


    }


    @Override
    public String calculateInsertAtTheMiddle(List<Integer> list)  {

        long temp = System.nanoTime();

        ObservableListModel<Integer> observableListModel = new ObservableListModel<>(list);
        observableListModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe();
        observableListModel.addElement(list.size() / 2, 1);

        return String.valueOf(System.nanoTime() - temp);
    }


    @Override
    public String calculateInsertAtTheEnd(List<Integer> list)  {

        long temp = System.nanoTime();

        ObservableListModel<Integer> observableListModel = new ObservableListModel<>(list);
        observableListModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe();
        observableListModel.addElement(list.size() - 1, 1);

        return String.valueOf(System.nanoTime() - temp);

    }


    @Override
    public String calculateFindTheIndexOfElement(List<Integer> list)  {

        long temp = System.nanoTime();

        ObservableListModel<Integer> observableListModel = new ObservableListModel<>(list);
        observableListModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe();
        observableListModel.getIndexOfElementList(100);

        return String.valueOf(System.nanoTime() - temp);
    }


    @Override
    public String calculateRemoveFirstElement(List<Integer> list)  {
        long temp = System.nanoTime();

        ObservableListModel<Integer> observableListModel = new ObservableListModel<>(list);
        observableListModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe();
        observableListModel.removeElement(0);

        return String.valueOf(System.nanoTime() - temp);
    }


    @Override
    public String calculateRemoveMiddleElementArrayList(List<Integer> list)  {
        long temp = System.nanoTime();

        ObservableListModel<Integer> observableListModel = new ObservableListModel<>(list);
        observableListModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe();
        observableListModel.removeElement(list.size() / 2);

        return String.valueOf(System.nanoTime() - temp);
    }


    @Override
    public String calculateRemoveLastElement(List<Integer> list)  {
        long temp = System.nanoTime();

        ObservableListModel<Integer> observableListModel = new ObservableListModel<>(list);
        observableListModel.getObservable()
                .subscribeOn(Schedulers.from(Utils.getExecutorService()))
                .observeOn(AndroidSchedulers.mainThread())
                .toFlowable(BackpressureStrategy.BUFFER)
                .subscribe();
        observableListModel.removeElement(list.size() - 1);

        return String.valueOf(System.nanoTime() - temp);
    }


}
