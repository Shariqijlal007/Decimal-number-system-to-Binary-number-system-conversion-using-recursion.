package labreport8q2;
import java.io.*;
public class labreport8q2 {
	    static int find(int decimal_number)
	    {
	        if (decimal_number == 0)
	            return 0;
	             
	        else
	         
	        return (decimal_number % 2 + 10 *
	                find(decimal_number / 2));
	    }
	public static void main(String[] args) {		
		    int decimal_number = 12;
		    System.out.println(find(decimal_number));
		}
	}