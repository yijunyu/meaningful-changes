/**
   * HelloWorld 
   */
public class HelloWorld {

    <<<<<< "// beginning"
    static private String hello =
    "Hello";
    private static String world =
    "world";

    <<<<<< "// ending"

    static public void main (String args []) {

        System.out.println (
        hello + ", " + world + "!");
    }

}

/* HelloWorld */
public class HelloWorld {
    static String world =
    "world";

    >>>>>> "// ending"
    static String hello =
    "Hello";

    >>>>>> "// beginning"

    public static void main (String args []) {

        System.out.println (
        hello + ", " + world + "!");
    }

}

