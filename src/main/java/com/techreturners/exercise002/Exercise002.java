package com.techreturners.exercise002;
import com.techreturners.exercise002.Person;

public class Exercise002 {

    public boolean isFromManchester(Person person ) {

        if (person.getCity().equals("Manchester"))

        return true;
        return false;

}

    public boolean canWatchFilm(Person person, int ageLimit) {
        // Add your code here
        if (person.getAge()<ageLimit)

        return false;
        return true;
    }
    
}






