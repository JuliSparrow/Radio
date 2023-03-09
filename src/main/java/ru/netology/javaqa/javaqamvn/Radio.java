package ru.netology.javaqa.javaqamvn;

public class Radio {
    int station;
    int volume = 50;

    public int getStation(){
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (station == 9) {
            station = 0;
        } else {
            station++;
        }
    }

    public void previous() {
        if (station == 0) {
            station = 9;
        } else {
            station--;
        }
    }

    public void setStation(int number) {
        if (number >= 0 && number <= 9) {
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
