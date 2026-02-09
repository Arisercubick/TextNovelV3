package src.Helper;

public class TextManipulation {
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
}