package com.techreturners.exercise001;

import java.util.List;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        
        return word.substring(0,1).toUpperCase()+ word.substring(1) ;
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.substring(0,1)+ "." +lastName.substring(0,1);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double calc = ((originalPrice/100)*vatRate)+originalPrice;
        return Math.round(calc*100.0)/100.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        StringBuffer sbr = new StringBuffer(sentence);

        sbr.reverse();
        
        return sbr.toString();
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
         //int occur = Collections.frequency(users, "Linux");
        long count = users.stream().filter(x->x.equals("Linux")).count();
       
        
        return count;
    }
}
