/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
    Scanner sc = new Scanner(System.in);
    HashSet<Character> hs = new HashSet<Character>();
    hs.add('a');
    hs.add('e');
    hs.add('i');
    hs.add('o');
    hs.add('u');
    String s = sc.next();
    int global_max = 0;
    int curr_max = 0;
    for(int i = 0;i<s.length();i++)
    {
        if(hs.contains(s.charAt(i)))
        {
            curr_max++;
        }
        else
        curr_max = 0;
        if(curr_max>global_max)
        global_max = curr_max;
        
    }
    System.out.println(global_max);
    }
}
