package com.example.demo.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.demo.utils.Printer;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class StringTest {
    public static void main(String[] args) {
        // String one = "1";
        // String two = "2";
        // int o = Integer.parseInt(one);
        // int t = Integer.parseInt(two);
        // String sum = String.valueOf(o+t);
        // System.out.println("1+2= "+sum);

        // int r =(int)(Math.random()*45) + 1;
        // System.out.println("랜덤수"+r);

        // System.out.println("시간"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        String url = "https://music.bugs.co.kr/recomreview?&order=listorder&page=2";
        
        
        try{
            Document rawData = Jsoup.connect(url).timeout(10*1000).get();
            Elements arr = rawData.select("a[class=albumTitle hyrend]");
            System.out.println("===title===");
            for(Element e : arr) System.out.println(">>"+e.text());
            System.out.println("===content===");
            Elements arr2 = rawData.select("aside[class=recommendReview]");
        } catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
