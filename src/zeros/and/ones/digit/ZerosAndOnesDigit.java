/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeros.and.ones.digit;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class ZerosAndOnesDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
            int count0=0,count1=0;
            String str = input.next();
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='0')
                {
                    count0++;
                }
                else
                {
                    count1++;
                }
            }
            if(count0==1 || count1==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        t--;
    }
}

    

