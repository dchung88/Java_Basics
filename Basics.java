import java.util.ArrayList;

public class Basics {
    
    public void oneToTwoFiftyFive() {
        for(var i = 1; i <= 255; i++){
            System.out.println(i);
        }

    }
    public void oddNumbers() {
        for(var j = 1; j <= 255; j++){
            if(j % 2 != 0){
                System.out.println(j);
            }
        }
    }
    public void Sum() {
        int sum = 0;
        for(var k = 0; k <= 255; k++){
            sum += k;
            System.out.println("New number: " + k + " Sum: " + sum);
        }
    }
    public void Iterate(int[] arr) {
        for(var l = 0; l < arr.length; l++){
            System.out.println(arr[l]);
        }
    }
    public void FindMax(int[] arr2){
        int max = 0;
        for(var i = 0; i < arr2.length; i++){
            if(arr2[i] > max){
                max = arr2[i];
            }
        }
        System.out.println(max);
    }
    public void GetAverage(int[] arr3){
        int sum = 0;

        for(var i = 0; i < arr3.length; i++){
            sum += arr3[i];
        }
        double avg = sum / arr3.length;
        System.out.println(avg);
    }
    public void OddNumbersArray(){
        ArrayList<Integer> Y = new ArrayList<Integer>();
        for(var i = 1; i < 255; i++){
            if(i % 2 != 0){
                Y.add(i);
            }
        }
        System.out.println(Y);
    }
    public void GreaterThanY(int[] arr, int Y){
        int greater = 0;
        for(var i = 0; i < arr.length; i++){
            if(arr[i] > Y){
                greater += 1;
            }
        }
        System.out.println("Total greater than Y: " + greater);
    }
    public void SquareValues(int[] X){
        ArrayList<Integer> sv = new ArrayList<Integer>();
        for(var i = 0; i < X.length; i++){
            X[i]= X[i] * X[i];
            sv.add(X[i]);
        }
        System.out.println(sv);
    }
    public void EliminateNegatives(int[] N){
        ArrayList<Integer> en = new ArrayList<Integer>();
        for(var i = 0; i < N.length; i++){
            if(N[i] < 0){
                N[i] = 0;
                en.add(N[i]);
            }
            else{
                en.add(N[i]);
            }
        }
        System.out.println(en);
    }
    public void MaxMinAvg(int[] M){
        ArrayList<Integer> mma = new ArrayList<Integer>();
        int sum = 0;
        int max = M[0];
        int min = M[0];
        
        for(var i = 0; i < M.length; i++){
            if(M[i] < min){
                min = M[i];
            }
            else if(M[i] > max){
                max = M[i];
            }
            sum += M[i];
        }
        int avg = sum / M.length;
        mma.add(min);
        mma.add(max);
        mma.add(avg);

        System.out.println(mma);

    }
    public void Shift(int[] V){
        ArrayList<Integer> shifted = new ArrayList<Integer>();
        for(var i = 0; i < V.length; i++){
            if(i == V.length - 1){
                shifted.add(0);
            }
            else{
                shifted.add(V[i + 1]);
            }
        }
        System.out.println(shifted);
    }
}