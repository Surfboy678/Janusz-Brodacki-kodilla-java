package com.kodilla.hibernate2.manytomany.facade;



    public class FindServiceException extends Exception {

        public static String ERR_NOT_FOUND_EMPLOYEE = "Employee was't found";
        public static String ERR_NOT_FOUND_COMPANY = "Company was't found";

        public FindServiceException(String message){
            super(message);
        }

    }
