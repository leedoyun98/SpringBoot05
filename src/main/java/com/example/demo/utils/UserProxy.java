package com.example.demo.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserProxy extends Proxy {
    public String makeUSerid(){
        List<String> uidText = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "m", "o",                   "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
                                             "1", "2", "3", "4", "5", "6", "7", "8", "9", "0");
        Collections.shuffle(uidText);
        
        return String.format( "%s%s%s%s%s",
                                uidText.get(0),uidText.get(0),uidText.get(0),
                                uidText.get(0),uidText.get(0));
    }
}
