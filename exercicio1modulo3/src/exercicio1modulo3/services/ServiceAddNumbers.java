package exercicio1modulo3.services;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

import exercicio1modulo3.exceptions.InvalidValueException;
import exercicio1modulo3.model.Numbers;

public class ServiceAddNumbers extends Numbers {

	public Integer amountOfNumbers() {
        String amount;
        while (true) {
            try {
                var scan = new Scanner(System.in);
                System.out.println("Enter the amount of numbers you want to enter!");
                amount = scan.nextLine();
             
                if (parseInt(amount) <= 1 || parseInt(amount) > Math.pow(10,5)) {
                    throw new InvalidValueException();
                }
                
                return parseInt(amount);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Incorrect value, enter an integer number!\n");
            } catch (InvalidValueException e) {
                e.printStackTrace();
                System.out.println("--- It is not allowed to enter integers less than or equal to 1, or greater than 10⁵ ---\n");
            }
        }

    }

    public void insertValues() {
        var scan = new Scanner(System.in);
        Integer q = amountOfNumbers();
        int i = 0;
        while (i<q) {

            try {
                System.out.println("Enter any positive integer : ");
                int number = parseInt(scan.nextLine());
               
                if (number < 0) {
                	System.out.println();
                    throw new InvalidValueException();
                }

                getNumberList().add(number);
                i++;

            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Incorrect value, enter an integer number!\n");
            } catch (InvalidValueException e) {
                e.printStackTrace();
                System.out.println("--- It is not allowed to enter negative numbers ---\n");
            }
        }
    }
	
}
