package main.java.com.arun.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
        List<String> names = new ArrayList<String>();
        names.add("arun");
        names.add("mani");
        names.add("appu");
        names.forEach((name)->{
            System.out.println(name);
        });

    }

    
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
}