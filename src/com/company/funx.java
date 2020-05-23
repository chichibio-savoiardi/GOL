package com.company;

public class funx {
    public static int conta(int i1, int j1, char[][] m0, boolean check)
    {
        int q = 0;		//contatorte celle piene adiacenti
        for (int i = i1 - 1; i < i1 + 2; i++)
        {
            for (int j = j1 - 1; j < j1 + 2; j++)
            {
                if ( m0[i][j] == '#')
                {
                    q++;
                }
            }
        }
        if (check)
        {
            q--;
        }
        return q;
    }

    public static void rule1(int i, int j, char matr1[][])
    {
        matr1[i][j] = ' ';
    }

    public static void rule2(int i, int j, char matr1[][])
    {
        matr1[i][j] = '#';
    }

    public static void rule3(int i, int j, char matr1[][])
    {
        matr1[i][j] = ' ';
    }

    public static void rule4(int i, int j, char matr1[][])
    {
        matr1[i][j] = '#';
    }
}