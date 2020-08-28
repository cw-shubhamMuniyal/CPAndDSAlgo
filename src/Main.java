/**
 * Created by User on 11-08-2020.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
//import DS.Stack.StackDS;
//import Algorithms.KMPAlgo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static <T> void printTemplate (T var0){System.out.println(var0);}
    public static void pf(Object var0) {
        System.out.print(var0);
    }
    public static void pfn(Object var0) {
        System.out.println(var0);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t=(Integer.parseInt(br.readLine().trim())), n,k, numOnes,numZeros, noSeg;
        String arr[], binaryStr;
        StringBuilder ans,ans2,ans3;
        for(int i=0;i<t;i++){
            ans=new StringBuilder("");

            numOnes=0;
            numZeros=0;
            arr=br.readLine().split(" ");
            n=Integer.parseInt(arr[0]);
            k=Integer.parseInt(arr[1]);
            noSeg=n/k;
            binaryStr=br.readLine().trim();
            for(int j=0;j<n;j++){
                if(binaryStr.charAt(j) == '0') numZeros++;
                if(binaryStr.charAt(j) == '1') numOnes++;
            }

            if(numZeros%noSeg != 0 || numOnes%noSeg != 0){
                pfn("IMPOSSIBLE");
            }
            else{
                ans2=new StringBuilder("");

                for(int j=0;j<(numZeros/noSeg);j++){
                    ans.append("0");
                }
                for(int j=0;j<(numOnes/noSeg);j++){
                    ans.append("1");
                }
                noSeg--;

                if( noSeg!=0){

                    ans2=new StringBuilder(ans);
                    ans2.reverse();

                    ans3=new StringBuilder(ans);
                    ans3.append(ans2);
                    noSeg--;
                }
                else{
                    ans3=ans;
                }
                int count=0;
                while(noSeg>0){
                    if(count==0){
                        ans3.append(ans);
                        noSeg--;
                        count++;
                    }
                    else{
                        ans3.append(ans2);
                        noSeg--;
                        count=0;
                    }
                }
                pfn(ans3);
            }

        }

    }

}

