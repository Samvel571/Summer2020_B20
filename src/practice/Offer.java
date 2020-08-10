package practice;

public class Offer {

    String location;
    String jobTitle;
    double salary;
    boolean hasBenefit;
    boolean workFrHome;



    public void setInfo(String jobLocation, String title, double jobSalary, boolean benefit, boolean wfh ){
        location = jobLocation;
        jobTitle = title;
        salary = jobSalary;
        hasBenefit = benefit;
        workFrHome = wfh;


    }

    public  void getInfo(){

        System.out.println("Location: "+ location+", Job Title: "+jobTitle+", Salary: "+salary+", Benefit?: "+hasBenefit+", WorkFromHome?: "+workFrHome);
    }

}
