/**
   * HelloWorld 
   */
public class HelloWorld {

    <<<<<< 100 "// beginning"

    static private String hello = "Hello";

    private static String world = "world";

    <<<<<< 124 "// ending"

    static public void main (String args []) {

        System.out.println (hello + ", " + world + "!");

    }

}

/* HelloWorld */
public class HelloWorld {

    static String world = "world";

    >>>>>> 124 "// ending"

    static String hello = "Hello";

    >>>>>> 100 "// beginning"

    public static void main (String args []) {

        System.out.println (hello + ", " + world + "!");

    }

}

