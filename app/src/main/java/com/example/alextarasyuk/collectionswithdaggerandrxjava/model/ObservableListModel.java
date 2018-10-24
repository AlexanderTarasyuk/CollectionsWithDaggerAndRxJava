package com.example.alextarasyuk.collectionswithdaggerandrxjava.model;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

public class ObservableListModel<T> {

    protected  List<T> list;
    protected  BehaviorSubject<List<T>> behaviorSubject;

    public ObservableListModel(List<T> list) {
        this.list = list;
        this.behaviorSubject = BehaviorSubject.createDefault(list);
    }

    public Observable<List<T>> getObservable() {
        return behaviorSubject;
    }

    public void addElement(int index, T element) {
        list.add(index, element);
        behaviorSubject.onNext(list);
    }

    public void removeElement(int index) {
        list.remove(index);
        behaviorSubject.onNext(list);

    }

    public void getIndexOfElementList(T value) {
        list.indexOf(value);
        behaviorSubject.onNext(list);
    }

}
