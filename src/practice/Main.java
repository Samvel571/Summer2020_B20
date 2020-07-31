package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
	public static void main(String[] args) {


		//create your method below

	ArrayList < Boolean > list = new ArrayList<>();
			list.add(true);
			list.add(false);
			list.add(false);
			list.addAll(list);
			System.out.println(list);




		String str = "NurSes Run";

		str= str.replace(" ","").toLowerCase();

	    String reversed = "";

		 for (int i = str.length()-1;i >= 0;  i--){
          reversed += str.charAt(i);
		 }

		 if (str.equals(reversed))
		System.out.println(true);


		 String word1 = "listen";
		 String word2 ="Silent";

		if(word2.toLowerCase().contains(word1.toLowerCase()) ){
			System.out.println( true );
		}
		System.out.println(false);
	}
}

