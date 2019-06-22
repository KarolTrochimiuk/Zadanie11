package com.sda.Zadanie11.Terminal;

import java.util.Scanner;

public class Terminal {
    private int number;
    public Scanner scanner;
    public Terminal(){
        this.scanner=new Scanner(System.in);
    }


    public void work() {
        System.out.println("Podaj Liczbe");

        String input = scanner.next();
        Integer integer = Integer.getInteger(input);

        number = praseInteger(input);
        TerminalService terminalService =new TerminalService();
        System.out.println(terminalService.write0(number));
    }

    private int praseInteger(String input) {
        Integer integer = Integer.parseInt(input);
        return integer;
    }

}