package ru.netology.sqr;

public class SQRService {
    int count = 0;

    public int rangeNumber(int rangeStart, int rangeEnd) {
        int i;
        for (i = 10; i <= 99; i++) {
            if ((i * i > rangeStart) & (i * i <= rangeEnd)) count = count + 1;
        }
        return count;
    }
}
