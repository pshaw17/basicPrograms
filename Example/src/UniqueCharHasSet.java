import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharHasSet {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(hashSetUnique(s1));
		
	}
 public static boolean hashSetUnique(String str) {
	 HashSet<Character> hash = new HashSet<Character>();
	 for(int i = 0;i <str.length();i++) {
		 char c = str.charAt(i);
		 if(!hash.add(c)) 
			 return false;
		 }
		 return true;
	 }
		 
 }

