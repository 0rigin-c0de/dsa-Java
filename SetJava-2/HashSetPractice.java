import java.util.HashSet;
import java.util.Iterator;

class HashSetPractice {
	public static void main(String[] args) {
		HashSet<String> Car = new HashSet<String>();
		Car.add("Lancer");
		Car.add("Ferrari");
		Car.add("Mahindra Thar");
		Car.add("Jeep compass");
		Car.add("Skoda Rapid");

		Iterator<String> itr = Car.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
