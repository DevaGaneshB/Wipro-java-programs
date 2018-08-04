
public class lexicographical {
		public static void main(String[] args) {
	        String[] wo = { "abc", "C", "a", "acd" };
	        int n=wo.length;
	        for(int i = 0; i <n-1; ++i) {
	            for (int j = i + 1; j <n; ++j) {
	                if (wo[i].compareTo(wo[j]) > 0) {

	                    String temp = wo[i];
	                    wo[i] = wo[j];
	                    wo[j] = temp;
	                }
	            }
	        }

	        System.out.println("In lexicographical order:");
	        for(int i = 0; i < 4; i++) {
	            System.out.println(wo[i]);
	        }
	    }

	
}
