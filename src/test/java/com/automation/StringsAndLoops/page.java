package com.automation.StringsAndLoops;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class page {
public static void main(String[] args) {
	meth("what banana chair ");
}
	    public static int meth(String s) {
	        int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j++));
	                ans = Math.max(ans, j - i);
	            }
	            else {
	                set.remove(s.charAt(i++));
	            }
	        }
	        System.out.println(ans);
	        return ans;
	    }
	}