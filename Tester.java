import java.util.HashMap;
public class Tester {
public static void main(String []args) {
	HashMap map=new HashMap();
	map.put(23, "Majestic");
	String s=(String)map.get(23);
	System.out.println(s);
	
}
}
