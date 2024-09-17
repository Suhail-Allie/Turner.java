package org.example;
import java.util.Scanner;

public class DemoTurners2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the type of Turner (Leaf, Page, Pancake, ClockHand, Wheel): ");
            String type = scanner.nextLine().trim().toLowerCase();

            Turner turner = null;

            switch (type) {
                case "leaf":
                    turner = new Leaf();
                    break;
                case "page":
                    turner = new Page();
                    break;
                case "pancake":
                    turner = new Pancake();
                    break;
                case "clockhand":
                    turner = new ClockHand();
                    break;
                case "wheel":
                    turner = new Wheel();
                    break;
                default:
                    System.out.println("Invalid type.");
                    System.exit(1);
            }

            turner.turn();
            scanner.close();
        }
    }


