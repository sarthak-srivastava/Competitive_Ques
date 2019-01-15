import java.util.*;
class subsequence{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        String str = sc.next();
        HashSet<String> h  = new HashSet<String>();
        h.add("");
        arr.add("");
        ssprint(str, arr,"", h);
        System.out.println(arr.size());
        for(int i = 0; i<arr.size();i++)
        System.out.println(arr.get(i));
        
    }
    public static void ssprint(String str, ArrayList<String> arr, String chosen, HashSet<String> h)
    {
        if(str.length() == 0 && !chosen.equals("") && !h.contains(chosen))
        {   h.add(chosen);
            arr.add(chosen);
            return;
        }
        else
        {
            for(int i = 0; i<str.length();i++)
            {
                String wchar = chosen + str.charAt(i);
                ssprint(str.substring(i+1),arr,wchar,h);
                ssprint(str.substring(i+1),arr,chosen,h);
            }
        }
    }
}