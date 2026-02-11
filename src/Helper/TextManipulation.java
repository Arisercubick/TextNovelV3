package src.Helper;

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
            final int TIME_SPEED = 25;
            for (int i = 0; i < phrase.length(); i++) {
                System.out.print(phrase.charAt(i));
                Thread.sleep(TIME_SPEED);
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
            final int TIME_SPEED = 25;
            for (int i = 0; i < phrase.length(); i++) {
                System.out.print(phrase.charAt(i));
                Thread.sleep(TIME_SPEED);
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("\nSkipped");
        }
    }
}