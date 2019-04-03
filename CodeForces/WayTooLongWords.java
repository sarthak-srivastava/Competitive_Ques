import java.util.*;
public class WayTooLongWords{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] word = new String[t];
        int i = 0;
        while(t-->0){
        word[i++] = sc.next();}
        for(i = 0; i<word.length;i++){
        if(word[i].length()>10)
        {
            System.out.println(word[i].charAt(0)+Integer.toString(word[i].length()-2)+word[i].charAt(word[i].length()-1));
        }
        else
        {
            System.out.println(word[i]);
        }
    }
    }
}