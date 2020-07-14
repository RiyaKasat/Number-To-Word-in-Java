/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertoword;

import java.io.Console;

/**
 *
 * @author Riya
 */
public class NumberToWord {

    
    public static void main(String[] args)
    {
        String str; 
        Console con = System.console(); 
        if(con == null)  
        { 
            System.out.print("No console available"); 
            return; 
        } 
          
       
        str = con.readLine("Enter a number: "); 
        con.printf("Number: %s\n", str);
        
        float i= Float.parseFloat(str);
        if(i< 0)
            con.printf("Incorrect output : Must be positive");
        
        else if(i> 999999.99)
            con.printf("Not Supported");
        else
        {
            if(str.contains("."))
              { String[] a= str.split("\\.");
               String b="";
            int num1=Integer.parseInt(a[0]);
          
            String word= convert(num1);
            
            if(Integer.parseInt(a[1])<10)
            {
                b = a[1] + "/10";
            }
            else
                if(Integer.parseInt(a[1])>= 10)
                {
                    b =  a[1] + "/100";
                }
        con.printf("Output : %s\n",word + b + " ONLY");
        }
            
            else
            {
               String word= convert((int)(i));  
               con.printf("Output : %s\n",word + " ONLY");
            }
        
        
    }
    }
    
    static String fun(int num)
    {
     String str="";
     String units[] = { "", "one ", "two ", "three ", "four ", 
                            "five ", "six ", "seven ", "eight ", 
                            "nine ", "ten ", "eleven ", "twelve ", 
                            "thirteen ", "fourteen ", "fifteen ", 
                            "sixteen ", "seventeen ", "eighteen ", 
                            "nineteen " }; 
  
    
     String tens[] ={ "", "", "twenty ", "thirty ", "forty ", 
                            "fifty ", "sixty ", "seventy ", "eighty ","ninety"}; 
     
    if(num<20)
        str = units[num];
    
    else if(num>=20 && num<100)
        str= tens[num/10]+" "+ units[num%10];
    
    return str;
    
    }
    
    static String convert(int num)
    {
        String s="";
        if(num<100)
          s=  fun(num);
        
        else if(num>=100 && num<1000)
            s = fun(num/100) + "Hundred " + "AND " +convert(num%100) ; //Hundred
        
        else if(num>=1000 && num< 100000)
            s= fun(num/1000) + "Thousand " + convert(num%1000); //thousands
        
        else if(num>= 100000 && num< 10000000)
            s= fun(num/100000)+ "lakhs "+ convert(num%100000); //lakhs
            
        return s;
    }
}
