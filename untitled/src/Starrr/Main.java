package Starrr;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    int sc = scanner.nextInt();

    public void printst(int numberst){
        for(int i = 1; i<= numberst;i++){
            System.out.print('*');
        }
    }
    public void printsp(int numbersp){
        for(int i = 1; i<= numbersp;i++){
            System.out.print(' ');
        }
    }

    public void newline(){
        System.out.println();
    }
    public void lozi (int n){
        for(int i = 1 ; i<=n;i++){
            printsp(n - i);
            printst(i);
            printst(i-1);

            printsp(n - i);

            printsp(n - i);
            printst(i);
            printst(i-1);

            newline();

        }
        for(int i = 2 ; i<=n;i++){
            printsp(i -1);
            printst(n-i +1);
            printst(n-i);

            printsp(i -1);

            printsp(i -1);
            printst(n-i +1);
            printst(n-i);

            newline();
        }
    }
    public static void main(String[] args) {
        Main printer = new Main();
        printer.sc = (int) Math.ceil(((double)printer.sc + 0.01) / 2);
        printer.lozi(printer.sc);

    }
}
