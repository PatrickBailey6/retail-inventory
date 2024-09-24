package retail.inventory;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;


public class RetailFE {
    public static void main (String[] args) throws Exception {

        String cFileDirectory = System.getProperty ("user.dir");

        while (true)
        {
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
            //
        
            
        }
    }
}

