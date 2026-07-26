import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {
    private static Singleton instance;
    public String str;

    private Singleton() {}

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        Singleton singleton = Singleton.getSingleInstance();
        singleton.str = input;
        
        System.out.println("Hello I am a singleton! Let me say " + singleton.str + " to you");
    }
}