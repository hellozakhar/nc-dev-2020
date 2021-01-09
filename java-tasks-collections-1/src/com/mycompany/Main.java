package com.mycompany;

import com.mycompany.util.MyLinkedList;
import com.mycompany.util.CompareCollectionPerformance;

import java.util.LinkedList;

public class Main {
    public static <E> void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        l1.add("Hello");
        l1.add("me");
        l1.add("!");
        System.out.println("l1: " + l1);

        MyLinkedList<String> ml1 = new MyLinkedList<String>();
        ml1.add("Hello");
        ml1.add("me");
        ml1.add("!");
        System.out.println("ml1: " + ml1);

        LinkedList emptyll1 = new LinkedList();
        System.out.println("emptyll1: " + emptyll1);

        MyLinkedList emptymyll1 = new MyLinkedList();
        System.out.println("emptymyll1: " + emptymyll1);

        System.out.println("iterator: ");
        for (Object elem : ml1) {
            System.out.println(elem);
        }
        System.out.println("end iterator.");

        MyLinkedList<String> ml2 = new MyLinkedList<String>();
        ml2.add("Hello");
//        System.out.println("ml2: " + ml2);
//        ml2.clear();
//        System.out.println("ml2.clear(): " + ml2);
//
//        System.out.println("ml1: " + ml1);
//        ml1.clear();
//        System.out.println("ml1.clear() : " + ml1);

        System.out.println("---- TEST MyLinkedList get() ----");
        System.out.println("ml1.get(0): " + ml1.get(0));
        System.out.println("ml1.get(1): " + ml1.get(1));
        System.out.println("ml1.get(2): " + ml1.get(2));

        System.out.println("---- TEST MyLinkedList indexOf() ----");
        System.out.println("ml1.indexOf(`Hello`): " + ml1.indexOf("Hello"));
        System.out.println("ml1.indexOf(`me`): " + ml1.indexOf("me"));
        System.out.println("ml1.indexOf(`!`): " + ml1.indexOf("!"));
        System.out.println("ml1.indexOf(`not exists`): " + ml1.indexOf("not exists"));

        System.out.println("---- TEST MyLinkedList remove() ----");
        System.out.println("ml2: " + ml2);
        System.out.println("ml2.remove(0): " + ml2.remove(0));
        System.out.println("ml2 after remove(0): " + ml2);
        System.out.println("ml1: " + ml1);
        System.out.println("ml1.remove(0): " + ml1.remove(0));
        System.out.println("ml1 after remove(0): " + ml1);
        System.out.println("ml1.remove(1): " + ml1.remove(1));
        System.out.println("ml1 after remove(1): " + ml1);
        System.out.println("ml1.remove(0): " + ml1.remove(0));
        System.out.println("ml1 after remove(0): " + ml1);

        System.out.println("---- TEST MyLinkedList set() ----");
        ml1.add("Hello");
        ml1.add("me");
        ml1.add("!");
        System.out.println("ml1: " + ml1);
        System.out.println("ml1.set(0, `Not a Hello`): " + ml1.set(0, "Not a Hello"));
        System.out.println("ml1 after set(0, `Not a Hello`): " + ml1);
        System.out.println("ml1.set(2, `?`): " + ml1.set(2, "?"));
        System.out.println("ml1 after set(2, `?`): " + ml1);

        System.out.println("---- TEST CompareCollectionPerformance ----");
        CompareCollectionPerformance test = new CompareCollectionPerformance();
//        test.testAddToArrayList();
//        test.testAddOnIndexToArrayList();
//        test.testRemoveInArrayList();

//        test.testAddToLinkedList();
//        test.testAddOnIndexToLinkedList();
//        test.testRemoveInLinkedList();

//        test.testAddToHashSet();
//        test.testRemoveInHashSet();

//        test.testAddToLinkedHashSet();
//        test.testRemoveInLinkedHashSet();

//        test.testAddToTreeSet();
//        test.testRemoveInTreeSet();

//        test.testAddToHashMap();
//        test.testRemoveInHashMap();

//        test.testAddToLinkedHashMap();
//        test.testRemoveInLinkedHashMap();
//
//        test.testAddToTreeMap();
//        test.testRemoveInTreeMap();

        test.testAddToMyLinkedList();
        test.testAddOnIndexMyLinkedList();
        test.testRemoveInMyLinkedList();
    }
}
