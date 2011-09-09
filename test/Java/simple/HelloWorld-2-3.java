<<<<<< 102 "/* HelloWorld */"

public class HelloWorld {

    static String world = "world";

    <<<<<< 115 "// ending"

    <<<<<< 100 "static String hello = \"Hello\"; // beginning"

    <<<<<< 101 "public static void main (String args []) {System.out.println (hello + \", \" + world + \"!\");}"
}

>>>>>> 102 "/* HelloWorld */"

public class HelloWorld {

    public static String world = "world";

    >>>>>> 115 "// ending"

    >>>>>> 100 "static String hello = \"Hello\"; // beginning"

    >>>>>> 101 "public static void main (String args []) {System.out.println (hello + \", \" + world + \"!\");}"
}

