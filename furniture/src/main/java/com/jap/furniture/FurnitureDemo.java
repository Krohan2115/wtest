package com.jap.furniture;
import java.util.*;

public class FurnitureDemo
    {
        static Furniture furniture;
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            
            String furnitureItems[] = {"Bookshelf","Sofa    ","Table    "};
            FurnitureType furnitureType[] = {FurnitureType.OFFICE,FurnitureType.HOME,FurnitureType.GARDEN};
            double price[] = {3000, 4500, 2400};
            int index = 0;
            
            
            System.out.println("---Furniture and Fittings Company---");
            System.out.println("S.No. \t Items \t\t Price");
            for(String items: furnitureItems) {
                System.out.println((index+1)+"\t"+items+"\t"+price[index++]);
            }
            System.out.println("Select one");
            int furnitureChoice = Integer.parseInt(scanner.nextLine());
            
            index = 0;
            System.out.println("S.No. \t Type Of Furniture");
            for(FurnitureType displayF : furnitureType) {
                System.out.println((++index)+"\t"+displayF);
            }
            System.out.println("Select one");
            int furnitureTypeChoice = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Enter Color of Furniture");
            String furnitureColor = scanner.nextLine();
            
            switch(furnitureChoice) {
                case 1: furniture = new Bookshelf(furnitureColor,price[furnitureChoice-1],furnitureType[furnitureTypeChoice-1]);
                        ((Bookshelf) furniture).displayDiscount();
                        break;
                case 2: furniture = new Sofa(furnitureColor,price[furnitureChoice-1],furnitureType[furnitureTypeChoice-1]);
                        ((Sofa) furniture).displayDiscount();
                        break;
                case 3: furniture = new Table(furnitureColor,price[furnitureChoice-1],furnitureType[furnitureTypeChoice-1]);
                        ((Table) furniture).displayDiscount();
                        break;
            }
        }
    }