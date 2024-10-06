package com.SQLDB.SQLDB;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        int coin, flip, hcount = 0, tcount = 0;

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many times has to be flip :");
        flip = scanner.nextInt();

        if (flip < 0){
            System.out.println("Error enter the number");
        }else {
            for (int i = 0; i < flip; i ++){

                coin = rand.nextInt(2);

                if (coin == 0){
                    System.out.println("Head");
                    hcount++;
                }else {
                    System.out.println("tails");
                    tcount++;
                }
            }
            System.out.println("heads ratio:"+ hcount * 1.0 / flip);
            System.out.println("tails ratio:"+ tcount * 1.0 / flip);
        }
        scanner.close();
    }

}
