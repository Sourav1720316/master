package PracticeTestNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import PageObjects.Child;
import PageObjects.parent;

public class practice {

	
	public static void main(String[] args) {
		
//			//Anagrams
//		String s1="Army";
//		String s2="mRay";
//		char[] ch1=s1.toLowerCase().toCharArray();
//		char[] ch2=s2.toLowerCase().toCharArray();
//		System.out.println("Is it a anagram : "+ isAnagram(ch1,ch2));
		
		String num = "10,20,30,40";
		String[] split =num.split(",");
		String anyNum = split[2];
		System.out.println(anyNum);
		
		

}
	
//	
//	public static boolean isAnagram(char[] str1, char[] str2) {
//		
//		boolean flag = false;
//		Arrays.sort(str1);
//		Arrays.sort(str2);
//		if(str1.length==str2.length && Arrays.equals(str1, str2)){
//			flag=true;
//		}
//		else {
//			flag=false;
//		}
//		return flag;
//	}
	
}
