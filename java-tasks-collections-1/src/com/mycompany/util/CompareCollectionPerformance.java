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

            for (int i = 0; i < elemCount; i++) {
                arraylist1.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                arraylist1.add((int) elemCount / 2, i);
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

            for (int i = 0; i < elemCount; i++) {
                linkedlist1.add(i);
            }

            start = System.nanoTime();
            for (int i = 0; i < elemCount; i++) {
                linkedlist1.add((int) elemCount / 2, i);
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
}
