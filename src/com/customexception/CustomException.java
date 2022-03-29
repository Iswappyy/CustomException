package com.customexception;

public class CustomException {
	public static void main(String[] args) {
		try {
			System.out.println(isEligibleMark(35));
		}

		catch (NotEligibleMarkException e) {
			e.printStackTrace();
		}

	}

	private static boolean isEligibleMark(int mark) throws NotEligibleMarkException {
		
	   if(mark >= 40) {
		   return true;
	   }
	   else {
		   throw new NotEligibleMarkException();
	   }
   }
}
