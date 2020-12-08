package com.example.demo.utils;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.springframework.stereotype.Component;

@Component("px")
public class Proxy {
    public int integer(String t){
       Function<String, Integer> f = Integer::parseInt;
        return f.apply(t);
    }
    public String string(Object o){
        Function<Object, String> s = String::valueOf;
        return s.apply(o);
    }
    public boolean equals(String t1,String t2){
       BiPredicate<String,String> s = String::equals;
        return s.test(t1, t2);
    }
    public int random(int begin, int end){
    BiFunction<Integer, Integer, Integer> f = (t,u) ->  (int)(Math.random()*(u-t)) + t;
       
        return f.apply(begin, end);
    }
    public int[] array(int size){
      //  int[] arr =new int[5];
      Function<Integer,int[]> s = int[]::new;
        return s.apply(size);
    }
    public Map<Object, Object> hashmap(){
        Supplier<Map<Object, Object>> s = HashMap::new;
        return s.get();
    }
    public String message(int i){
        return (i == 1) ? "SUCCES" :"FIALURE";
    }
    public String time(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
    public File mkdir(String t, String u){
        BiFunction<String,String,File> s = File::new;
        return s.apply(t, u);
    }
    public File mkfile(File t, String u){
        BiFunction<File,String,File> s = File::new;
        return s.apply(t, u);
    }
}

