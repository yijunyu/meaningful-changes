<<<<<< 101 "/* HelloWorld */"

public class HelloWorld {
    static String world = "world";

    <<<<<< 102 "// ending"
    static String hello = "Hello";

    <<<<<< 103 "// beginning"

    public static void main (String args []) {

        System.out.println (hello + ", " + world + "!");
    }

}

>>>>>> 101 "/* HelloWorld */"

public class HelloWorld {
    public static String world = "world";

    >>>>>> 102 "// ending"
    static String hello = "Hello";

    >>>>>> 103 "// beginning"

    public static void main (String args []) {

        System.out.println (hello + ", " + world + "!");
    }

}

