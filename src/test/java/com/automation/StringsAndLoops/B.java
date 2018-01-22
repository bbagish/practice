package com.automation.StringsAndLoops;

class B{

	public static int solution(int N) {
	     String binRep = Integer.toBinaryString(N);
	     System.out.println("String rep: "+binRep);
	    int currentItr = 0;
	    int maxZeroSeq = 0;
	    for (int index = 0; index <binRep.length(); index ++) {
	        if (binRep.charAt(index) == '0') {
	            ++currentItr;
	        } else {
	            maxZeroSeq = Math.max(maxZeroSeq, currentItr);
	            currentItr = 0;
	        }
	    }
	    if (currentItr!=0) {
	        if (currentItr > maxZeroSeq) {
	            return maxZeroSeq;
	        }
	    }
	    return Math.max(maxZeroSeq, currentItr);
	}
	
	public static void main(String[] args) {
		int solutions=solution(529);
		System.out.println(solutions);
		try {
			
		}catch(ArithmeticException e){
			e.printStackTrace();
			
		}catch(RuntimeException e) {
			
		}catch(Exception e) {
			
		}catch(Throwable e) {
			
		}
	}
}
