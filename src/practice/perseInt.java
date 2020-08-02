package practice;

public class perseInt {

    //your code here
    public static void main(String[] args) {


    String info = "jon,doe,30";

            String[] arr = info.split(",");

    String first =arr[0];
    String last = arr[1];
    int age = Integer.parseInt(arr[2]);

	System.out.println("person name: "+first+" last name: "+last+" age: "+age);

}//end person

}



