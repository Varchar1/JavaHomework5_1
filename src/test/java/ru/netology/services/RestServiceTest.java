package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
    @Test
    public void RestTest1() {
        RestService service = new RestService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RestTest2() {
        RestService service = new RestService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

}
