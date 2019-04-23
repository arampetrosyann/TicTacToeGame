package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        int c = 0;

        while (c < 3 || n < 3)
        {
            System.out.print("Size of board - ");

            n = scanner.nextInt();

            System.out.print("Wining Parameter - ");

            c = scanner.nextInt();

            System.out.println("");
        }

        Board board = new Board(n, n, c);

        board.start();
    }
}