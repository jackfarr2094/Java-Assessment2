package com.qa.javaAssessment;

import java.io.SequenceInputStream;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurrences of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		  int ind = str.indexOf("bert");
		    int laind = str.lastIndexOf("bert");
		    if((laind != -1 ) && (ind!=laind))
		        return (str.substring(ind+5,laind)) ;
	    return new String(in);
	}
		


	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {

	    int large = Math.max(a, Math.max(b, c));
	    int small = Math.min(a, Math.min(b, c));
	    int medium = (a + b + c) - (large + small);

	    return ((large - medium) == (medium - small));	
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		//check string length if string is odd
		if(input.length() % 2 != 0) {
			if(input.length() > a ) {
				// finds the position to remove the characters from
				int n = (input.length() - a) / 2;
				// for loop print the 1st n characters
				for (int i = 0; i < n; i++)
					System.out.print(input.charAt(i));
				//print the last n characters
				for (int i = n + a; i < input.length(); i++)
					System.out.print(input.charAt(i));
			}
		}
		return input;
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

		public int superBlock(String str) {
		    if(str.length() == 0)
		        return 0;
		          
		    int largest = 0;
		    int current = 1;
		                
		    for(int i = 1; i < str.length(); i++) {
		        if(str.charAt(i) != str.charAt(i-1)) {
		            if(current > largest)
		                largest = current;
		            current = 1;
		        } else {
		            current++;
		        }
		    }
		                                                            
		    return Math.max(largest, current);

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		int count;
		int index;
		
		def count_am, = (str);
		    x=["am" for i in str.lower()];
		    count = 0;
		    index = 0;
		    for i in x;
		        if i in str[index:];
		            index = str.find(i)+1;
		            count+=1;
		    return count;
	}		

	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int number) {
		  if (number % 3 == 0) {
	            if (number % 5 == 0) {
	                return "fizzbuzz";
	            } else {
	                return "fizz";
	            }
	        } else if (number % 5 == 0) {
	            return "buzz";
	        }
	        return String.valueOf(number);		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		int number;
		while (number > 0) {
		    System.out.println( number % 10);
		    number = number / 10;
		}
		   int num = 321;
	        int sum = 0;
	        while (num > 0) {
	            sum = sum + num % 10;
	            num = num / 10;
	        }
	    	int num1 = 14;
			int num2 = 11;
			int num3 = 15;
	 
			System.out.println("The largest number of the sequence is " + Math.max(num1,num2));
			System.out.println("The largest number of the sequence is " + Math.min(num1,num2));
	        
		return -1;
		}
	}
