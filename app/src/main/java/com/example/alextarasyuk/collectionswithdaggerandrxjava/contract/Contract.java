package com.example.alextarasyuk.collectionswithdaggerandrxjava.contract;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public interface Contract {
    interface View {
        void setTvInsertAtBeginningArrayList(String valueOfCalculation);

        void setTvInsertAtMiddleArrayList(String valueOfCalculation);


        void setTvInsertAtEndArrayList(String valueOfCalculation);


        void setTvFindElementArrayList(String valueOfCalculation);


        void setTvDeleteFirstArrayList(String valueOfCalculation);

        void setTvDeleteMiddle(String valueOfCalculation);

        void setTvDeleteLastElementArrayList(String valueOfCalculation);

        void setTvInsertAtBeginningLinkedList(String valueOfCalculation);

        void setTvInsertAtMiddleLinkList(String valueOfCalculation);

        void setTvInsertAtEndLinkList(String valueOfCalculation);

        void setTvFindElementLinkList(String valueOfCalculation);

        void setTvDeleteFirstLinkList(String valueOfCalculation);

        void setTvDeleteMiddleLinkList(String valueOfCalculation);

        void setTvDeleteLastLinkList(String valueOfCalculation);

        void setTvInsertAtBeginningCopyOnWriteList(String valueOfCalculation);

        void setTvInsertAtMiddleCopyOnWriteList(String valueOfCalculation);

        void setTvInsertAtEndCopyOnWriteList(String valueOfCalculation);

        void setTvFindElementCopyOnWriteList(String valueOfCalculation);

        void setTvDeleteFirstCopyOnWriteList(String valueOfCalculation);

        void setTvDeleteMiddleCopyOnWriteList(String valueOfCalculation);

        void setTvDeleteLastCopyOnWriteList(String valueOfCalculation);

        void setAddNewInHashMap(String value);

        void setSelectInHashMap(String value);

        void setRemoveInHashMap(String value);

        void setAddNewInTreeMap(String value);

        void setSelectInTreeMap(String value);

        void setRemoveInTreeMap(String value);

        int loadSize();
    }

    interface MapPresenter {
        void attachView(View view);

        void detachView();

        void calculateAddNewElementToHashMap();

        void calculateFindElementInHashMapByKey();

        void calculateRemoveElementInHashMapByKey();

        void calculateAddNewElementToTreeMap();

        void calculateFindElementInTreeMapByKey();

        void calculateRemoveElementInTreeMapByKey();

        void initializeMap(Integer size);

    }

    interface ListPresenter {
        void initialzeList(Integer size);

        void loadSizeOfLists(int number);


        void setTvInsertAtBeginningArrayList();

        void setTvInsertAtMiddleArrayList();


        void setTvInsertAtEndArrayList();


        void setTvFindElementArrayList();

        void setTvDeleteFirstArrayList();

        void setTvDeleteMiddle();

        void setTvDeleteLastElementArrayList();

        void setTvInsertAtBeginningLinkedList();

        void setTvInsertAtMiddleLinkList();

        void setTvInsertAtEndLinkList();

        void setTvFindElementLinkList();

        void setTvDeleteFirstLinkList();

        void setTvDeleteMiddleLinkList();

        void setTvDeleteLastLinkList();

        void setTvInsertAtBeginningCopyOnWriteList();

        void setTvInsertAtMiddleCopyOnWriteList();

        void setTvInsertAtEndCopyOnWriteList();

        void setTvFindElementCopyOnWriteList();

        void setTvDeleteFirstCopyOnWriteList();

        void setTvDeleteMiddleCopyOnWriteList();

        void setTvDeleteLastCopyOnWriteList();

        void attachView(View view);

        void detachView();

    }

    interface ListDao {
        String calculateInsertAtTheBeginning(List<Integer> list);

        String calculateInsertAtTheMiddle(List<Integer> list);

        String calculateInsertAtTheEnd(List<Integer> list);

        String calculateFindTheIndexOfElement(List<Integer> list);

        String calculateRemoveFirstElement(List<Integer> list);

        String calculateRemoveMiddleElementArrayList(List<Integer> list);

        String calculateRemoveLastElement(List<Integer> list);


    }


    interface MapDao {

        String calculateAddNewElementToMap(Map<Integer, Integer> treeMap);

        String calculateFindElementInMapByKey(Map<Integer, Integer> treeMap);

        String calculateRemoveElementInMapByKey(Map<Integer, Integer> treeMap);
    }
}