package com.example.alextarasyuk.collectionswithdaggerandrxjava.presenter;


import com.example.alextarasyuk.collectionswithdaggerandrxjava.contract.Contract;
import com.example.alextarasyuk.collectionswithdaggerandrxjava.di.DaggerModelComponent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

import javax.inject.Inject;


public final class ListPresenterImpl implements Contract.ListPresenter {

    private Contract.View view;

    @Inject
    Contract.ListDao model;

    private List<Integer> arrayList;
    private List<Integer> linkedList;
    private List<Integer> writeOnWriteLinkedList;

    public ListPresenterImpl() {
        DaggerModelComponent.builder().build().inject(this);


    }

    public Contract.View getView() {
        return view;
    }


    @Override
    public void setTvInsertAtBeginningArrayList() {
        if (view != null & model != null) {

            view.setTvInsertAtBeginningArrayList(model.calculateInsertAtTheBeginning(arrayList));

        }
    }

    @Override
    public void setTvInsertAtMiddleArrayList() {
        if (view != null & model != null) {

            view.setTvInsertAtMiddleArrayList(model.calculateInsertAtTheMiddle(arrayList));

        }
    }

    @Override
    public void setTvInsertAtEndArrayList() {
        if (view != null & model != null) {

            view.setTvInsertAtEndArrayList(model.calculateInsertAtTheEnd(arrayList));

        }
    }


    @Override
    public void setTvFindElementArrayList() {
        if (view != null & model != null) {

            view.setTvFindElementArrayList(model.calculateFindTheIndexOfElement(arrayList));

        }
    }

    @Override
    public void setTvDeleteFirstArrayList() {
        if (view != null & model != null) {

            view.setTvDeleteFirstArrayList(model.calculateRemoveFirstElement(arrayList));

        }
    }

    @Override
    public void setTvDeleteMiddle() {
        if (view != null & model != null) {

            view.setTvDeleteMiddle(model.calculateRemoveMiddleElementArrayList(arrayList));

        }
    }

    @Override
    public void setTvDeleteLastElementArrayList() {
        if (view != null & model != null) {

            view.setTvDeleteLastElementArrayList(model.calculateRemoveLastElement(arrayList));

        }
    }

    @Override
    public void setTvInsertAtBeginningLinkedList() {
        if (view != null & model != null) {

            view.setTvInsertAtBeginningLinkedList(model.calculateInsertAtTheBeginning(linkedList));

        }
    }

    @Override
    public void setTvInsertAtMiddleLinkList() {
        if (view != null & model != null) {
            view.setTvInsertAtMiddleLinkList(model.calculateInsertAtTheMiddle(linkedList));
        }
    }

    @Override
    public void setTvInsertAtEndLinkList() {
        if (view != null & model != null) {

            view.setTvInsertAtEndLinkList(model.calculateInsertAtTheEnd(linkedList));
        }
    }

    @Override
    public void setTvFindElementLinkList() {
        if (view != null & model != null) {

            view.setTvFindElementLinkList(model.calculateFindTheIndexOfElement(linkedList));
        }
    }

    @Override
    public void setTvDeleteFirstLinkList() {
        if (view != null & model != null) {

            view.setTvDeleteFirstLinkList(model.calculateRemoveFirstElement(linkedList));

        }
    }

    @Override
    public void setTvDeleteMiddleLinkList() {
        if (view != null & model != null) {

            view.setTvDeleteMiddleLinkList(model.calculateRemoveMiddleElementArrayList(linkedList));

        }
    }

    @Override
    public void setTvDeleteLastLinkList() {
        if (view != null & model != null) {

            view.setTvDeleteLastLinkList(model.calculateRemoveLastElement(linkedList));

        }
    }

    @Override
    public void setTvInsertAtBeginningCopyOnWriteList() {
        if (view != null & model != null) {

            view.setTvInsertAtBeginningCopyOnWriteList(model.calculateInsertAtTheBeginning(writeOnWriteLinkedList));

        }

    }

    @Override
    public void setTvInsertAtMiddleCopyOnWriteList() {
        if (view != null & model != null) {

            view.setTvInsertAtMiddleCopyOnWriteList(model.calculateInsertAtTheMiddle(writeOnWriteLinkedList));

        }

    }

    @Override
    public void setTvInsertAtEndCopyOnWriteList() {
        if (view != null & model != null) {

            view.setTvInsertAtEndCopyOnWriteList(model.calculateInsertAtTheEnd(writeOnWriteLinkedList));

        }
    }

    @Override
    public void setTvFindElementCopyOnWriteList() {
        if (view != null & model != null) {

            view.setTvFindElementCopyOnWriteList(model.calculateFindTheIndexOfElement(writeOnWriteLinkedList));

        }
    }

    @Override
    public void setTvDeleteFirstCopyOnWriteList() {
        if (view != null & model != null) {

            view.setTvDeleteFirstCopyOnWriteList(model.calculateRemoveFirstElement(writeOnWriteLinkedList));

        }

    }

    @Override
    public void setTvDeleteMiddleCopyOnWriteList() {
        if (view != null & model != null) {

            view.setTvDeleteMiddleCopyOnWriteList(model.calculateRemoveMiddleElementArrayList(writeOnWriteLinkedList));

        }

    }

    @Override
    public void setTvDeleteLastCopyOnWriteList() {
        if (view != null & model != null) {

            view.setTvDeleteLastCopyOnWriteList(model.calculateRemoveMiddleElementArrayList(writeOnWriteLinkedList));

        }

    }

    @Override
    public void initialzeList(Integer size) {

        Random random = new Random();
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        writeOnWriteLinkedList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(100_000));
            linkedList.add(random.nextInt(100_000));
            writeOnWriteLinkedList.add(random.nextInt(100_000));
        }

    }

    @Override
    public void loadSizeOfLists(int number) {
        initialzeList(number);


    }


    @Override
    public void attachView(Contract.View view) {
        this.view = view;


    }

    @Override
    public void detachView() {
        view = null;
        model = null;

    }

}
