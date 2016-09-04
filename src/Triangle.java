/**
 * Created by Kavya on 9/4/2016.
 */

import java.util.*;
import java.io.*;

public class Triangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        while(true) {
        triangle.printopn();
        int opt = triangle.getopn();
            triangle.analyzeopn(opt);
         }
    }

    public void analyzeopn(int option)
    {
        if (option == 1) {
            System.out.println("*");
        }
        if (option == 2) {
            System.out.println("Enter N : ");
            int n=getopn();
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
        }
        if (option == 3) {
            System.out.println("Enter N : ");
            int n=getopn();
            for(int i=0;i<n;i++){
                System.out.println("*");
            }
        }
        if (option == 4) {
            System.out.println("Enter N : ");
            int n=getopn();
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        if (option == 5) {
            System.exit(0);
        }
    }

    public void printopn()
    {
        System.out.print("\n1. Print 1 asterisk.\n" +
                "2. Draw Horizontal line.\n" +
                "3. Draw Vertical line.\n" +
                "4. Draw Right triangle.\n\n" +
                "5. Exit.\n\n" +
                "Enter your option here : ");
    }

    public int getopn() {
        String inputline = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException:" + e);
        }
        return Integer.parseInt(inputline);
    }

}
