package strings;

public class StringCharExitOrNot {
	public static void main(String[] args)
	{
		String str = "Am cool to do this 22";
		char key = 'o';
		//char key = 'r';
		boolean flag = false;
		
		for(int i = 0; i <str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(c == key)
			{
				flag = true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println(key + " Char is there");
			System.out.println(str.indexOf(key));
		}
		else
		{
			System.out.println(key + " Char is Not There");
		}
	}

}
