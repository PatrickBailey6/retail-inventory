package retail.inventory;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;

public class RetailFE {
    public static void main (String[] args) throws Exception {

        String cFileDirectory = System.getProperty ("user.dir");

        Scanner keyboard = new Scanner(System.in);
        /* Start preset load/initialize */
        System.out.println("Starting Retail Inventory.");
        try
        {
            System.out.println("\n Searching for existing presets.");
            Scanner fileReader = new Scanner (new File (cFileDirectory+"/user_presets"));
            // TODO design preset file 
            fileReader.close();

        }
        catch (Exception e)
        {
            System.out.println("File not found; Creating new preset file");
            // TODO implement preset file here
            PrintWriter fileWriter = new PrintWriter(new FileOutputStream(cFileDirectory));
            fileWriter.close();
        }

        while (true)
        {
            /* We want to add, remove, update, and report inventory. We can alert out of stock
            * and overfill, and give metrics based on the data. I.e. on update, report significant loss
            */
            /*
             * 1. Generate Report
             *      a. 
             * 2. Add Inventory Item
             *      a.
             * 3. Remove Inventory Item
             *      a. 
             * 4. Update Inventory Item
             *      a. 
             * 
             */

            System.out.println("Welcome to the Retail Inventory Management System\nPlease type a number");
            System.out.println("to make a selection");
            System.out.println("1. Generate a new report\n2. Add an inventory item\n3. Remove an inventory item");
            System.out.println("4. Update an existing inventory item\n5. Logout and Quit");
            switch (keyboard.nextLine()) {
                case "1": 
                    reportGenerate();
                    break;
                case "2":
                    itemAdd();
                    break;
                case "3":
                    itemRemove();
                    break;
                case "4":
                    itemUpdate();
                    break;
                case "5":
                    System.out.println("Are you sure you want to quit? (y/n)");
                    if(keyboard.nextLine().toLowerCase().equals("y"))
                    {
                        keyboard.close();
                        System.exit(0);
                    }
                    break;
                    
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
        
    }
    static void reportGenerate() 
    {

    }
    static void itemAdd()
    {

    }
    static void itemRemove()
    {

    }
    static void itemUpdate()
    {

    }
}

