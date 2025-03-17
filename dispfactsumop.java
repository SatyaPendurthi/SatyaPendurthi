package myproject1;

public class dispfactsumop {
	    public static void main(String[] args) {
	        System.out.println("----------------------");
	        System.out.println("  Number   Factorial");
	        System.out.println("----------------------");
	        int f=1, Sum=0;
	        for(int i=1; i<=5; i++)
	        {
	        	f = f*i;
	        	System.out.println("   "+i+"	      "+f);
	        	 Sum = Sum +f;
	        }
	        System.out.println("---------------------");
	        System.out.println("   Sum   =    "+Sum);
	        System.out.println("---------------------");
	   
	    }  
	}