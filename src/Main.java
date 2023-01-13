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
        System.out.println("Our Age:");
        alter = myScanner.nextInt();
        System.out.println("OK! You are " + alter+ " years old. Please enter your size in cm:");

        groeße = myScanner.nextInt();
        System.out.println("OK! You are " + alter+ " years old. Please enter your weight in kg:");

        gewicht = myScanner.nextDouble();

        System.out.println("Very nice! You are " + alter + " years old, " + groeße + "cm big and you weight is "+ gewicht+ " kg");

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