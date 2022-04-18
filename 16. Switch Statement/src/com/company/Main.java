package com.company;

public class Main {

    public static void main(String[] args) {

        char switchValue = 'A'; // A,B,C,D,E;

        switch (switchValue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The switch value is: " + switchValue);
                break;
            default:
                System.out.println("Error! the switch value wasn't found.");
                break;
        }

        String month = "monday";

        switch (month.toLowerCase()){
            case "january": case "february": case "march": case "april": case "may": case "june":
                System.out.println(month.toUpperCase() + " is in the first half of the year.");
                break;
            case "august": case "september": case "october": case "november": case "december":
                System.out.println(month.toUpperCase() + " is in the second half of the year.");
                break;
            default:
                System.out.println(month.toUpperCase() + " wasn't recognized as a month.");
                break;
        }
    }
}
