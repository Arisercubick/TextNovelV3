package src.Helper;

import java.io.IOException;

public class TextManipulation {

    public void delete() {
        try {
            Runtime.getRuntime().exec("cls");
            Runtime.getRuntime().exec("clear");
        } catch (IOException e) {
            System.out.println("clearing didnt work");
        }
    }

    public void print(String phrase, long time) {
        try {
            for (int i = 0; i < phrase.length(); i++) {
                System.out.print(phrase.charAt(i));
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            System.out.println("\nSkipped");
        }
    }

    public void print(String phrase) {
        try {
            int time = 100;
            for (int i = 0; i < phrase.length(); i++) {
                System.out.print(phrase.charAt(i));
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            System.out.println("\nSkipped");
        }
    }

    public void println(String phrase, long time) {
        try {
            for (int i = 0; i < phrase.length(); i++) {
                System.out.print(phrase.charAt(i));
                Thread.sleep(time);
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("\nSkipped");
        }
    }

    public void println(String phrase) {
        try {
            int time = 100;
            for (int i = 0; i < phrase.length(); i++) {
                System.out.print(phrase.charAt(i));
                Thread.sleep(time);
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("\nSkipped");
        }
    }
}