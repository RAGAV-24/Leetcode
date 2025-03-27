class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
       for(int i:stones)
       {
        q.add(i);
       }
       while(q.size()>1)
       {
        int a=q.poll();
        int b=q.poll();
        // if(a==b)
        // {
           
        // }
        if(a!=b)
        {
            q.add(Math.abs(a-b));
        }
       }
    
       
        if(q.size()!=0){
            return q.poll();
        }else{
            return 0;
        }
    }
}