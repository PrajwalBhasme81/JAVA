public class Navayuga{
	public static final double gst = 0.03;
public static void ordered(){
String ordered ="BIRIYANI";
System.out.println("FOOD ORDERED :"+ordered);
}
public static void type(){
String type ="HYDRABADI BIRIYANI";
System.out.println("BIRIYANI TYPE :"+type);
}
public static void biriyaniPrice(){
int biriyaniPrice =600;
System.out.println("BIRIYANi PRICE :"+biriyaniPrice);

}
public static void getGst(int price){
double getGst =price*Navayuga.gst;
System.out.println("PLUS GST 3% :"+getGst);

}
public static void totalPrice(int price){
double totalPrice =price+(price*Navayuga.gst);
System.out.println("TOTAL PRICE INCLUDING GST :"+totalPrice);
}
}