package eighth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Multion {
   private static List<Multion> multions = new ArrayList<Multion>(2) {{
	   add(null);
	   add(null);
   }};
   
   private void multion() {}
   
   public static Multion getMultion() {
	   for (int i = 0; i < 2; i++) {
			if (multions.get(i)==null) {
				multions.set(i, new Multion());
				break;
			}
		}
	   Random ra =new Random();
	   int a = ra.nextInt(2);
	   if (multions.get(a)==null) {
		return multions.get(0);
	}else {
		return multions.get(a);
	}
   }
   

}