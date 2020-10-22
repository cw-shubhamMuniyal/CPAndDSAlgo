package Algorithms;

import DS.Queue.QueueDS;

import java.io.*;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Math;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Solution {

    public static <T> void printTemplate(T element){
        System.out.println(element);
    }

    public static void pf(Object ob){
        System.out.print(ob);
    }

    public static void pfn(Object ob){
        System.out.println(ob);
    }

    public static long mulMod(long a,long b){
        long mod=1000000007;
        return ((a*b)%mod);
    }



    public static void main(String[] args)throws Exception  {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        QueueDS ob=new QueueDS(5);
        String[] fruits={"mango", "apple", "banana", "pineapple", "jack"};
        for(String fruit:fruits){
            ob.enque(fruit);
        }
        pfn(ob.front());
        pfn(ob.rear());
        pfn(ob.deque());
        pfn(ob.front());
        ob.enque("watermelon");
        pfn(ob.front());
        pfn(ob.rear());

    }
}

