class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str:paths)
        {
            String[] comp = str.split(" ");
            String path = comp[0];
            for(int i = 1; i< comp.length; i++)
            {
                String[] fileData = comp[i].split("\\(");
                List<String> curr = hm.getOrDefault(fileData[1],new ArrayList<String>());
                curr.add(path + "/" + fileData[0]);
                hm.put(fileData[1],curr);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String data: hm.keySet())
        {
        List<String> tmp = hm.get(data);
        if(tmp.size() > 1)
         ans.add(tmp);   
        }
        return ans;
    }
}
