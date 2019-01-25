import java.util.*;
public class Solution {
 public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> num) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    // ArrayList<Integer> al;
            // Collections.addAll(al, num); 

    ArrayList<Integer> temp = new ArrayList<Integer>();
    return permuteHelper(num,num.size(),result,temp);
}
 public ArrayList<ArrayList<Integer>> permuteHelper(ArrayList<Integer> num,int size,ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp)
 {
     if(size==0){
         result.add(new ArrayList<Integer>(temp));
     return result;}
     else
     {  
         for(int i = 0;i<num.size();i++)
         {
             temp.add(num.get(i));
             ArrayList<Integer> t = new ArrayList<Integer>(num);
             t.remove(i);
             permuteHelper(t,t.size(),result,temp);
             temp.remove(temp.size()-1);
         }
         return result;
     }
 }
}
