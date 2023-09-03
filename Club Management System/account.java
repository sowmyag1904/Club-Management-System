import java.io.*;
import java.util.Scanner;

public class account {
    public static int validate(String name, String password) {
        try {
            Scanner sc = new Scanner(new File("assets\\username_pwd_stu.csv"));
            while (sc.hasNextLine()) // returns a boolean value
            {
                String[] line = sc.nextLine().split(",");
                if (name.equals(line[0]) && password.equals(line[1])) { 
                    sc.close();
                    return 2;
                }
            }
            sc.close();
            sc = new Scanner(new File("assets\\username_pwd_ad.csv"));
            while (sc.hasNextLine()) // returns a boolean value
            {
                String[] line = sc.nextLine().split(",");
                if (name.equals(line[0]) && password.equals(line[1])) {
                    sc.close();
                    return 1;
                }
            }

        } catch (Exception e) {
            System.out.println("File not found!");
        }
        return 0;
    }
}
