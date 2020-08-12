package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
	public static void main(String[] args) {


//		//create your method below
//
//	ArrayList < Boolean > list = new ArrayList<>();
//			list.add(true);
//			list.add(false);
//			list.add(false);
//			list.addAll(list);
//			System.out.println(list);
//
//
//
//
//		String str = "NurSes Run";
//
//		str= str.replace(" ","").toLowerCase();
//
//	    String reversed = "";
//
//		 for (int i = str.length()-1;i >= 0;  i--){
//          reversed += str.charAt(i);
//		 }
//
//		 if (str.equals(reversed))
//		System.out.println(true);
//
//
//		 String word1 = "listen";
//		 String word2 ="Silent";
//
//		if(word2.toLowerCase().contains(word1.toLowerCase()) ){
//			System.out.println( true );
//		}
//		System.out.println(false);
//
//
		String word = "yarn";
//		//write your code below


		String result = "";
		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == 97 || word.charAt(i) == 101 || word.charAt(i) == 105 || word.charAt(i) == 111 || word.charAt(i) == 117) {
				result += word.charAt(i);
			}
		}
		//	System.out.println(result);


		//Solution 2

		String[] arrWords = word.split("");
		String[] arrVowels = {"a", "e", "i", "o", "u"};

		ArrayList<String> list = new ArrayList<>(Arrays.asList(arrWords));
		list.retainAll(Arrays.asList(arrVowels));

		String results2 = "";

		for (String each : list) {
			results2 += each;
		}
		System.out.println(results2);


		int countOfCats = 0;
		int countOfDogs = 0;

		String word2 = "dogocat";


		while (word2.contains("cat")) {
			word2 = word2.replaceFirst("cat", "");
			countOfDogs++;
		}


		while (word2.contains("dog")) {
			word2 = word2.replaceFirst("dog", "");
			countOfDogs++;
		}


		System.out.println(countOfDogs);
		System.out.println(countOfCats);

		String[] words = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};
//
//		int k = 1;
//		for (int i = 0; i < arr.length; i += 2) {
//
//			System.out.println(arr[i] + " , " + arr[k]);
//			k += 2;
//		}


		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1));
		}

	}






}


