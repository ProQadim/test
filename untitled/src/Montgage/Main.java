//package Montgage;
//
//import java.text.NumberFormat;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//        int principal = 0;
//        float annual = 0;
//        byte years = 0;
//        while (true) {
//            System.out.print("Principal: ");
//            principal = scanner.nextInt();
//            if (principal >= 1000 && principal <= 1_000_000) {
//                break;
//            }
//            System.out.println("Enter value between 100 and 1000000");
//        }
//        while (true) {
//            System.out.print("Annual Interest Rate: ");
//            annual = scanner.nextFloat();
//            if (annual >= 1 && annual <= 30) {
//                break;
//            }
//            System.out.println("Enter value between 1 and 30");
//
//        }
//        while (true) {
//            System.out.print("Period(years): ");
//            years = scanner.nextByte();
//            if (years >= 1 && years <= 30) {
//                break;
//            }
//            System.out.println("Enter value between 1 and 30");
//
//        }
//
//        double montgage = calmorg(principal, annual, years);
//        String montgagef = NumberFormat.getCurrencyInstance().format(montgage);
//        System.out.println("Montgage: " + montgagef);
//
//
//    }
//
//    public static double calmorg(int principal, float annual, byte years) {
//
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//        float monthly = annual / PERCENT / MONTHS_IN_YEAR;
//        float numberp = years * MONTHS_IN_YEAR;
//        double montgage = principal * (monthly * Math.pow(1 + monthly, numberp)) / (Math.pow(1 + monthly, numberp) - 1);
//        return montgage;
//    }
//    public static double readnum(String Prom , double max , double min){
//        Scanner scanner = new Scanner(System.in);
//        double value;
//        while (true) {
//            System.out.print(Prom);
//            value = scanner.nextFloat();
//            if (value >= min && value <= max) {
//                break;
//            }
//            System.out.println("Enter value between" + min + "And" + max);
//
//        }
//
//    }
//}
