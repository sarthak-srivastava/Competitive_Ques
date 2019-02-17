class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<String>();
        for(int i = 1;i<=n;i++)
        {String t = "";
            if(i%3==0 || i%5==0)
            {if(i%3 == 0)
                t = t+"Fizz";
            if(i%5 == 0)
                t = t+"Buzz";
            }
         else
             t +=Integer.toString(i);
         l.add(t);
         
        }
        return l;
    }
}
