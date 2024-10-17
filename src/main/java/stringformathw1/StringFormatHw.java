package stringformathw1;
/*
Create a method named printReceipt
scans for 3 pieces of data : productName, price and quantity
date should be the date when program is ran; NOT a hardcoded date
be sure to close scanner at the end
should generate a receipt like this:
----------------------------------------------
Name 	     Qty 	     Price 	     Total
----		 ---		 -----		 -------
Pot  		 20 		 $5.0 		 $100.00

		Thank you. Come again!!!

Purchased on: Tuesday, October 15, 2024
----------------------------------------------
 */
import java.time.LocalDate;

import java.util.Scanner;

public class StringFormatHw {

    public static void main(String[] args) {

        printReceipt();
    }

    public static void printReceipt(){
        //needs productName, price and quantity; include total, and a date
        //ask user for product name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String productName = scanner.next();

        //ask user to enter price
        System.out.println("Enter price of the product: ");
        double price = scanner.nextDouble();

        //ask user to enter quantity
        System.out.println("Enter the quantity:");
        int quantity = scanner.nextInt();

        //Calculate total
        double calculateTotal = price * quantity;

        //get the current date; *not hardcore*
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Print receipt
            System.out.println("-------------------------------");
            System.out.println("Name    Qty     Price    Total");
            System.out.println("----    ---     -----   -------");
            System.out.printf("%-3s %5d $%2f $%3f", productName, quantity, price, calculateTotal);
            System.out.println();
            System.out.println("     Thank you. Come again!!!    ");
            System.out.println();
            System.out.println("Purchased on: " + currentDate);
            System.out.println("--------------------------------");


        }

    }

