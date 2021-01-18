import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException {

	public static void main(String[] args)  {
		int i, j=1,k=0;
		 BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		 i=8;
		 try {
			 j=Integer.parseInt(br.readLine());
			 k=i/j;
			 System.out.println(k);
		 }
		 catch(IOException e) {
			 System.out.println("Some IO error");
		 }
			
			  catch(ArithmeticException e) {
				  System.out.println("Arithmetic Exception"); 
				  }
			 
	}

}
