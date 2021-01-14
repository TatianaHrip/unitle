package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest_Ju_4 {

    @Test
    public void remainReturn1000IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed = 1000;
        int actual = cashbackHackService.remain(1000);
        assertEquals(executed, actual);
    }

    @Test
    public void remainReturn1IfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 1;
        int actual = cashbackHackService.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void remainReturn100IfAmount900 (){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=100;
        int actual = cashbackHackService.remain(900);
        assertEquals(executed,actual);
    }

}