public class test1{
    public static void main(String[] args)
    {
        prob1(1,1,2,2);
    }
    public static void prob1(int l1, int l2, int r1, int r2){
	    if(l2<l1){
	        int temp = l2;
	       l2=l1;
	       l1=temp;
	       
	       int temp1=r2;
	       r2=r1;
	       r1=temp1;
	    }
	    
	    System.out.print(l1+" ");
	    System.out.print(r2);
	    
	}
}