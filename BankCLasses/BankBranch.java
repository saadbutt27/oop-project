package BankCLasses;

public class BankBranch {
    static String name;
    static String city;
    static String phoneNo;

    public BankBranch() {
        name = "The National Bank";
        city = "Karachi";
        phoneNo = "021-35698789";
    }

    public void display () {
        System.out.println("******************");
        System.out.println(name);
        System.out.println(city);
        System.out.println(phoneNo);
        System.out.println("******************");
    }
}
