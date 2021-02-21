package com.techreturners.exercise001;

import java.util.List;
import java.lang.*;


public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0,1).toUpperCase()+ word.substring(1) ;
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0,1)+ "." +lastName.substring(0,1);
    }

    public double addVat(double originalPrice, double vatRate) {
        double calc = ((originalPrice/100)*vatRate)+originalPrice;
        return Math.round(calc*100.0)/100.0;
    }

    public String reverse(String sentence) {
        StringBuffer sbr = new StringBuffer(sentence);
        sbr.reverse();
        
        return sbr.toString();
    }

    public int countLinuxUsers(List<User> users) {
        return (int)users.stream().filter(user->user.getType().equals("Linux")).count();
    }
}
