package com;

public class StringJava {

    public void arrayString()   //CreatingString
{
	String Alpha="java";//creating string by Java string literal    
    char ch[]={'s','t','r','i','n','g','s'};    
    String Beta=new String(ch);//converting char array to string    
    String Gamma=new String("example");//creating Java string by new keyword    
    System.out.println(Alpha);    
    System.out.println(Beta);    
    System.out.println(Gamma);    
}

 
    public void stringCompare()                 //StringComparison
{

      String sum1="hello";  
      String sum2="hello";  
      String sum3="meklo";  
      String sum4="hemlo";  
      String sum5="flag";  
      System.out.println(sum1.compareTo(sum2));   //0 because both are equal  
      System.out.println(sum1.compareTo(sum3));   //-5 because "h" is 5 times lower than "m"  
      System.out.println(sum1.compareTo(sum4));   //-1 because "l" is 1 times lower than "m"  
      System.out.println(sum1.compareTo(sum5));   //2 because "h" is 2 times greater than "f"  
}



    public void stringByChar() {                   //FetchingStringByCharacter
	    String str = "Welcome to Javatpoint portal";      
        int strLength = str.length();      
        // Fetching first character  
         System.out.println("Character at 0 index is: "+ str.charAt(0));      
        // The last Character is present at the string length -1 index  
         System.out.println("Character at last index is: "+ str.charAt(strLength-1));      
    }  

    
    
    public String getFullName(String strFirstName, String strLastName) {          //ConcatFullName
    	String strFullName = strFirstName+" ".concat(strLastName);
    	//strFirstName+" "+strLastName;
    	
    	return strFullName;
    }
    


   public String getCompanyName(String strCompanyName ) {        //PrintCompanyName
	   return strCompanyName;
   }


   

   
   public void stringContains()       //search the sequence of characters in this string
   {
	   String strName = "Software testing is the process of finding errors in the developed product";
	   System.out.println(strName.contains("is the process"));
	   System.out.println(strName.contains("developed product"));
	   System.out.println(strName.contains("Software development"));
   }
   
   
   public void endString()         //SearchIfStringEndsWith.com
   {
	   String strcome = "Welcome to MakeMyTrip.com";
	   if(strcome.endsWith(".com")) {
		   System.out.println("String ends with .com");
	   } else
	   {
		   System.out.println("It does not ends with .com");
	   }
   }



  public String verifyWordInCompany(String strCompanyName) {     
	  String strArray[] = strCompanyName.split(" ");
	  for(String string : strArray) {
		  if(string.equals("Technologies")) {
			  break;
		  }
	  }
	   return strCompanyName;
		  }





  public void split() {                             //SplitMethod
	  String sum="java string split method";  
	  String[] words=sum.split("\\s");//splits the string based on whitespace  
	  //using java foreach loop to print elements of string array  
	  for(String wait:words){  
	  System.out.println(wait);  
	  }  
	  }
  
  
  
  public void splitAll() {                          //SplitFunction
  String num="welcome to split world";  
  System.out.println("returning words:");  
  for(String word:num.split("\\s",0)){  
  System.out.println(word);  
  }  
  System.out.println("returning words:");  
  for(String word:num.split("\\s",1)){  
  System.out.println(word);  
  }  
  System.out.println("returning words:");  
  for(String word:num.split("\\s",2)){  
  System.out.println(word);  
  }  
    
  }



  
  
  public void replace()                            //replace
  {
	  String str = "kkkkkkk-hhhh-kkkkkk";  
      String few = str.replace("h","s"); // Replace 'h' with 's'  
      System.out.println(few);  
      few = few.replace("s","h"); // Replace 's' with 'h'  
      System.out.println(few);  
  }  

  
  
  public void replaceAll()  {                       //replaceAll
	  String few="javatpoint is a very good website";  
	  String replaceString=few.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
	  System.out.println(replaceString);  
	  }
  
  
  
  public void addingSpace()  {                 //AddingSpace
	  String str = "JavaTpoint";  
	  System.out.println(str);  
	    
	  String regex = "";  
	  // adding a white space before and after every character of the input string.  
	  str = str.replaceAll(regex, " ");  
	    
	  System.out.println(str);  
	    
	  }  
	  
  
  
  public void substring() {                       //SubString
	  String str[] =  
		  {  
		  "Praveen Kumar",  
		  "Yuvraj Singh",  
		  "Harbhajan Singh",  
		  "Gurjit Singh",  
		  "Virat Kohli",  
		  "Rohit Sharma",  
		  "Sandeep Singh",  
		  "Milkha Singh"  
		  };  
		    
		  String surName = "Singh";  
		  int surNameSize = surName.length();  
		    
		  int size = str.length;  
		    
		  for(int intnew = 0; intnew < size; intnew++)  
		  {  
		      int length = str[intnew].length();  
		      // extracting the surname  
		      String subStr = str[intnew].substring(length - surNameSize);  
		        
		      // checks whether the surname is equal to "Singh" or not  
		      if(subStr.equals(surName))  
		      {  
		          System.out.println(str[intnew]);  
		      }  
		  }
  }
		  
		    
   
    public void join()  {                                //Join
    	String date = String.join("/","25","06","2018");    
        System.out.print(date);    
        String time = String.join(":", "12","10","10");  
        System.out.println(" "+time);  
    }  
}  

  