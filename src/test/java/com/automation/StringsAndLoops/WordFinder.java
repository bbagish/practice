package com.automation.StringsAndLoops;

public class WordFinder {
public static void main(String[] args) {
	String[] nameArray={"John smith", "dave job", "Sen Peterson", "word", "Bush Something"};
	String target="word";
	int [] intArr={1,2,3,4,5};
	String[] strArr={"a", "b", "c", "d"};
	for(int i : intArr){
		System.out.println("iteration number: "+i);
		for(String item : strArr){
			System.out.print(item);
		}
		System.out.println();
		
	}
	
	
	
//	valueExist(nameArray, target);
//	for (String item: nameArray){
//		
//		System.out.println("comparing "+item+" to "+target);
//		
//		if(item.equals(target)){
//			System.out.println("Obama Found");
//			break;
//		}
//	}
//}
//	public static boolean valueExist(String[] strArr, String strValue){
//	
//		boolean result=false; //becuase initially it's false, it did'nt find anything yet
//		
//		for (String item: strArr){
//			
//			System.out.println("comparing "+item+" to "+strValue);
//			
//			if(item.equals(strValue)){
//				System.out.println("Obama Found");
//				result=true;
//				//break;
//			}else{
//				result= false;
//
//			}
//		}
//		
//				return result;
	}	
}