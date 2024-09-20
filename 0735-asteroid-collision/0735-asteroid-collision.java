class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> at=new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                at.push(a[i]);
            }
            else
            {
               
                
                while(!at.isEmpty()&&at.peek()<-(a[i]) && at.peek()>0 )
                {
              at.pop();
                }
                if(!at.isEmpty() && at.peek()==-(a[i]))
                {
              at.pop();
                }
                else if(at.isEmpty() || at.peek()<0)
                {
                  at.push(a[i]);
                }
            }

        }    
        int[] re=new int[at.size()];
        for(int i=at.size()-1;i>=0;i--)
        {
            re[i]=at.pop();
        }
        return re;
    }
}