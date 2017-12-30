package com.kodilla.good.paterns.prototype;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


class Application {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for (int n = 0; n < 600000; n++) {
            list1.add(n);


        }
        System.out.println("Quantity of elements in the collection: " + list1.size());

        long begin = System.nanoTime();
        list1.remove(0);
        long end = System.nanoTime();


        System.out.println("Removing first element: " + (end - begin) + "ms");

        System.out.println("List after remove first element:" + list1.size());

        begin = System.nanoTime();
        list1.remove(list1.size() - 1);
        end = System.nanoTime();


        System.out.println("Removing last element: " + (end - begin) + "ms");

        System.out.println("List after remove last element:" + list1.size());

        begin = System.nanoTime();
        list1.add(0, list1.size());
        end = System.nanoTime();


        System.out.println("Adding element at the beginning of the collection: " + (end - begin) + "ms");

        System.out.println("list after add element:" + list1.size());


        begin = System.nanoTime();
        list1.add(list1.size());
        end = System.nanoTime();


        System.out.println("Adding element at the od of the collection: " + (end - begin) + "ms");

        System.out.println("list after add element:" + list1.size());

        System.out.println("HashMap\n");

        HashMap<Integer, Book> ObjectMap = new HashMap<>();
        for (int n = 0; n < 10; n++) {


            for (Map.Entry<Integer, Book> entry : ObjectMap.entrySet()) {
                System.out.println("Author" + entry.getKey() + " for " + entry.getValue());
            }
        }

            begin = System.currentTimeMillis();
            for (int n = 5; n < 20; n++) {
                System.out.println("delete: " + n);
                ObjectMap.remove(new Book("Author nr" + n, "Title nr " + n));

            }
            end = System.currentTimeMillis();
            System.out.println("Removing element at the end  of the HashMap: " + (end - begin) + "ms");
            System.out.println("\nQuantity of elements in the HashMap: " + ObjectMap.size() + "\n");


            }
        }

