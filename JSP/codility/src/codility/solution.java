package codility;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String E = sc.nextLine();
		String L = sc.nextLine();
		
		   String startTime = E.replace(":", "");
	       String endTime  = L.replace(":", "");
	       
	        int sumTime =  Integer.parseInt(endTime) - Integer.parseInt(startTime);
	        String sTime = String.valueOf(sumTime);
	      String minute= sTime.substring(sTime.length()-2, sTime.length());
	      String hour =  sTime.substring(0, sTime.length()-2);

	        int hTime =   Integer.parseInt(hour);
	        int mTime =   Integer.parseInt(minute);
	       System.out.println(hTime);      
	       System.out.println(mTime);
	       
	     
	        int sumCost = 2;
	        if(hTime == 0 && mTime != 0){   
	            sumCost += 3;    
	        }
	        if(hTime >= 1 && mTime != 0){
	            sumCost += 3+(4*hTime);  
	        }else if(hTime >= 1 && mTime == 0){
	            sumCost += (4*hTime-1);
	        }
	        System.out.println("sumCost::"+sumCost);
	       
	}

}
