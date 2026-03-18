class SumSix{
    public static void main(String[]args)
    {
        int[] arr = {1,4,3,5,2,10,-4};
        int sum = 6;
        System.out.println("Pairs of two array = 6:");
        for(int i = 0;i<arr.length;i++)
        {
            for (int j = i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j] == sum)
            {
        System.out.println(arr[i]+"+" + arr[j]  + "=" + sum);
            }
            }
        }
    }
}