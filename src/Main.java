import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static int alter;
    static int groeße;

    static double gewicht;
    static char infotxt;


    public static void main(String[] args) {
        Daten();
        double a = BMIRechner();

        outcome(a);




    }

    public static void Daten()
    {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Your Age:");
        alter = myScanner.nextInt();
        System.out.println("OK! You are " + alter+ " years old. Please enter your size in cm:");

        groeße = myScanner.nextInt();
        System.out.println("OK! You are " + alter+ " years old. And "+ groeße+ " big. Please enter your weight in kg:");

        gewicht = myScanner.nextDouble();

        System.out.println("Very nice! You are " + alter + " years old, " + groeße + "cm big and you weight is "+ gewicht+ " kg");

    }
    public static double BMIRechner(){
        double BMI = gewicht / (groeße * groeße);
        System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
        return BMI;


    }

    public static String outcome(double input)
    { Scanner myScanner = new Scanner(System.in);
        String output = null;

        if
        (input >= 25) {
            output = "Astronomer Adolphe Quetelet says overweight";
            System.out.println(output);
            System.out.println("Do you want more information?");
            infotxt = myScanner.next().charAt(0);

            if (infotxt == 'y')
                System.out.println("");
                else {
                    System.out.println("OK! See you!");
                }
            }

            else if (input >= 18.5) {
            output = "Astronomer Adolphe Quetelet says standardweight";
            System.out.println(output);
            System.out.println("Do you want more information?");
            infotxt = myScanner.next().charAt(0);
            if (infotxt == 'y')
                System.out.println("");
            else{
                System.out.println("OK! See you!");
                }

            } else if (input >= 15) {
            output = "Astronomer Adolphe Quetelet says underweight";
            System.out.println(output);
            System.out.println("Do you want more information?");
            infotxt = myScanner.next().charAt(0);
                if (infotxt == 'y')
                    System.out.println("");
                else {
                        System.out.println("OK! See you!");
                    }
        } else if (input < 15){
            output="You need to see a doctor  NOW!";
            System.out.println(output);
            System.out.println("Do you want more information?");
            infotxt = myScanner.next().charAt(0);
                    if (infotxt == 'y')
                        System.out.println("");
                else {
                            System.out.println("OK! See you!");
                        }
        }
        return output;
    }
}