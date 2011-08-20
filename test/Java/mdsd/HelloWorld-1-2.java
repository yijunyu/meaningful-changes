/**
   * HelloWorld 
   */
public class HelloWorld {

    <<<<<< 101 "// beginning"
    private static String hello = "Hello";
    private static String world = "world";

    <<<<<< 102 "// ending"

    public static void main (String args []) {

        System.out.println (hello + ", " + world + "!");
    }

}

/* HelloWorld */
public class HelloWorld {
    static String world = "world";

    >>>>>> 102 "// ending"
    static String hello = "Hello";

    >>>>>> 101 "// beginning"

    public static void main (String args []) {

        System.out.println (hello + ", " + world + "!");
    }

}

