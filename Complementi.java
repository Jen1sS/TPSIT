package com.JoeMama;

public class Complementi {

    public static String CA1(String bin){
        String inverted="";
        String bin1=bin.replace("1","0");
        String bin0=bin.replace("0","1");

        for (int i=0;i<bin.length();i++){
            if (bin.charAt(i)==48){
                inverted=inverted+bin0.charAt(i);
            } else {
                inverted=inverted+bin1.charAt(i);
            }
        }
        return inverted;
    }

    public static String CA2(String bin){
        String result ="";
        int j;

        bin=CA1(bin);

        for (j=bin.length()-1;j>=0;j--){

        }


        return result.toString();

    }
}
