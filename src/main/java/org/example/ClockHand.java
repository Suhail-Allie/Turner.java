package org.example;

    public class ClockHand implements Turner {
        @Override
        public void turn() {
            System.out.println("Ticking");
        }
    }

