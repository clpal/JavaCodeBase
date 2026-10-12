package com.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            if (parts.length != 4) {
                System.out.println("Invalid format");
                return;
            }
            String customer = parts[0].trim();
            String product = parts[1].trim().toLowerCase();
            double unitPrice = Double.parseDouble(parts[2].trim());
            int quantity = Integer.parseInt(parts[3].trim());

            double discountRate;
            if (product.contains("laptop")) {
                discountRate = 0.05;
            } else if (product.contains("mobile")) {
                discountRate = 0.07;
            } else {
                discountRate = 0.02;
            }

            double total = unitPrice * quantity;
            total -= total * discountRate;

            System.out.printf("%.2f", total);

        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}
