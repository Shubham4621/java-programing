//string methods
// import java.util.*;
// public class str{
// 	public static void main(String args[]){
// 		String s1 = "wel";
// 		String s2 = "come";
// 		System.out.println(s1.concat(s2));
// 		System.out.println(s1.contentEquals("wel"));
// 		System.out.println(s2.contentEquals("e"));
// 		System.out.println(s1.contains("el"));
// 		System.out.println(s1.endsWith("llo"));
// 		System.out.println(s2.startsWith("co"));
// 		System.out.println(s1.equals(s2));
// 		System.out.println(s1.length());
// 		System.out.println(s1.replace("e","a"));
// 		String myStr = "Hello, World!";
// 		System.out.println(myStr.substring(7,12));
// 		System.out.println(s1.toUpperCase());
// 		System.out.println(s1.toLowerCase());
// 		System.out.println(s1.isEmpty());
// 		String str1 = "I";
// 		String str2 = "Love";
// 		String str3 = "Java";
// 		String joinedStr = String.join("#", str1 ,str2);
// 		System.out.println(joinedStr);
// 		String str4 = "    Learn Java Programming      ";
// 		System.out.println(str4.trim());


// }
// }

//MathOperation
public class MathOperation{
	public static void main(String[] args){
		double a = 25;
		double b = 3;
		System.out.println("Square root of a:" + Math.sqrt(a));
		System.out.println("a raised to the power b" + Math.pow(a,b));
		System.out.println("Maximum of " + a + "and "+ b +":"+  Math.max(a,b));
		System.out.println("Minimum of " + a + "and "+ b +":"+  Math.min(a,b));
		System.out.println("Random number between 0 and 1:" + Math.random());
		System.out.println("Ceil of 4.3:" + Math.ceil(4.3));
		System.out.println("Floor of 4.7" + Math.floor(4.7));
		System.out.println("Absolute value of -9:" + Math.abs(-9));
}
}
