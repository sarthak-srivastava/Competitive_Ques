class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)
            return image;
        int oldColor = image[sr][sc];
        fill(image,sr,sc,newColor, oldColor);
        return image;
    }
    public void fill(int[][] image, int sr, int sc, int newColor, int oldColor)
    {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc] != oldColor)
            return;
        
        image[sr][sc] = newColor;
        fill(image,sr+1,sc,newColor,oldColor);
        fill(image,sr-1,sc,newColor,oldColor);
        fill(image,sr,sc+1,newColor,oldColor);
        fill(image,sr,sc-1,newColor,oldColor);
    }
}
