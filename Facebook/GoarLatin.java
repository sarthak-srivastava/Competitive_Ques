public class Solution {
    /**
     * @param S: 
     * @return: nothing
     */
    public String toGoatLatin(String S) {
        // 
        if(S == null || S.length() == 0 )
        return "";
        String[] words = S.split(" ");
        int i = 0;
        Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> vowel = new HashSet<>(Arrays.asList(vowels));
        for(String w: words)
        {   i++;
            String temp = "";
            int j = 0;
            if(!vowel.contains(w.charAt(j++)))
            {
            
            temp = w.substring(j) + w.substring(0, j) + "ma";
   
            }
            else
            temp = w + "ma";
            for(int k = 0; k< i; k++)
            {
                temp = temp + "a";
            }
            words[i - 1] = temp;
            
            
        }
        return String.join(" ", words);
    }
}
