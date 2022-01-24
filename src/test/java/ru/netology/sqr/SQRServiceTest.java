package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SQRServiceTest {
    @ParameterizedTest
//    @CsvSource(value = {"square inside range,200,300,3",
//            "square under range,100,199,4",
//            "square over range,301,400,3",
//            "zero range,0,0,0",
//            "interval border square number,225,225,0",
//            "invalid range, 225,220,0"})

    @CsvFileSource(resources = "/data.csv",delimiter = '|')

    public void shouldCount(String testName, int rangeStart, int rangeEnd, int expected) {
        SQRService service = new SQRService();

        int actual = service.rangeNumber(rangeStart, rangeEnd);

        assertEquals(expected, actual);
    }
}