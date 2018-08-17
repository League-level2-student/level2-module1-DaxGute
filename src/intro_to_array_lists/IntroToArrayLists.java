package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList <String> dog = new <String> ArrayList ();
		//2. Add five Strings to your list
		dog.add("fur");
		dog.add("paws");
		dog.add("claws");
		dog.add("face");
		dog.add("cutiness");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < dog.size(); i++) {
			System.out.println(dog.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s: dog) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < dog.size(); i+=2) {
			System.out.println(dog.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = dog.size() - 1; i > 0; i--) {
			System.out.println(dog.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < dog.size(); i++) {
			if(dog.get(i).contains("e"))
			System.out.println(dog.get(i));
		}
	}
}
