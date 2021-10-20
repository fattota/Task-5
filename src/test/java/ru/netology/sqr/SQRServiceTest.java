package ru.netology.sqr;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {


    @Test
    void shouldSortValid() {
        SQRService service = new SQRService();

        int upperRange = 300;
        int lowerRange = 200;
        int expected = 3;

        int actual = service.sort(upperRange, lowerRange);

        assertEquals(expected, actual);

    }

    @Test
    void shouldSortInvalid() {
        SQRService service = new SQRService();

        int upperRange = -300;
        int lowerRange = -200;
        int expected = 0;

        int actual = service.sort(upperRange, lowerRange);

        assertEquals(expected, actual);

        {


        }
    }

    @Test
    void shouldSortBorderValue() {
        SQRService service = new SQRService();

        int upperRange = 100;
        int lowerRange = 11;
        int expected = 1;

        int actual = service.sort(upperRange, lowerRange);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSortBorderValueMax() {
        SQRService service = new SQRService();

        int upperRange = 2147483647;
        int lowerRange = 0;
        int expected = 90;

        int actual = service.sort(upperRange, lowerRange);

        assertEquals(expected, actual);
    }
}
