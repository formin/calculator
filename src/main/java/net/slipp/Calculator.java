package net.slipp;

public class Calculator {

	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}
  

	public int calculator(String s) {
		// TODO Auto-generated method stub
		if (s.isEmpty()) { 
			return 0;
		}
		
		String[] numbers = split(s);
		
		int result = cal(numbers);
		
		return result;
		
	}

	public String[] split(String s)
	{
		String[] numbers = s.split(",|\n|//");
		return numbers;
	}
	
	public int cal(String[] numbers){

		int s = 0;
		
		for(int i=0;i<numbers.length;i++)
		{
			s += Integer.parseInt(numbers[i]);
		}
		
		return s;
		
	}
	
}
