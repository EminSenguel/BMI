import java.util.Scanner;

public class Main {
    static int alter;
    static int groeße;

    static double gewicht;
    static char infotxt;

    static double BMI;


    public static void main(String[] args) {
        Daten();
        BMIRechner();

        outcome();




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
    public static void BMIRechner(){
        double g = groeße / 100.0;
        BMI = gewicht / (Math.pow(g,2));
        System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");

    }


    public static String outcome()
    { Scanner myScanner = new Scanner(System.in);
        String output = null;

        if (BMI >= 25) {
            output = "Astronomer Adolphe Quetelet says overweight";
            System.out.println(output);
            System.out.println("Want to know more?");
            infotxt = myScanner.next().charAt(0);

        } else if (BMI >= 18.5) {
            if (infotxt == 'y')
                System.out.println("Thick is not the same as fat! Your calculated BMI does not correspond to the norm, but still says nothing about how healthy or fit you are. According to the WHO, there are different types of chubbynes. From a certain degree we recommend to clarify how your weight affects your body. Your self-confidence can also depend on it. If you want to change something, talk to your doctor and/or a nutritionist. Don't overtax your body and take small steps little by little. Patience is a virtue, when changing your lifestyle you can (inevitably) acquire it.  ");
                else {
                    System.out.println("OK! Live long and in peace!");
                }
            }

            else if (BMI >= 18.5) {
            output = "Astronomer Adolphe Quetelet says standardweight";
        } else if (BMI >= 15) {
            System.out.println(output);
            System.out.println("Want to know more?");
            infotxt = myScanner.next().charAt(0);
            if (infotxt == 'y')
                System.out.println("Maybe you don't feel comfortable in your skin or you feel \"too fat/thin\". Relax, your weight is a normal weight according to your information. Propertions or your vital level cannot be calculated by the BMI calculator.  If you want to define your body or feel more vital throughout, share your desires with a verified fitness trainer and get some tips to reach your goals. Keep in mind that every body is individual, so try not to compare yourself to others and their training successes and failures. ");
            else{
                System.out.println("OK! Live long and in peace");
                }

            } else if (BMI >= 15) {
            output = "Astronomer Adolphe Quetelet says underweight";
        } else if (BMI < 15){
            System.out.println(output);
            System.out.println("Want to know more?");
            infotxt = myScanner.next().charAt(0);
                if (infotxt == 'y')
                    System.out.println("If you are healthy according to your doctor and feel well, everything is in best order. You could look into muscle building or seek advice from a nutritionist to increase your weight and compensate for any deficiencies. Be careful not to overtax your body and take small steps.");
                else {
                        System.out.println("OK! Live long and in peace");
                    }
        } else if (BMI < 15){
            output="You need to see a doctor  NOW!";
            System.out.println(output);
            System.out.println("Do you want more information?");
            infotxt = myScanner.next().charAt(0);
            if (infotxt == 'y')
                System.out.println("See a doctor NOW!");
            else {
                System.out.println("OK! Hope you're doing good");
            }
        }

}