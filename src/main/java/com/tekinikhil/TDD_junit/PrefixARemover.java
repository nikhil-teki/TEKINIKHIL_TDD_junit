package com.tekinikhil.TDD_junit;

public class PrefixARemover 
{
	public String removePrefixingAs(String inputString)
	{
		String outputString=null;
		if(inputString.length()<2)
		{
			if(inputString.charAt(0)=='A')
				return "";
			return inputString;
		}
		if(inputString.charAt(0)=='A')
		{
			if(inputString.charAt(1)=='A')
				outputString=inputString.substring(2,inputString.length());
			else
				outputString=inputString.substring(1,inputString.length());
		}
		else if(inputString.charAt(1)=='A')
			outputString=inputString.charAt(0)+inputString.substring(2,inputString.length());
		else
			return inputString;
		return outputString;
	}
}
