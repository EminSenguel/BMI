import java.util.Scanner;

public class Main {
    static int alter;
    static int groeße;

    static double gewicht;


    public static void main(String[] args) {
        Daten();

    }

    public static void Daten()
    {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Alter eingeben:");
        alter = myScanner.nextInt();
        System.out.println("OK! Du bist also " + alter+ " Jahre alt. Gib bitte deine Größe ein in cm:");

        groeße = myScanner.nextInt();
        System.out.println("OK! Du bist also " + alter+ " Jahre alt. Gib jetzt bitte dein Gewicht in Kg:");

        gewicht = myScanner.nextDouble();

        System.out.println("Sehr gut! Du bist also " + alter + " Jahre alt, " + groeße + "cm groß und wiegst "+ gewicht+ " Kg");

    }
}