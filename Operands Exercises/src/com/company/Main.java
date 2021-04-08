package com.company;

public class Main {

    public static void main(String[] args) {
	double firstValue = 20.00d;
	double secondValue = 80.00;
	double thirdParameter = (firstValue+secondValue)*100d;
        System.out.println("thirdParameter "  +  thirdParameter );
	double result = (thirdParameter)%40.00d;
        System.out.println("The result is equal to : "  +result);
    boolean isNoResult = (result==0)? true:false;
        System.out.println("IsNoResult " + isNoResult);
        if(!isNoResult){
            System.out.println("Got some reminder");
        }
    }
}
