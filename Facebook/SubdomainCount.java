class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        if(cpdomains == null || cpdomains.length == 0)
            return new ArrayList<String>();
        List<String> ans = new ArrayList<String>();
        HashMap<String, Integer> domainCount = new HashMap<>();
        for(String str: cpdomains)
        {
            String[] cDSplit = str.split("[ ]");
            String[] frag = cDSplit[1].split("[.]");
            int count = Integer.parseInt(cDSplit[0]);
            
            String tmp = frag[frag.length - 1];
            domainCount.put(tmp, domainCount.getOrDefault(tmp, 0) + count);
            for(int i = frag.length - 2; i>=0; i--)
            {
                tmp =  frag[i] + "." + tmp;
                domainCount.put(tmp, domainCount.getOrDefault(tmp, 0) + count);

                
            }          
        }
        for(String entry: domainCount.keySet())
        {
            ans.add(domainCount.get(entry) + " " + entry );
        }
        return ans;
    }
}
