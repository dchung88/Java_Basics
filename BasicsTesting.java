public class BasicsTesting {
    public static void main(String[] args){
        Basics Basic13 = new Basics();

        Basic13.oneToTwoFiftyFive();

        Basic13.oddNumbers();

        Basic13.Sum();

        int[] arr = {1,2,3,4,5};
        Basic13.Iterate(arr);

        int[] arr2 = {10,20,30,40,50};
        Basic13.FindMax(arr2);

        int[] arr3 = {1,3,3,5};
        Basic13.GetAverage(arr3);

        Basic13.OddNumbersArray();

        int Y = 3;
        Basic13.GreaterThanY(arr, Y);

        int[] X = {1,2,5,10};
        Basic13.SquareValues(X);

        int[] N = {-1, 0, 1, -5, -7};
        Basic13.EliminateNegatives(N);

        int[] M = {1,2,3,4,5,6,7};
        Basic13.MaxMinAvg(M);

        int[] V = {0,1,2,3,4,5};
        Basic13.Shift(V);

    }
}