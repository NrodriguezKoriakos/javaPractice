package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void printList(){
        System.out.println("You have " + groceryList.size() + " item/s in your grocery list!");

        for (int i=0 ; i<groceryList.size() ; i++){
            System.out.println((i+1) + "- " + groceryList.get(i));
        }
    }

    public void  modifyItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item: " + (position+1) + " has been modified");
    }

    public void removeItem(int position){

        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery item: " + (item) + " has been removed");
    }

    public String findItem(String searchItem){

        int position = groceryList.indexOf(searchItem);

        if (position >=0){
            return  groceryList.get(position);
        }
        return null;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
