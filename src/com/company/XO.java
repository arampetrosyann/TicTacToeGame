package com.company;

import java.util.Scanner;

public class XO
{
    Scanner scanner = new Scanner(System.in);

    int k1;

    int k2;

    char symbol;

    boolean bool;

    XO (boolean bool2)
    {
        bool = bool2;

        getInput();
    }

    void getInput()
    {
        System.out.print("c1 - ");

        k1 = scanner.nextInt();

        System.out.print("c2 - ");

        k2 = scanner.nextInt();

        System.out.print("Symbol - ");

        String str = scanner.next();

        symbol = str.charAt(0);

        if (!bool)
        {
            while (symbol != 'X')
            {
                System.out.print("It is turn of X - ");

                String in = scanner.next();

                symbol = in.charAt(0);
            }

            bool = true;
        }

        else if (bool)
        {
            while (symbol != 'O')
            {
                System.out.print("It is turn of 0 - ");

                String in = scanner.next();

                symbol = in.charAt(0);
            }

            bool = false;
        }
    }
}