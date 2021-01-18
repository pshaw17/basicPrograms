import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Car> car = new ArrayList<>();
		car.add(new Car("Red","Swift",156,3));
		car.add(new Car("Green","Hyundai",358,5));
		car.add(new Car("Blue","Honda",205,1));
		car.add(new Car("Black","Fortuner",499,4));
		
		
		  Comparator<Car> price = (Car o1, Car o2) ->{
			  if(o1.getPrice()> o2.getPrice()) 
		  return 1;
		 
			  return -1; 
		  
		  };
		  
		  Comparator<Car> tankSize = (Car o1, Car o2) ->{
			  if(o1.getTankSize()> o2.getTankSize()) 
		  return 1;
	
			  return -1; 
		  
		  };
		  
		 
		  Comparator<Car> color = (Car o1, Car o2) ->{
			  return (o1.getColor().compareTo(o2.getColor()));
		   
		  };

  System.out.println("sorted by comparable");	
  Collections.sort(car);
   for(Car c1 : car) {
	 System.out.println(c1);
 }
   System.out.println("please select the option"
   		+ "\n 1.sortBy Price \n 2.sortBy TankSize \n 3.SortBy color \n 4.exit");
   int i = sc.nextInt();
   while(i<4) {

   switch (i) {
   case 1: Collections.sort(car, price);
   System.out.println("sorted by price");
   break;
   case 2:  Collections.sort(car, tankSize);
   System.out.println("sorted by tankSize");
   break;
   case 3: Collections.sort(car, color);
   System.out.println("sorted by color");
   break;
   default: Collections.sort(car);
   System.out.println("sorted by comparable");
   }
   
   for(Car c1 : car) {
	 System.out.println(c1);
   }
   i= sc.nextInt();
 }
   
}

}
