package ru.netology.sqr;

public class SQRService {
    public int calcSQR (int border1, int border2){
        int count = 0;

        for (int i = 10; i < 99; i++){
            int x = i * i;
            if (x >= border1 && x <= border2) {
                count += 1;
            }
        }
        return count;
    }
}
