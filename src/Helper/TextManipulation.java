package src.Helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TextManipulation {

    public void delete() {
        // TODO Auto-generated method stub

		String[] cmd = new String[]{"/bin/bash", "clear.sh"};
		try {
			Process pr = Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			System.out.println("Couldnt clear");
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