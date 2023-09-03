package StudentLogin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class registration {
    public static int status(int club, String name) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("assets\\stud_details.csv"));
        while (sc.hasNextLine()) // returns a boolean value
        {
            String[] line = sc.nextLine().split(",");
            if (name.equals(line[0])) {
                if (line[club + 1].equals(" Yes")) {
                    sc.close();
                    return 1;
                }
                sc.close();
                return 0;
            }
        }
        sc.close();
        return -1;
    }

    public static void unregister(int club, String name) throws IOException {
        Scanner sc = new Scanner(new File("assets\\stud_details.csv"));
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNextLine()) {
            String line1 = sc.nextLine();
            String[] line = line1.split(",");
            if (name.equals(line[0])) {
                String newline = line[0] + "," + line[1] + ",";
                for (int i = 2; i <= 9; i++) {
                    if (i == club+1) {
                        newline += " No" + ",";
                        continue;
                    }
                    if(i!=9)
                        newline += line[i + 1] + ",";
                    else
                        newline += line[i + 1];
                }
                buffer.append(newline + System.lineSeparator());
                continue;
            }
            buffer.append(line1 + System.lineSeparator());
        }
        String fileContents = buffer.toString();
        sc.close();
        try (
                FileWriter writer = new FileWriter("assets\\stud_details.csv")) {
            writer.append(fileContents);
            writer.flush();
        }

    }

    public static void register(int club, String name) throws IOException {
        Scanner sc = new Scanner(new File("assets\\stud_details.csv"));
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNextLine()) {
            String line1 = sc.nextLine();
            String[] line = line1.split(",");
            if (name.equals(line[0])) {
                String newline = line[0] + "," + line[1] + ",";
                for (int i = 2; i <= 9; i++) {
                    if (i == club+1) {
                        newline += " Yes" + ",";
                        continue;
                    }
                    if(i!=9)
                        newline += line[i + 1] + ",";
                    else
                        newline += line[i + 1];
                }
                buffer.append(newline + System.lineSeparator());
                continue;
            }
            buffer.append(line1 + System.lineSeparator());
        }
        String fileContents = buffer.toString();
        sc.close();
        try (
                FileWriter writer = new FileWriter("assets\\stud_details.csv")) {
            writer.append(fileContents);
            writer.flush();
        }

    }
}
