package com.sda.Zadanie11.Terminal;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class TerminalTest {

    @Test
    public void workTest() {
        Terminal terminal= new Terminal();
        terminal.scanner = new Scanner("88888888");
        terminal.work();
    }
}