import java.util.TreeSet;

public class createPermutations {

	// We don't need double values...
	static TreeSet<String> result = new TreeSet<String>();
	
	public static void main(String[] args) {
		//String whatToPermute = "00000000000000001111111";
		String whatToPermute = "00011111";
		permutation(whatToPermute);
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) {
	    	if(result.add(prefix)) {
	    		System.out.println(prefix);
	    	}
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
