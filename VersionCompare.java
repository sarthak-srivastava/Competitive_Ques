public class Solution {
    public int compareVersion(String A, String B) {
        while(A.charAt(0) =='0' && A.length()!=1)
        A = A.substring(1);
        
        while(B.charAt(0) =='0' && B.length()!=1)
        B = B.substring(1);
        String[] Astr = A.split("\\.");
        String[] Bstr = B.split("\\.");
        int len = 0;
        // System.out.println(Astr.length);
        // System.out.println(Bstr.length);
        
        if(Astr.length<Bstr.length)
        len = Astr.length;
        else
        len = Bstr.length;
        for(int i = 0; i<len;i++)
            {   if(Astr[i].length()>Bstr[i].length())
                return 1;
                if(Astr[i].length()<Bstr[i].length())
                return -1;
                if(Long.parseLong(Astr[i])>Long.parseLong(Bstr[i]))
                return 1;
                if(Long.parseLong(Astr[i])<Long.parseLong(Bstr[i]))
                return -1;
            }
            if(Astr.length>Bstr.length)
            {
                for(int i = len;i<Astr.length;i++)
                if(Long.parseLong(Astr[i])!=0)
                return 1;
            }
            if(Bstr.length>Astr.length)
            {
                for(int i = len;i<Bstr.length;i++)
                if(Long.parseLong(Bstr[i])!=0)
                return -1;
            }
            return 0;
     
    }
}
