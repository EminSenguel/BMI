import java.util.Scanner;

public class Main {
    static int alter;
    static int groeße;

    static double gewicht;


    public static void main(String[] args) {
        Daten();
        //outcome()

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
    public double BMIRechner(int groeße, int gewicht){
        double BMI = gewicht / (groeße * groeße);
        System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
        return BMI;


    }

    public String outcome(int input)
    {
        String output = null;

        if
        (input >= 25) {
            output = "Astronomer Adolphe Quetelet says overweight";

        } else if (input >= 18.5) {
            output = "Astronomer Adolphe Quetelet says standardweight";
        } else if (input >= 15) {
            output = "Astronomer Adolphe Quetelet says underweight";
        } else if (input < 15){
            output="You need to see a doctor  NOW!";
        }
        return output;
    }
}