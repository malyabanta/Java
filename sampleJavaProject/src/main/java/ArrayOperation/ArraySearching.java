package ArrayOperation;

public class ArraySearching {
    public static void main(String[] args)
    {
       int[] arr = {5,10,11,12,13,13,13,14,15} ;

        int a = ArraySearching.FirstOccuranceOfAnElement(arr,0,7,18);
        System.out.println(a);

    }
    // 10,11,12,13,13,15
    public static int FirstOccuranceOfAnElement(int[] arr,int low, int high, int element)
    {
        if(low > high)return -1;

        int mid = (low+high)/2;

        if(element == arr[mid])
        {
            int index = 0 ;
            for(int i = low; i <= mid;i++)
            {
                if(element == arr[i] )
                {
                    index = i;
                    break;
                }
            }
            return index;
        }else if(element > arr[mid])
        {
            low = mid+1;
            return FirstOccuranceOfAnElement(arr,low, high, element);
        }else{
            high = mid-1;
            return FirstOccuranceOfAnElement(arr,low, high, element);
        }
    }
}
