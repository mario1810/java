package com.generation;

public class AckermanApp {

	
	public static int ackerman(int m, int n) {
		//base case
		if(m==0)
			return n+1;
		
		else if(m>0 && n==0)
			return ackerman(m-1,1);
		else if(m>0 && n>0)
			return ackerman(m-1, ackerman(m, n-1));
		return 0;
	}
}

