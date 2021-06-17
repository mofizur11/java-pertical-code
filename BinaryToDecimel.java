package android.project;

import java.util.Scanner;

public class BinaryToDecimel {

	public static void main(String[] args) {
		Scanner bi= new Scanner(System.in);
        long binarynum=bi.nextLong();
        boolean isBinary=true;
        String binarynum_str= ""+binarynum;
        for(int j=0; j<binarynum_str.length(); j++)
        {
           if(!(binarynum_str.charAt(j)=='0' || binarynum_str.charAt(j)=='1'))
               isBinary=false;
        }
        if(isBinary)
        {
        long decimal = binary_decimal(binarynum);
        System.out.println(binarynum+" in decimal form is "+decimal+".");
        }
        else
        {
            System.out.println("Please enter a binary number (A number which contains only 0 and 1).");
        }
    }
    static long binary_decimal(long a)
    {
        long f=a%10;
        long sum=0;
        for(long g=0;a!=0;f=a%10)
        {
            sum=sum+ (int)(f* Math.pow(2,g));
            a/=10;
            g++;
        }
        return sum;
	}

}
