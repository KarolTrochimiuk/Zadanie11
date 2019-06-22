package com.sda.Zadanie11.Terminal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TerminalServiceTest {

    @Test
    public void createLine() {
        TerminalService terminalService = new TerminalService();
        int number = 5;
        String returned =terminalService.write0(number);
        String expected ="******";
        Assert.assertEquals(returned, expected);

    }
}