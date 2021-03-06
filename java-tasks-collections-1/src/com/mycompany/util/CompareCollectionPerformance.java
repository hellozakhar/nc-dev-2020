package com.mycompany.util;

import java.util.*;

public class CompareCollectionPerformance {
    // count of elements
    private final int elemCount = 100000;
    // times to run test
    private final int times = 20;

    public void testAddToArrayList() {
        ArrayList arraylist1 = new ArrayList();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                arraylist1.add(i);
            }
            end = System.nanoTime();

            arraylist1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("ArrayList add(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddOnIndexToArrayList() {
        ArrayList arraylist1 = new ArrayList();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

//            for (int i = 0; i < elemCount; i++) {
//                arraylist1.add(i);
//            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                arraylist1.add((int) i / 2, i);
            }
            end = System.nanoTime();

            arraylist1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("ArrayList add(middle, elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testRemoveInArrayList() {
        ArrayList arraylist1 = new ArrayList();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            for (int i = 0; i < elemCount; i++) {
                arraylist1.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                arraylist1.remove(elemCount - 1 - i);
            }
            end = System.nanoTime();

            arraylist1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("ArrayList remove(indexFromEnd) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddToLinkedList() {
        LinkedList linkedlist1 = new LinkedList();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedlist1.add(i);
            }
            end = System.nanoTime();

            linkedlist1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedList add(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddOnIndexToLinkedList() {
        LinkedList linkedlist1 = new LinkedList();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {


//            for (int i = 0; i < elemCount; i++) {
//                linkedlist1.add(i);
//            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedlist1.add((int) i / 2, i);
            }
            end = System.nanoTime();

            linkedlist1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedList add(middle, elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testRemoveInLinkedList() {
        LinkedList linkedlist1 = new LinkedList();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            for (int i = 0; i < elemCount; i++) {
                linkedlist1.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedlist1.remove(elemCount - 1 - i);
            }
            end = System.nanoTime();

            linkedlist1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedList remove(indexFromEnd) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddToHashSet() {
        HashSet hashset1 = new HashSet();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                hashset1.add(i);
            }
            end = System.nanoTime();

            hashset1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("HashSet add(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testSearchInHashSet() {
        HashSet hashset1 = new HashSet();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {
            for (int i = 0; i < elemCount; i++) {
                hashset1.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                hashset1.contains(elemCount-1-i);
            }
            end = System.nanoTime();

            hashset1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("HashSet search(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testRemoveInHashSet() {
        HashSet hashset1 = new HashSet();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            for (int i = 0; i < elemCount; i++) {
                hashset1.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                hashset1.remove(elemCount-1-i);
            }
            end = System.nanoTime();

            hashset1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("HashSet remove(indexFromEnd) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddToLinkedHashSet() {
        LinkedHashSet linkedhashset1 = new LinkedHashSet();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedhashset1.add(i);
            }
            end = System.nanoTime();

            linkedhashset1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedHashSet add(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testSearchInLinkedHashSet() {
        LinkedHashSet linkedhashset = new LinkedHashSet();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {
            for (int i = 0; i < elemCount; i++) {
                linkedhashset.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedhashset.contains(elemCount-1-i);
            }
            end = System.nanoTime();

            linkedhashset.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedHashSet search(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testRemoveInLinkedHashSet() {
        LinkedHashSet linkedhashset1 = new LinkedHashSet();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            for (int i = 0; i < elemCount; i++) {
                linkedhashset1.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedhashset1.remove(elemCount-1-i);
            }
            end = System.nanoTime();

            linkedhashset1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedHashSet remove(indexFromEnd) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddToTreeSet() {
        TreeSet treeset1 = new TreeSet();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                treeset1.add(i);
            }
            end = System.nanoTime();

            treeset1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("TreeSet add(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testSearchInTreeSet() {
        TreeSet treeset = new TreeSet();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {
            for (int i = 0; i < elemCount; i++) {
                treeset.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                treeset.contains(elemCount-1-i);
            }
            end = System.nanoTime();

            treeset.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("TreeSet search(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testRemoveInTreeSet() {
        TreeSet treeset1 = new TreeSet();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            for (int i = 0; i < elemCount; i++) {
                treeset1.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                treeset1.remove(elemCount-1-i);
            }
            end = System.nanoTime();

            treeset1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("TreeSet remove(indexFromEnd) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddToHashMap() {
        HashMap hashmap1 = new HashMap();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                hashmap1.put(i, i);
            }
            end = System.nanoTime();

            hashmap1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("HashMap add(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testSearchInHashMap() {
        HashMap hashmap = new HashMap();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {
            for (int i = 0; i < elemCount; i++) {
                hashmap.put(i, i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                hashmap.get(elemCount - 1 - i);
            }
            end = System.nanoTime();

            hashmap.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("HashMap search(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testRemoveInHashMap() {
        HashMap hashmap1 = new HashMap();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            for (int i = 0; i < elemCount; i++) {
                hashmap1.put(i, i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                hashmap1.remove(elemCount-1-i);
            }
            end = System.nanoTime();

            hashmap1.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("HashMap remove(indexFromEnd) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddToLinkedHashMap() {
        LinkedHashMap linkedhashmap = new LinkedHashMap();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedhashmap.put(i, i);
            }
            end = System.nanoTime();

            linkedhashmap.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedHashMap add(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testSearchInLinkedHashMap() {
        LinkedHashMap linkedhashmap = new LinkedHashMap();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {
            for (int i = 0; i < elemCount; i++) {
                linkedhashmap.put(i, i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedhashmap.get(elemCount - 1 - i);
            }
            end = System.nanoTime();

            linkedhashmap.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedHashMap search(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testRemoveInLinkedHashMap() {
        LinkedHashMap linkedhashmap = new LinkedHashMap();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            for (int i = 0; i < elemCount; i++) {
                linkedhashmap.put(i, i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedhashmap.remove(elemCount-1-i);
            }
            end = System.nanoTime();

            linkedhashmap.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedHashMap remove(indexFromEnd) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddToTreeMap() {
        TreeMap treemap = new TreeMap();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                treemap.put(i, i);
            }
            end = System.nanoTime();

            treemap.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("TreeMap add(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testSearchInTreeMap() {
        TreeMap treemap = new TreeMap();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {
            for (int i = 0; i < elemCount; i++) {
                treemap.put(i, i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                treemap.get(elemCount - 1 - i);
            }
            end = System.nanoTime();

            treemap.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("TreeMap search(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testRemoveInTreeMap() {
        TreeMap treemap = new TreeMap();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            for (int i = 0; i < elemCount; i++) {
                treemap.put(i, i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                treemap.remove(elemCount-1-i);
            }
            end = System.nanoTime();

            treemap.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("TreeMap remove(indexFromEnd) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddToMyLinkedList() {
        MyLinkedList mylinkedlist = new MyLinkedList();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                mylinkedlist.add(i);
            }
            end = System.nanoTime();

            mylinkedlist.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedList add(elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testAddOnIndexMyLinkedList() {
        MyLinkedList mylinkedlist = new MyLinkedList();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {


//            for (int i = 0; i < elemCount; i++) {
//                linkedlist1.add(i);
//            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                mylinkedlist.add((int) i / 2, i);
            }
            end = System.nanoTime();

            mylinkedlist.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedList add(middle, elem) " + elemCount + " elements: " + avg + " seconds");
    }

    public void testRemoveInMyLinkedList() {
        MyLinkedList mylinkedlist = new MyLinkedList();

        // variables for measure time
        long start;
        long end;
        double elapsed;
        double time = 0;
        double avg = 0;

        for (int t = 0; t < times; t++) {

            for (int i = 0; i < elemCount; i++) {
                mylinkedlist.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                mylinkedlist.remove(elemCount - 1 - i);
            }
            end = System.nanoTime();

            mylinkedlist.clear();
            elapsed = (double) (end - start) / 1_000_000_000;
            time += elapsed;
        }

        if (times != 0)
            avg = time / times;

        System.out.println("LinkedList remove(indexFromEnd) " + elemCount + " elements: " + avg + " seconds");
    }

}
