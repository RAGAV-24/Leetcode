class Solution {
    public int wateringPlants(int[] p, int c) {
        int t=0;
        int h=c;
        for(int i=0;i<p.length;i++)
        {
          
          if(p[i]>c )
          {
            t=t+2*(i)+1;
            c=h-p[i];
            
          }
          else 
          {
            c=c-p[i];
            t=t+1;
            
          }
           
        }
        return t;
        
    }
}