package val;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        for (int i = 0; i < num.length(); i++) {

            System.out.print(num.charAt(i) + ": ");
            int numericValue = Character.getNumericValue(num.charAt(i));
            for (int j = 0; j < numericValue; j++) {
                System.out.print(num.charAt(i));
            }

            System.out.println();
        }

    }
}

