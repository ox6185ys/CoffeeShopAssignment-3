package com.patrick;
import java.util.*;
public class Main {//Pushed to GIT
    public static void main(String[] args) {
        //double totalSales = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cups of coffee did you sell today?");
        int cups = scanner.nextInt();
        System.out.println("What does a cup of coffee cost?");
        double price = scanner.nextDouble();
        double coffSales = cupsMoney(cups , price);
        //double drinkSales = price * cups;
        //totalSales = totalSales + drinkSales;
        System.out.println("How many cups of hot chocolate did you sell today?");
        cups = scanner.nextInt();
        System.out.println("What does a cup of hot chocolate cost?");
        price = scanner.nextDouble();
        double chocSales = cupsMoney(cups , price);
        //drinkSales = price * cups;
        //totalSales = totalSales + drinkSales;
        System.out.println("How many cups of tea did you sell today?");
        cups = scanner.nextInt();
        System.out.println("What does a cup of tea cost?");
        price = scanner.nextDouble();
        double teaSales = cupsMoney(cups , price);
        //drinkSales = price * cups;
        //totalSales = totalSales + drinkSales;
        System.out.println("How many cups of cappuccino did you sell today?");
        cups = scanner.nextInt();
        System.out.println("What does a cup of cappuccino cost?");
        price = scanner.nextDouble();
        double capSales = cupsMoney(cups , price);
        //drinkSales = price * cups;
        //totalSales = totalSales + drinkSales;
        System.out.println("Revenue for the day is ?");
        System.out.println( capSales + teaSales + chocSales  + coffSales);
    }
    private static double cupsMoney(int cups, double price) {
        double coffMoney = cups * price;
        return coffMoney;
    }
    }

