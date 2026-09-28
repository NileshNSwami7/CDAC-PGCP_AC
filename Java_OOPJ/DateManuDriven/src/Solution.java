import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
        if(year>=2000 && year<=3000 ){
        	int num=0;
            int count=0;
            int i=0;
            
                if((year%4==0 && year%100!=0)||(year%400==0)){
                    if(month==2){
                    	while(i!=day)
                        {
                            if(count==6) {
                            	count=0;
                            }
                            i++;
                            count++;
                        }  
                    }
                    num= count;
               }else {
            		while(i!=day)
                    {
                        if(count==6) {
                        	count=0;
                        }
                        i++;
                        count++;
                    }
                    num=count;
               }
                String days[]={"","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
                String str = days[num];
                return str.toUpperCase();
        }
        return null;
       
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        

        int month = Integer.parseInt("08");

        int day = Integer.parseInt("05");

        int year = Integer.parseInt("2015");

        String res = Result.findDay(month, day, year);

       System.out.println(res);
    }
}
