/*  _ X _ _ 
    _ _ _ _
    _ X _ _
    _ _ X _ 
        
                */


class MazeBoardAllDirectionandBlocks {
    public static void main(String[] args)
    {
        int[][] maze = {{1,0,1,1},{1,1,1,1},{1,0,1,1},{1,1,0,1}};
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        floodfill(0,0,maze,visited,"");
    }
    static int counter = 0;
    public static void floodfill(int sr, int sc, int[][] maze, boolean[][] visited, String psf)
    {
        if(sr == maze.length - 1 && sc == maze[0].length - 1 )
        {   counter ++;
            System.out.println(counter + "." + psf);
            return;
        }
        visited[sr][sc] = true;
        if(sr+1<maze.length && !visited[sr+1][sc] && maze[sr+1][sc]==1)
        floodfill(sr+1,sc,maze,visited,psf+"D");
        if(sc+1<maze[0].length && !visited[sr][sc+1] && maze[sr][sc+1]==1)
        floodfill(sr,sc+1,maze,visited,psf+"R");
        if(sr - 1 >= 0 && !visited[sr-1][sc] && maze[sr-1][sc]==1)
        floodfill(sr-1,sc,maze,visited,psf+"U");
        if(sc -1 >=0 && !visited[sr][sc-1] && maze[sr][sc-1]==1)
        floodfill(sr,sc-1,maze,visited,psf+"L");
        visited[sr][sc] = false;
        return;
    }
}