package com.masai.problem_3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        //Creation of main class object
        Main main = new Main();
        Hotel hotel = main.provideFood(amount);

        if(hotel instanceof TajHotel) {
            hotel.chickenBiryani();
            hotel.masalaDosa();

            //Down casting to use the specific method of TajHotel Object
            ((TajHotel) hotel).welcomeDrink();
        } else if  (hotel instanceof RoadSideHotel) {
            hotel.chickenBiryani();
            hotel.masalaDosa();
        } else {
            System.out.println("Please Enter a valid amount");
        }
    }

    public Hotel provideFood(int amount){
        //write the logic if the supplied amount is more than 1000
        //then return the object of TajHotel class
        //if the supplied amount is greater than 200 and less than 1000
        //then return the object of RoadSideHotel class
        //otherwise return the null value.

        if(amount > 1000) {
            return new TajHotel();
        } else if (amount > 200) {
            return new RoadSideHotel();
        } else {
            return null;
        }
    }
}
