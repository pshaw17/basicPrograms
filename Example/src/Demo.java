import java.util.*;
public class Demo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(144);
		values.add(482);
		values.add(271);
		
		Comparator<Integer> com = (o1, o2) ->{
			
			  if(o1%10>o2%10) 
				  return 1; 
			  return -1;
			 
				
			//	return o1%10>o2%10?1:-1; --Ternary operator
	
		};
		Collections.sort(values,com);
		
      for(int i : values) {
    	  System.out.println(i);
      }
	}

}
