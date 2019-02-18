class Solution {
    static int c = 0;
    HashSet<ArrayList<Integer>> hs;
    public int numSquarefulPerms(int[] A) {
         c = 0;
        hs = new  HashSet<ArrayList<Integer>>();
        Util(A,new ArrayList<Integer>(),-1);
        return c;
    }
    public void Util(int[] A, ArrayList<Integer> cl, int le)
    {
        if(cl.size()==2)
        {
            int sum = cl.get(0)+cl.get(1);
            int sqrt =(int)Math.sqrt(sum);
            // System.out.print(cl);
            if (sqrt*sqrt == sum && !hs.contains(cl))
            { c++;
                hs.add(cl);
            }
            
           return;     
        }   
        else
        {
            for(int i = le+1;i<A.length;i++)
            {
                cl.add(A[i]);
                Util(A,cl,i);
                cl.remove(cl.size()-1);
                Util(A,cl,i);
                // cl.remove(cl.size()-1);
            }
        }
    }
    }
