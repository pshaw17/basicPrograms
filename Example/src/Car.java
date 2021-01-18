
public class Car implements Comparable<Car> {
 private String Color;
 private String Brand;
 private int Price;
 private int TankSize;
 

public Car(String color, String brand, int price, int tankSize) {
	super();
	Color = color;
	Brand = brand;
	Price = price;
	TankSize = tankSize;
}

public int getTankSize() {
	return TankSize;
}

public void setTankSize(int tankSize) {
	TankSize = tankSize;
}

public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
 
@Override
public String toString() {
	return "Car [Color=" + Color + ", Brand=" + Brand + ", Price=" + Price + ", TankSize=" + TankSize + "]";
}


  @Override
  public int compareTo(Car c) 
  { if(this.getTankSize()>c.getTankSize())
  { return 1; }
  else return -1; }
 
/*
 * public int compareTo1(Car c2) { if(this.getTankSize()> c2.getTankSize()) {
 * return 1; } else return -1; }
 */
}
