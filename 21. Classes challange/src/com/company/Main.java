package com.company;

public class Main {

    public static void main(String[] args) {
        Bank newAccount = new Bank(12,1500,"Nicolas Koriakos","nicolaskoriakos01@gmail.com",
                "3541 215719");

        newAccount.addFounds(53.15);
        newAccount.withdrawFounds(2000);
        newAccount.withdrawFounds(1000.15);
        System.out.println("My name is: " + newAccount.getCustomerName() +
                "\nMy account number is: " + newAccount.getAccountNumber() +
                "\nMy email is: " + newAccount.getEmail() +
                "\nMy phone number is: " + newAccount.getPhoneNumber() +
                "\nMy balance is: " + newAccount.getBalance());
    }
}
