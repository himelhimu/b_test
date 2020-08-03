package com.test;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Listen";
		String s2 = "Silent";
		
		boolean ana = areAnagram(s1.toCharArray(),s2.toCharArray());
		
		if(ana=true) {
			System.out.println("Anagram");

		}else {
			System.out.println("Not Anagram");
		}
				
			
	}
    
    //checking if words are anagram
    
    public static boolean isWordsAnagram(String word1, String word2) {
        boolean isAnagram = false;
        if (word1 != null && word2!= null && word1.length() == word2.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(word2);
            int wordLength = word1.length();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }

    //@Test
    public void test_if_isWordAnagram_works_for_bleat_table(){

        /*
        ‘bleat’ and ‘table’ are
            anagrams but ‘eat’ and ‘tar’ are not.
        
        */

        boolean expected_for_bleat_table=true;

        boolean testBleat= isWordsAnagram("bleat", "table");

        if(expected_for_bleat_table=testBleat){
            System.out.println("Working function");
        }else{
            System.out.println("something wrong with the function");
        }


    }

}
