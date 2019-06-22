package com.sda.Zadanie11.Terminal;

public class TerminalService {

    char character = '*';
    private StringBuilder stringBuilder;

    public String write0(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

    }
