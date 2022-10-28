class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0, max=0;
        int[] arr= new int[accounts.length];
        for(int i=0; i<accounts.length; i++)
        {
            for(int j=0; j<accounts[i].length; j++)
            {
                //System.out.print(accounts[i].length);
                sum=sum+accounts[i][j];
            }
            //System.out.print(sum + " ");
            arr[i]=sum;
            sum=0;
        }
        //max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            
            if(max<arr[i])
                max=arr[i];
            //System.out.print(max + " ");
        }
        return max;
    }
}
