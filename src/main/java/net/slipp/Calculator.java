package net.slipp;

import java.util.regex.Pattern;

public class Calculator {

	public int add(int i, int j) {
		 
		return i+j;
	}

	public int subtract(int i, int j) {
		 
		return i-j;
	}
  

	public int calculator(String s) {
		 
		if (s.isEmpty()) { 
			return 0;
		}
		
		String[] numbers = split(s);
		
		int result = cal(numbers);
		
		return result;
		
	}

	public String[] split(String s)
	{
		String[] numbers;
		
		java.util.regex.Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
		m.find();

		numbers = s.split(",|\n");
		
		if(m.matches()){
		 String customDelimeter = m.group(1);
		 numbers = m.group(2).split(customDelimeter);
		}
		 
		return numbers;
	}
	
	public int cal(String[] numbers){

		int s = 0;
		int chk = 0;
		
		for(int i=0;i<numbers.length;i++)
		{
			
			chk = Integer.parseInt(numbers[i]);
			
			if(chk<0)
			{
				throw new RuntimeException();
			}
			s += chk;
			
		}
		
		return s;
		
	}
	
}
