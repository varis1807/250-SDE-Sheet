public class WordSearch {
      static boolean[][] visited;
      public boolean search(int sr,int sc,char[][] board,int idx,String word,int dir[][]) {
           if(idx == word.length()){
              return true;
          }
          int n=board.length, m=board[0].length;
          if(sr>=n || sc>=m ||sr<0||sc<0|| word.charAt(idx) != board[sr][sc] || visited[sr][sc]){
              return false;
          }
          
          visited[sr][sc] = true;
          if ( search(sr+1,sc,board,idx+1,word,dir)||
              search(sr,sc+1,board,idx+1,word,dir)||
              search(sr-1,sc,board,idx+1,word,dir)||
              search(sr,sc-1,board,idx+1,word,dir))
              return true;
           visited[sr][sc] = false;
    
          
          return false;
      }
      public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
          int dir[][] ={{0,1},{1,0},{0,-1},{-1,0}};
          for(int i = 0; i < board.length; i++){
              for(int j = 0; j < board[i].length; j++){
                  if(word.charAt(0) == board[i][j] && search(i,j,board,0,word,dir) == true){
                      return true;
                  }
              }
          }
          
          return false;
      }
}
