package com.company;

public class Main {


        public static void main(String[] args) {
            double[] myList = {1.9, -2.9, 3.4, 3.5};
            double sum = 0;
            int cold = 0;
            boolean otr = false;
            for (double xm : myList) {
                if (xm < 0) {
                    otr = true;
                } else {
                    if (otr) {
                        cold++;
                        sum += xm;
                    }


                }


            }
            System.out.println(" сред орефм " + sum /cold);
        }

}

