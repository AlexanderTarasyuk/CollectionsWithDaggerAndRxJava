package com.example.alextarasyuk.collectionswithdaggerandrxjava.model;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

public class ObservableListModel<Integer> {


    protected  BehaviorSubject<List<Integer>> behaviorSubject;
    protected List<Integer> list;

    public ObservableListModel(List<Integer> list) {
        this.list=list;

        this.behaviorSubject = BehaviorSubject.createDefault(list);
    }

    public Observable<List<Integer>> getObservable() {
        return behaviorSubject;
    }

    public void addElement( int index, Integer element) {
        list.add(index, element);
        behaviorSubject.onNext(list);
    }

    public void removeElement( int index) {
        list.remove(index);
        behaviorSubject.onNext(list);

    }

    public void getIndexOfElementList( Integer value) {
        list.indexOf(value);
        behaviorSubject.onNext(list);
    }

}
