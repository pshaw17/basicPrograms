import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(isUnique(s1));

	}
public static  boolean isUnique(String str) {
	 if(str.length()>128) {
		 return false;
	 }
	 boolean [] charcheck = new boolean[128];
	 for(int i=0 ; i<str.length();i++) {
		 int val = str.charAt(i);
		 if(charcheck[val]) {
			 return false;
		 }
		 charcheck[val]= true;
	 }
	 return true;
 }
}
