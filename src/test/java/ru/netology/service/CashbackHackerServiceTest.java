package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;


public class CashbackHackerServiceTest {
    @Test
    public void ShouldCheckInRangeOfEquivalentValue() {

        CashbackHackerService service = new CashbackHackerService();

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldCheckLowerBorderValue() {

        CashbackHackerService service = new CashbackHackerService();

        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldCheckUpperBorderValue() {

        CashbackHackerService service = new CashbackHackerService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldCheckOverLowerBorderValue() {

        CashbackHackerService service = new CashbackHackerService();

        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void ShouldCheckOverUpperBorderValue() {

        CashbackHackerService service = new CashbackHackerService();

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void ShouldCheckBeforeUpperBorderValue() {

        CashbackHackerService service = new CashbackHackerService();

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }
}
