package practice;

public class prctce {


    public static void main(String[] args) {
        String word = "poopoo what idk what im doing";
        word.toLowerCase();

        for (int i = 0; i <word.length(); i ++){

            if ( (word.charAt(i)+"").contains("a") || (word.charAt(i)+"").contains("e") || (word.charAt(i)+"").contains("i")
                    ||(word.charAt(i)+"").contains("o") || (word.charAt(i)+"").contains("u")  ){
                System.out.print(word.charAt(i));
            }
        }
    }
}
