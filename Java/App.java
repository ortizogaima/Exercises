//Imports
import java.util.Scanner;
import javaexercises.lib.documents.*;
import javaexercises.lib.documents.HumanResources.*;

public class App {
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);

        //Show the options
        System.out.println("What doc want show?(Put a number):");
        System.out.println("1.Order");
        System.out.println("2.Invoice");
        System.out.println("3.CV");
        System.out.println("4.Contract");
        int choice = scnr.nextInt();
        System.out.println("---------------------------------------");

        //Depend of choice input the program continue 
        switch (choice){
            case 1:
                Order orderOne = new Order();
                orderOne.setOrder();
                System.out.println("Type of doc: Order");
                orderOne.showOrder(orderOne);
                break;
            case 2:
                Invoice invoiceOne = new Invoice();
                invoiceOne.setInvoice();
                System.out.println("Type of doc: Invoice");
                invoiceOne.showInvoice(invoiceOne);
                break;
            case 3:
                CV cvOne = new CV();   
                cvOne.setCV();
                System.out.println("Type of doc: CV");
                cvOne.showCV(cvOne); 
                break;
            case 4:
                Contract contractOne = new Contract();   
                contractOne.setContract();
                System.out.println("Type of doc: Contract");
                contractOne.showContract(contractOne); 
                break;
            default:
                System.out.println("Choice incorrect, Good bye.");
                break;
        }

    }

}
