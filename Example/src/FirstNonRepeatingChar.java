import java.util.*;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		  String str = "aaccddbb"; 
		  HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		  
		  int lengthOfString = str.length();
		  
		  for(int i=0 ;i<lengthOfString ;i++) {              // traverse the string
			  Character currentChar = str.charAt(i);
			if(  hmap.containsKey(currentChar)==false) {     // if map is empty it will put the char with value
				hmap.put(currentChar, 1);
			}else {
				int currentFreq = hmap.get(currentChar);     //  if its already present
				currentFreq++;                               // it will increment it
				hmap.put(currentChar, currentFreq);          // and again put it in map
				
			}
		  }
		  boolean nonRepeating = false;                      //if none of the char is non -repeating
		  for(int i=0 ;i<lengthOfString ;i++) {              // second traverse to check for the key having 
			  Character currentChar = str.charAt(i);         //value 1
			  int currentFreq = hmap.get(currentChar);
			  if(currentFreq == 1) {
				  System.out.println(currentChar);
				  nonRepeating = true;
				  break;
			  }
		  }
		  
		  if (nonRepeating == false) {
			  System.out.println(-1);
		  }
	}

}
