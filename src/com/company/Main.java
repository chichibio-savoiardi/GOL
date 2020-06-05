/*
 * fatto da Iuri Antico e Emanuele Parinetti
 * supporto morale da Federico Lattanzi
 */

package com.company;

import java.util.*;
import java.lang.*;
import com.company.javaUtils.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static final int dim = 11;
    static char[][] matrix0 = new char[dim][dim];
    static char[][] matrix1 = new char[dim][dim];

    public static void main(String[] args) {
        boolean check = false;
        int tatty = 0;
        matrixUtils.fill(matrix0, ' ');
        matrixUtils.randomBoolFill(matrix0);
        matrixUtils.print(matrix0);
        System.out.println();
        matrixUtils.copy(matrix0, matrix1);
        for (int k = 0; k < 10; k++)
        {
            for (int i = 1; i < 10; i++)
            {
                for (int j = 1; j < 10; j++)
                {
                    if (matrix0[i][j] == '#') {
                        check = true;
                    } else {
                        check = false;
                    }
                    tatty = conta(i, j, matrix0, check);
                    switch (tatty)	//in base alle celle vive adiacenti si fa morire o vivere la cella corrente
                    {
                        case 2:
                            if (check) {
                                matrix1[i][j] = '#';
                            }
                        case 3:
                            matrix1[i][j] = '#';
                            break;
                        default:
                            if (check == true)
                            {
                                matrix1[i][j] = ' ';
                            }
                            break;
                    }
                }
            }
            matrixUtils.copy(matrix1, matrix0);
            matrixUtils.print(matrix0);
            System.out.println();
        }
    }

    static int conta(int i1, int j1, char[][] m0, boolean check)
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
}
/* fin */