import java.util.HashMap;

import org.testng.annotations.Test;

public class May8Hashmap {
	
	
  @Test
  public void test1() {
	  
	  HashMap<Integer,String> hm=new hashMap<Integer, String>();
	  hm.put(101, "Mrinal");
	  hm.put(102, "Seeta");
	  hm.put(103, null);
	  hm.put(null, null);
	  hm.put(104, "amita");
	  System.out.println("hashmap:"+hm);
	  hm.put(102, null)
  }
}
