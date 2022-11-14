package Vr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String traficlight = scanner.next();
        switch (traficlight){
            case "green":
                System.out.println("Go!!!!!!");
                break;
            case "red":
                System.out.println("Stop!!!!!!!!!!");
                break;
            case "yellow":
                System.out.println("Slow!!!!!!");
                break;
            default:
                System.out.println("Error");
        }

    }
}
