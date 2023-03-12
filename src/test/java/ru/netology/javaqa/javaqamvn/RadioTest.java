package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource(value = {
            "0, 1",
            "1, 2",
            "4, 5",
            "7, 8",
            "8, 9",
            "14, 0"
    })
    public void shouldStationIncrease(int start, int expected) {
        Radio radio = new Radio(15);
        radio.setStation(start);
        radio.next();
        int actual = radio.getStation();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0, 14",
            "1, 0",
            "2, 1",
            "5, 4",
            "8, 7",
            "9, 8"
    })
    public void shouldStationDecrease(int start, int expected) {
        Radio radio = new Radio(15);
        radio.setStation(start);
        radio.previous();
        int actual = radio.getStation();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "-20, 0",
            "-1, 0",
            "0, 0",
            "1, 1",
            "5, 5",
            "8, 8",
            "9, 9",
            "10, 10",
            "20, 0"
    })
    public void shouldStationFrom0To9(int set, int expected) {
        Radio radio = new Radio(15);
        radio.setStation(set);
        int actual = radio.getStation();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1, 51",
            "10, 60",
            "51, 100"

    })
    public void shouldVolumeIncrease(int taps, int expected) {
        Radio radio = new Radio();
        for (int i = 0; i < taps; i++) {
            radio.increaseVolume();
        }
        int actual = radio.getVolume();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1, 49",
            "10, 40",
            "51, 0"
    })
    public void shouldVolumeDecrease(int taps, int expected) {
        Radio radio = new Radio();
        for (int i = 0; i < taps; i++) {
            radio.decreaseVolume();
        }
        int actual = radio.getVolume();
        Assertions.assertEquals(actual, expected);
    }
}
