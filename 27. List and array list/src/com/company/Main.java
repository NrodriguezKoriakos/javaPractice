package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions(){

        System.out.println("Press:" +
                "\n0- Print instructions." +
                "\n1- Print list." +
                "\n2- add item." +
                "\n3- modify item." +
                "\n4- remove item." +
                "\n5- search item." +
                "\n6- quit.");
    }

    public static void addItem(){
        System.out.println("Please enter your item:");
        groceryList.addItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item number:");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the replacement number:");
        String item = scanner.nextLine();
        groceryList.modifyItem(itemNumber-1, item);
    }
    public static void removeItem(){
        System.out.print("Enter item number:");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(itemNumber-1);
    }

    public static void searchItem(){
        System.out.print("Enter the item you want to search for:");
        String searchItem = scanner.nextLine();

        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " was not found in our list.");
        }
    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> array2 = new ArrayList<>(groceryList.getGroceryList());

        String[] array3 = new String[groceryList.getGroceryList().size()];
        array3 = groceryList.getGroceryList().toArray(array3);
    }
}
