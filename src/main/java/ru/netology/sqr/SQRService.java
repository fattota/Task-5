package ru.netology.sqr;

public class SQRService {
    public int sort(int upperRange, int lowerRange) {


        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerRange && i * i <= upperRange) {
                counter++;


            }

        }

        return counter;

    }
}

