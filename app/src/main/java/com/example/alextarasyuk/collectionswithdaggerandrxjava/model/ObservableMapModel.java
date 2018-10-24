package com.example.alextarasyuk.collectionswithdaggerandrxjava.model;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

public class ObservableMapModel<K, V> {

    protected final Map<K, V> map;
    protected final BehaviorSubject<Map<K, V>> behaviorSubject;

    public ObservableMapModel(Map<K, V> map) {
        this.map = map;
        this.behaviorSubject = BehaviorSubject.createDefault(map);
    }

    public Observable<Map<K, V>> getObservable() {
        return behaviorSubject;
    }

    public void addElement(K key, V value) {
        map.put(key, value);
        behaviorSubject.onNext(map);
    }

    public void removeElement(K key) {
        map.remove(key);
        behaviorSubject.onNext(map);

    }

    public void getIndexOfElementList(K key) {
        map.get(key);
        behaviorSubject.onNext(map);
    }
}
