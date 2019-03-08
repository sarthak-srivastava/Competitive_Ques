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
        int t  = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            int flag = 0;
            int l = s.length();
            int i1 = 0;
            int i2 = l-1;
            
            while(i2>i1 && i1>=0 && i2>=0)
            {   
                // System.out.println(s.charAt(i)+" "+ s.charAt(l-1-i));
                // System.out.println(i1+" "+i2);
                if(s.charAt(i1)!=s.charAt(i2))
                {   
                    System.out.println("NO");
                    flag = 1;
                    break;
                }
                i1++;
                i2--;
            }
            if(flag == 0)
            {
                if(l%2 == 0)
                System.out.println("YES EVEN");
                else
                System.out.println("YES ODD");
            }
            
        }

    }
}
