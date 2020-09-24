package InterviewQuestions;

public class FrequencyOfCharactersInString {

    /*
    Write a return method that can find the frequency of characters

    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public  static  String  FrequencyOfChars(String str) {

        String expectedResult = "";

        for( int j=0; j < str.length(); j++) {
            int count = 0;


            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == str.charAt(j)) {

                    count++;

                }

            }

            expectedResult +=str.charAt(j)+"" + count;

          str = str.replace(""+str.charAt(j) ,  "" );

        }

        return expectedResult;

    }




//    public static String FrequencyOfChars(String str){
//
//     String results ="";
//
//        for (int i = 0; i < str.length(); i++){
//
//         int count = 0;
//
//         for (int j = 0; j < str.length(); j++){
//             if (str.charAt(i)==str.charAt(j)){
//                 count ++;
//
//
//             }
//         }
//            results += str.charAt(i)+""+count;
//          str = str.replace(""+str.charAt(i) ,  "" );
//        }
//return results;
 //   }

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));
    }



}
