class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i+m-1<n;i++){
         int diff = a.get(i + m - 1) - a.get(i);
            if(diff<min){
                min=diff;
            }
        }
        
        return min;
    }
}