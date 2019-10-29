{
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

}
/*This is a function problem.You only need to complete the function given below*/
class GfG
 {
	String encode(String str)
	{
          //Your code here
          if(str.length() == 0 || str == null)
          return "";
          StringBuilder ans = new StringBuilder();
          int i = 0;
          char curr_ch = str.charAt(0);
          int c = 0;
          while(i<str.length())
          {
              char ch = str.charAt(i++);
              if(ch == curr_ch)
              {
                  c++;
                  
              }
              else
              {
                  ans.append(curr_ch+Integer.toString(c));
                  c = 1;
                  curr_ch = ch;
              }
              
          }
          ans.append(curr_ch+Integer.toString(c));
          return new String(ans);
	}
	
 }
