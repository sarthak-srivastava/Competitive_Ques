
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    int minEle;
    Stack<Integer> s;
    GfG()
    {
        minEle = Integer.MAX_VALUE;
        s = new Stack<Integer>();
    }
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	Stack<Integer> aux = new Stack<Integer>();
// 	int ans = Integer.MAX_VALUE;
	if(s.size() == 0)
	return -1;
	minEle = Integer.MAX_VALUE;
	while(s.size()>0)
	{   
	    int t = s.pop();
	    if(t<minEle)
	    minEle = t;
	    aux.push(t);
	    
	}
	while(aux.size()>0)
	s.push(aux.pop());
	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here	
	 if(s.size() == 0)
	 return -1;
	 return s.pop();
    }
    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	s.push(x);
	
    }	
}
