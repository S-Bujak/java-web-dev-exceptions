package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        //divide(10,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        checkFileExtension(studentFiles.get("Carl"));
    }

    public static void divide(int x, int y)
    {

        // Write code here!
        if (y == 0) {

            try {
                throw new ArithmeticException ("You can't divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(String.format("THe quotient of %s divided by %s is: %s", x, y, x/y));
        }
    }

    public static int checkFileExtension(String fileName)
    {
        int result = 0;
        // If file name ends in .java give 1 pt
        // if not give 0 pt
        // if null give -1 pt
        if(fileName == null) {
            try {
                throw new NullPointerException("File cannot be null");
            } catch (NullPointerException error) {
                result = -1;
                return result;
            }
        } else if (fileName.endsWith(".java")) {
            result = 1;
            return result;
        }
        return result;
    }

}
