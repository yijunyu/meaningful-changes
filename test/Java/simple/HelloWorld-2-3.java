<<<<<< 102 "/* HelloWorld */"

public class HelloWorld {
    static String world = "world";

    <<<<<< 100 "// ending static String hello = \"Hello\";"

    <<<<<< 101 "// beginning public static void main (String args []) {System.out.println (hello + \", \" + world + \"!\");}"
}

>>>>>> 102 "/* HelloWorld */"

public class HelloWorld {
    public static String world = "world";

    >>>>>> 100 "// ending static String hello = \"Hello\";"

    >>>>>> 101 "// beginning public static void main (String args []) {System.out.println (hello + \", \" + world + \"!\");}"
}

