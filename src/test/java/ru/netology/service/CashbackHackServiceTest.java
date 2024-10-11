package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {



    @Test
    public void chashback1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }

    @Test
    public void chashback2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }


    @Test
    public void chashback3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @Test
    public void chashback4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

}