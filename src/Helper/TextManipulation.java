package src.Helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TextManipulation {

    public void delete() {
        System.out.println("\033[H\033[2J");
		System.out.flush();
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
            int time = 25;
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
            int time = 25;
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