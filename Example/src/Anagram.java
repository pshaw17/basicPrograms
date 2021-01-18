import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type s1");
		String s1 = sc.nextLine();
		System.out.println("Type s2");
		String s2 = sc.nextLine();
		 System.out.println(anagramCheck( s1,s2));
		
	}
      public static boolean anagramCheck(String s1 , String s2) {
    	  char[] c1 = s1.toCharArray();
    	  char[] c2 = s2.toCharArray();
    	  Arrays.sort(c1);
    	  Arrays.sort(c2);
    	  return Arrays.equals(c1, c2);
      }
      
}
