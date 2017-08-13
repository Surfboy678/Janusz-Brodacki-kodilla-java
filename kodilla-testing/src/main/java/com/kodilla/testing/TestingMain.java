package com.kodilla.testing;

import calculator.Calculator;


    public class TestingMain {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();

            int result1 = calculator.addAToB(5, 5);
            int result2 = calculator.substractAFromB(10, 8);
            if (result1 == 10) {
                if (result2 == 2) ;
                {
                    System.out.println("test OK");

                    if(result1 != 10){
                        if(result2 != 2)
                        {
                            System.out.println("Test error");
                        }

                    }


                }
            }
        }
    }


