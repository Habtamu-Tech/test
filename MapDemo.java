import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm = new HashMap();

hm.put(100, "Abebe");
hm.put(101,  "Bubuchu");
hm.put(102, "Tekesete");
hm.put(103, "Rahel");
hm.put(104,  "Abuye");

System.out.println(hm.get(100));

 //since we cannot iterate on the map, we have to change it into set
Set  s = hm.entrySet();

Iterator itr = s.iterator();

while(itr.hasNext()) {
	Map.Entry me = (Map.Entry) itr.next();
	System.out.println(me.getKey() + " " + me.getValue());
}


 

	}

}
