import util.java.scanner;
public class StringBufferExample{
public static void main(String []args){
 	String str=new String("");
	Scanner scObj=new Scanner(System.in);
	System.out.in("Enter the string");
	str= scObj.next();
	StringBuffer str= new StringBuffer(str);
	string str1=strBuff.reverse().toString();
		if(str.equals(str1))
		System.out.println("pallindrome");
		else
		System.out.println(" not pallindrome");
		
}
}