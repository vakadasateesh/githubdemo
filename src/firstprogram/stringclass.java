package firstprogram;

public class stringclass {

	public static void main(String[] args) {
	
	String myvalue = "mindq";
	System.out.println(myvalue);	
		
	//length()
	 
	String str = "mindqsystems";
	System.out.println(str.length());
	
	//char At()
	
	String strr = "mindqsystems";
	//to read "M"
	
	System.out.println(str.charAt(0));
	
	//to read the last character
	
	System.out.println(str.charAt(11));
	System.out.println(str.charAt(str.length()-1));
	
	//index of()

	 String stri = "mindqsystems";
		System.out.println(str.indexOf("m"));

	
	//to find index of "s"
		
	System.out.println(str.indexOf("s"));
		
	//to find 2nd occurence of "s"
		
	System.out.println(str.indexOf("s",6));	
	System.out.println(str.indexOf("s",str.indexOf("s")+1));
	
	// to lowercase()
	
	String str1  = "Mindq";
	System.out.println(str1.toLowerCase());
	
	String str2 = "mindq";
	System.out.println(str2.toLowerCase());
	
	// to uppercase()
	
	String str3 = "mindq";
	System.out.println(str3.toUpperCase());
	
	String str4 = "Mindq";
	System.out.println(str4.toUpperCase());
	
	// equals()
	
	String str5 = "Mindq";
	System.out.println(str5.equals("Mindq"));
	System.out.println(str5.equals("mindq"));
	
	// equals ignore case()
	
	String str6 = "Mindq";
	System.out.println(str6.equalsIgnoreCase ("Mindq"));
	System.out.println(str6.equalsIgnoreCase("mindq"));
	
	// starts with()
	
	String str7 = "Mindqsystems";
	System.out.println(str7.startsWith("Mindq"));
	System.out.println(str7.startsWith("mindq"));
	System.out.println(str7.startsWith("systems"));
	
	// ends with()
	
	String str8 = "Mindqsystems";
	System.out.println(str8.endsWith("systems"));
	System.out.println(str8.endsWith("Systems"));
	System.out.println(str8.endsWith("Mindq"));
	
	// contains()
	
	String str9 = "Mindqsystems";
	System.out.println(str9.contains("Mindq"));
	System.out.println(str9.contains("systems"));
	System.out.println(str9.contains("sys"));
	System.out.println(str9.contains("Mq"));
	System.out.println(str9.contains("mindq"));
	
	// is empty()
	
	String stra = "Mindq";
	System.out.println(stra.isEmpty());
	
	String strb = "";
	System.out.println(strb.isEmpty());
	
	// concat()
	
	String strc = "Mindq";
	System.out.println(strc.concat("systems"));
	
	// Mindq250
	
	System.out.println(strc+250);
	
	// tirm()
	
	String strd = " Mindq ";
	System.out.println(strd.length());
	System.out.println(strd.trim().length());
	
	// replace()
	
	String stre = "Mindqsystems";
	// to replace "s" with "@"
	
	System.out.println(stre.replace("s","@"));
	
	// write program to get "srnagar"from"srnagar
	
	String strf = "Sr Nagar";
	System.out.println(strf.trim());
	System.out.println(strf.replace(" ",""));
	
	// substring()
	
	String strg = "Mindqsystems";
	
	// to read "Mindq"
	System.out.println(strg.substring(5));
	System.out.println(strg.substring(0,4));
	System.out.println(strg.substring(0,5));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
