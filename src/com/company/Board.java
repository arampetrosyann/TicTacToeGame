package com.company;

public class Board
{
    private static char board[][];

    int X = 1;

    int O = 0;

    private static int win;

    private boolean pos_p = false;

    Checking check = new Checking(board);

    Board (int h, int w, int win)
    {
        board = new char[h][w];

        this.win = win;

        for (int i = 0; i < board.length; i++)
        {

            for (int j = 0; j < board.length; j++)
            {
                board[i][j] = '-';
            }
        }
    }

    void pboard ()
    {
        for (int i = 0; i < board.length ; i++)
        {

            for (int j = 0; j < board.length ; j++)
            {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    void start ()
    {
        XO input = new XO(pos_p);

        pos_p = input.bool;

        Allow (input.symbol, input.k1, input.k2);

        game();
    }

    void Allow (char a, int b, int c)
    {

        if (b >= 0 && b < board.length && c >=0 && c < board.length)
        {

            if (board [b][c] != '-')
            {
                System.out.println("You can't do that");

                pos_p =! pos_p;

                game();
            }

            board [b][c] = a;
        }
        else
        {
            System.out.println("You can't do that");

            pos_p =! pos_p;

            game();
        }

        pboard();
    }

    void game()
    {
        while (!check.check_all(board, board.length, win))
        {
            XO input = new XO(pos_p);

            pos_p = input.bool;

            if (pos_p)
            {
                O++;
            }

            else
            {
                X++;
            }

            Allow (input.symbol, input.k1, input.k2);
        }

        if (pos_p)
        {
            System.out.print("player X win");
        }
        else
        {
            System.out.print("player O win");
        }
    }

}