package ru.netology.javaqa.javaqamvn;

public class Radio {
    private int station;
    private int stationCount = 10;
    private int volume = 50;

    public Radio() {

    }

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }
    public int getStation(){
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (station == stationCount - 1) {
            station = 0;
        } else {
            station++;
        }
    }

    public void previous() {
        if (station == 0) {
            station = stationCount - 1;
        } else {
            station--;
        }
    }

    public void setStation(int number) {
        if (number >= 0 && number < stationCount) {
            station = number;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }


}
