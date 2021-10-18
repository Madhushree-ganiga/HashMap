
import java.util.HashMap;
public class Tester1 {
public static void main(String []args) {
	HashMap map=new HashMap();
	map.put(23, "Majestic");
	map.put("madhu", "ganiga");
	map.put(23, "bnglr");
	System.out.println(map.get("madhu"));
	String s=(String)map.get(23);
	System.out.println(s);
	
}
}
