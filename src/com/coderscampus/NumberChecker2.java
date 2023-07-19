package com.coderscampus;

import java.util.Random;

public class NumberChecker2 {
	Integer validateNumRange(int x) {
        
        if(x >= 1 && x <= 100)
            return x;
        else 
            return null;
    }
    
    int randomizer() {
        Random r = new Random();
        int x = r.nextInt(100)+1;
        return x;
    }
    
}
