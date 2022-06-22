package BankCLasses;

import java.util.Scanner;

public class Account {
    String name;
    //      String dob;
    String nic;
    String phoneNo;
    String email;
    String password;
    boolean flag;

    Scanner input = new Scanner(System.in);


    public void setName() {
        flag = true;
        while (flag) {
            flag = false;
            System.out.print("Enter your name: ");
            name = input.nextLine();
            char[] ch = name.toCharArray();
            for (char c : ch) {
                if ((c >= 'A' && c <= 'Z') && (c >= 'a' && c <= 'z') && (c == 32)) {

                } else {
                    System.out.println("Invalid Input");
                    flag = true;
                    break;
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setNic() {
        flag = true;
        while (flag) {
            flag = false;
            System.out.print("Enter nic number: ");
            this.nic = input.nextLine();

            if (nic.length() < 13) {
                System.out.println("Invalid! nic's length must be 13 letters");
                flag = true;
            }
            char[] ch = nic.toCharArray();
            for (char c : ch) {
                if ((c >= '0' && c <= '9')) {

                } else {
                    System.out.println("Invalid Input");
                    flag = true;
                    break;
                }
            }
        }
    }

    public String getNic() {
        return nic;
    }

    public void setPhoneNo() {
        flag = true;
        while (flag) {
            flag = false;
            System.out.print("Enter Phone number: ");
            this.phoneNo = input.nextLine();
            char[] ch = phoneNo.toCharArray();
            for (char c : ch) {
                if ((c >= '0' && c <= '9') && (c == '-')) {

                } else {
                    System.out.println("Invalid! Phone number must have just numbers");
                    flag = true;
                    break;
                }
            }
        }
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setEmail() {
        flag = true;
        while (true) {
            flag = false;
            System.out.print("Enter email address: ");
            this.email = input.nextLine();
            if (!(emailVerify())) {
                System.out.println("Invalid email!");
                flag = true;
            } else {
//                System.out.println("Perfect email");
                break;
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean emailVerify() {
        String pattern = "@email.com";
        char[] ch = email.toCharArray();
        char[] chpat = pattern.toCharArray();
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0; i < email.length(); i++) {
            if (ch[i] == '@') {
                flag1 = true;
                for (int j = 0; j < pattern.length(); j++) {
                    if (chpat[j] != ch[i]) {
                        flag1 = false;
                        flag2 = true;
                        break;
                    }
                    i++;
                }
            } else {
                flag1 = false;
            }
            if (flag2) {
                break;
            }
        }
        if (flag1) {
            return true;
        } else {
            return false;
        }
    }

    public void setPassword() {
        flag = true;
        while (flag) {
            flag = false;
            System.out.println("\nPassword must be greater than 7 and less than to 20 characters\nPassword must include lower & upper case letters\nPassword must contain digits\nPassword must contain special characters\n");
            System.out.print("Enter password: ");
            this.password = input.nextLine();
            if (!(verifyPassword())) {
                System.out.println("Password is not strong enough");
                flag = true;
            } else {
                System.out.println("Perfect password");
                break;
            }
        }
    }

    public String getPassword() {
        return password;
    }

    boolean verifyPassword() {
        int i = 0;
        boolean L = false, a = false, A = false, D = false, S = false;
        char[] ch = password.toCharArray();
        for (i = 0; i<password.length(); i++)
        {
            if (password.length() > 7 && password.length() < 20)
            {
                L = true;
            }
            if (ch[i] >= 'a' && ch[i] <= 'z')
            {
                a = true;
            }
            if (ch[i] >= 'A' && ch[i] <= 'Z')
            {
                A = true;
            }
            if (ch[i] >= '0' && ch[i] <= '9')
            {
                D = true;
            }
            if ((ch[i] >= '!' && ch[i] <= '/') || (ch[i] >= ':' && ch[i] <= '@') ||
                    (ch[i] >= '[' && ch[i] <= '`') || (ch[i] >= '!' && ch[i] <= '/') ||
                    (ch[i] >= '{' && ch[i] <= '_'))
            {
                S = true;
            }
        }

        if (L == true && a == true && A == true && D == true && S == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
