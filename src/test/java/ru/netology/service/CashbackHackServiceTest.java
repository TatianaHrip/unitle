package ru.netology.service;

import static org.testng.Assert.*;

class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void remainReturn0IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(executed,actual);
    }

    @org.testng.annotations.Test
    void remainReturn1IfAmount899() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    void remainReturn100IfAmount1100 (){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=100;
        int actual = cashbackHackService.remain(1100);
        assertEquals(executed,actual);
    }

}



