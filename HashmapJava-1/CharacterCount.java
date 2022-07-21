import java.util.HashMap;
import java.util.Map;


public class CharacterCount {
	public static void main(String[] args) {
		String A = "He is enjoying his walk across the bank";

		int count ;
		char x;

		Map<Character, Integer> Easy = new HashMap<Character, Integer>();
		for (int i = 0; i < A.length(); i++) {
			x = A.charAt(i);
			if (Easy.containsKey(x)) {
				count = Easy.get(x);
				count++;
				Easy.replace(x, count);
			} else {
				Easy.put(x, 1);
			}
		}
		for (Character key : Easy.keySet()) {
			System.out.println(key + " = " + Easy.get(key));
		}
	}
}
