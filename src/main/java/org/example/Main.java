package org.example;
import org.example.Turner;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Turner.java
    public interface Turner {
        void turn();
    }

    // Leaf.java
    public static class Leaf implements org.example.Turner {
        @Override
        public void turn() {
            System.out.println("Changing colors");
        }
    }

    // Page.java
    public static class Page implements org.example.Turner {
        @Override
        public void turn() {
            System.out.println("Going to the next page");
        }
    }

    // Pancake.java
    public static class Pancake implements org.example.Turner {
        @Override
        public void turn() {
            System.out.println("Flipping");
        }
    }

    //DemoTurners
    public static class DemoTurners {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the type of Turner (Leaf, Page, Pancake): ");
            String type = scanner.nextLine().trim().toLowerCase();

            org.example.Turner turner = null;

            switch (type) {
                case "leaf":
                    turner = new Main.Leaf();
                    break;
                case "page":
                    turner = new org.example.Page();
                    break;
                case "pancake":
                    turner = new org.example.Pancake();
                    break;
                default:
                    System.out.println("Invalid type.");
                    System.exit(1);
            }

            turner.turn();
            scanner.close();
        }
    }

    //DemoTurners2
    public static class DemoTurners2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the type of Turner (Leaf, Page, Pancake, ClockHand, Wheel): ");
            String type = scanner.nextLine().trim().toLowerCase();

            org.example.Turner turner = null;

            switch (type) {
                case "leaf":
                    turner = new Leaf();
                    break;
                case "page":
                    turner = new org.example.Page();
                    break;
                case "pancake":
                    turner = new org.example.Pancake();
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

//ClockHand
    public static class ClockHand implements org.example.Turner {
        @Override
        public void turn() {
            System.out.println("Ticking");
        }
    }

    //Wheel
    public static class Wheel implements org.example.Turner {
        @Override
        public void turn() {
            System.out.println("Spinning");
        }
    }




}