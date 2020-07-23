package tdd;

public class DeleteA {
	public static String del(String given )
	{
		int len=given.length();
		String result="";
		if(len>=1)
		{
			if(given.charAt(0)!='A')
				result=given;
			if(given.charAt(0)=='A') {
				if(len>2)
					result=given.substring(1);
			}
			if(len>=2&&given.charAt(0)=='A'&& given.charAt(1)=='A')
				result=given.substring(2);
			if(given.charAt(0)!='A'&&given.charAt(1)=='A')
				result=given.substring(0,1)+given.substring(2);
				
		}
		return result;
	}
}
