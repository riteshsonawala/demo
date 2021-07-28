package com.example.controllers;

public class AddtheNumber {


    public static void main(String args[]){
        String input[]={"1","2","3","4","5" };

        int positionMarker=input.length-1;
        double numberWithDecimal=0;
        for (int i = 0; i <input.length ; i++) {

            int origNumber = Integer.parseInt(input[i]);
            numberWithDecimal+=getNumberMultipliedByItsDecimalPosition(origNumber,positionMarker);
            positionMarker--;
        }
        System.out.println(numberWithDecimal+1);
    }

    private static double getNumberMultipliedByItsDecimalPosition(int number, int position) {
        if(position==0){
            return number;
        }
        return number*Math.pow(10,position);
    }
}
