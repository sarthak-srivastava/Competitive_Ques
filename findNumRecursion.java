import java.util.*;
class findNumRecursion {
        public static void main(String[] args)
        {
            int[] arr = {1,2,3,4,5,5,6,6};
            int num = 5;
            System.out.println(findNum(arr,num,0));
        }
        public static boolean findNum(int[] arr, int num, int vidx)
        {
            if(vidx == arr.length)
                {
                    return false;
                }
            else
            {
                if(arr[vidx]==num)
                return true;
                return findNum(arr,num, vidx+1);
            }
        }
}