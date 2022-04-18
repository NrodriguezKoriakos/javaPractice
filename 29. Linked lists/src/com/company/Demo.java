package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("New York");
        placesToVisit.add("Rio ");
        placesToVisit.add("Buenos aires");
        placesToVisit.add("Madrid");
        placesToVisit.add("Paris");

        printList(placesToVisit);

        placesToVisit.add(1,"Tokio");
        placesToVisit.remove(3);
        printList(placesToVisit);
    }

    private static void printList(@NotNull LinkedList<String> linkedList){

        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("*************************************");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison==0){
                // Equal do not add

                System.out.println(newCity + " is already a destination.");
                return false;
            } else if (comparison > 0){
                //new City should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else {
                //move to next city
            }

        }
        stringListIterator.add(newCity);
        return true;
    }
}
