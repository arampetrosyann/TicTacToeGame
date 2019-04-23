package com.company;

public class Checking
{

    char checkBoard[][];

    Checking (char passedBoard[][])
    {

        checkBoard = passedBoard;
    }

    private boolean finding (char a[][])
    {
        for (int i = 0; i < a.length; i++)
        {

            for (int j = 0; j < a.length; j++)
            {

                if (a[i][j] == '-')
                {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean crow (char a[], int win)
    {
        int k = 1;

        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] == a[i + 1] && a[i] != '-')
            {
                ++k;
            }
        }

        if (k == win)

        {
            return true;
        }

        else if (k > win)

        {
            System.out.println("Wrong");

            return false;
        }

        return false;
    }

    char [] gcolumn(char a[][], int j)
    {
        char j_column[] = new char[a.length];

        for (int i = 0; i < a.length; i++)
        {

            j_column[i] = a[i][j];
        }
        return j_column;
    }

    private char [] getdi0 (char a[][], int start_i, int start_j)
    {
        char l_diagonal[] = new char[start_i + 1];

        for (int i = start_i; i >= 0; i--)
        {

            l_diagonal [start_j] = a[i][start_j++];
        }

        return l_diagonal;
    }

    private char [] getdi1 (char a[][], int start_i, int start_j)
    {
        char r_diagonal [] = new char[a.length - start_i];

        for (int i = start_i; i < a.length; i++)
        {
            r_diagonal [a.length - 1 - start_j] = a [i] [start_j--];
        }

        return r_diagonal;
    }

    private char [] getdi2 (char a[][], int start_i, int start_j)
    {
        int j = start_j;

        char l_diagonal[] = new char[a.length - start_j];

        for (int i = start_i; i < a.length  - start_j; i++)
        {
            l_diagonal [i] = a [i] [j++];
        }

        return l_diagonal;
    }

    private char [] getdi3 (char a[][], int start_i, int start_j)
    {
        char r_diagonal[] = new char[a.length - start_i];

        for (int i = start_i; i < a.length; ++i)
        {

            r_diagonal[start_j] = a[i][start_j++];
        }
        return r_diagonal;
    }

    boolean check_all (char a[][], int n, int win)
    {

        for (int i = 0; i < n; i++)
        {

            if (!finding(a))
            {
                return true;
            }

            if (crow(a[i], win))
            {

                return true;
            }
            if(crow(gcolumn(a, i), win))
            {
                return true;
            }
        }

        for (int i = 0; i < n; i++)
        {

            if(crow(getdi0(a, i, 0), win))
            {
                return true;
            }

            if(crow(getdi1(a, i, a.length - 1), win))
            {
                return true;
            }

            if(crow(getdi2(a, 0, i), win))
            {

                return true;
            }

            if(crow(getdi3(a, i, 0), win))
            {

                return true;
            }
        }
        return false;
    }
}