class Solution {
    public int totalFruit(int[] tree) {
        int lastfruit = 0;
        int secondlastfruit = 0;
        int countlast = 0;
        int curr = 0;
        int max = 0;
        for(int fruit:tree)
        {   
            if(fruit == lastfruit || fruit == secondlastfruit)
                curr++;
            else
                curr = countlast + 1;
            if(fruit == lastfruit)
            {
                
                countlast++;
            }
            else
            {   countlast = 1;
                secondlastfruit = lastfruit;
                lastfruit = fruit;
                
            }
            max = Integer.max(max,curr);
        }
        return max;
    }
}