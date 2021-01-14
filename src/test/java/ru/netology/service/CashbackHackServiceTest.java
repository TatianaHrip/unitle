package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remainReturn0IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(executed,actual);
    }

    @Test
    void remainReturn1IfAmount899() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=1;
        int actual = cashbackHackService.remain(899);
        assertEquals(executed,actual);
    }

    @Test
    void remainReturn100IfAmount1100 (){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=100;
        int actual = cashbackHackService.remain(1100);
        assertEquals(executed,actual);
    }

}



