package ArrayOperation;

public class ArrayOperation {

    public static void main(String[] args)
    {
        int [] arr = {10,23,12,34,10,11,55};
        int [] arr2 = {10,23,12,34,10,11};
        int [] arr3 = {10,23,23,23,12,12,10};
        int [] arr1 = {10,0,0,0,23,0,44};
        int[] arr4 ={10,12,23,34,44,55};


         //int[] arr2 = ArrayOperation.insert(arr1,3,6,122);
        // int[] arrdel = ArrayOperation.delete(arr,23);
        //ArrayOperation.findMaxElement(arr);
        //ArrayOperation.secondLargestElement(arr1);
        //ArrayOperation.checkIfsorted(arr1);
        //ArrayOperation.reverseAnArray(arr2);
        //int res = ArrayOperation.removeDuplicate(arr3);
        //System.out.println("Array size"+ res);

      // int[] returnArr =  ArrayOperation.MoveAllZerosToend(arr1);

        //int i = ArrayOperation.binarySerch(arr4,5,100);
       // System.out.println("Index of the element:"+i);

        int k = ArrayOperation.binarySearchRecursive(arr4,0,5,100);
        System.out.println("Index of the element:"+k);

        /*for (int i : returnArr) {
            System.out.println(i);
        }*/


    }

    public static int[] delete(int[] arr, int element)
    {
        int index = 0 ;
        for(int i = 0; i< arr.length-1;i++)
        {
            if(arr[i]==element)
            {
                index = i;
                break;

            }

        }

        for(int i = index; i < arr.length-1;i++)
        {
            arr[i] = arr[i+1];
            arr[i+1]=0;
        }


       return arr ;
    }

    public static int[] insert(int[] arr1, int pos,int len, int element)
    {
        if(len == arr1.length)return  arr1;
        int index = pos-1;
        for(int i =len-1; i>=index;i--)
        {
            arr1[i+1]=arr1[i];

        }
        arr1[index]=element;
        return arr1;

    }

    public static void findMaxElement(int[] arr)
    {
        int max = arr[0];
        for(int i = 0 ; i < arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("max element"+max);

    }


    public static void secondLargestElement(int[] arr)
    {
        int max = arr[0];
        int max2 = -1;
        for(int i = 1 ;i<arr.length;i++)
        {
            if(arr[i]> max)
            {
                max2=max;
                max = arr[i];
            }
        }
        if(max2 == -1)
        {
            System.out.print("no second largest");
        }

        System.out.println("max ->"+max+"second max ->" + max2);

    }

    public static void checkIfsorted(int[] arr)
    {
        int maxElement = arr[0];
        boolean flag = true;

        for(int i = 1 ; i < arr.length;i++)
        {
            if(arr[i]>=maxElement)
            {
                maxElement = arr[i];
            }else{
                flag =false;
                break;

            }
        }

        if(flag== false)
        {
            System.out.println("not sorted");
        }else{
            System.out.println("sorted");

        }
    }

    public static int[] reverseAnArray(int[] arr)
    {
        for(int i = 0, j= arr.length-1;i<=j;i++,j--)
        {
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }

        return arr;
    }

    public static int removeDuplicate(int[] arr)
    {
        int size = 1;
        for(int i =1;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[size]=arr[i];
                size++;
            }

        }

        return size;
    }

    public static int[] MoveAllZerosToend(int[] arr)
    {
        int Index =0;
        for(int i = 0 ; i< arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[Index];
                arr[Index]=arr[i];
                arr[i]=temp;

                Index++;
            }
        }
        return arr;
    }


    public static int binarySerch(int[] arr,int len, int Element)
    {
        int low = 0 ; int high = len-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==Element)
            {
                return mid;
            }else if(Element > arr[mid])
            {
                low = mid+1;
            }else{
                high =mid-1;
            }
        }
        return -1;

    }

    // binary search recursive way

    //{10,12,23,34,44,55};
    public static int binarySearchRecursive(int[] arr,int low, int high , int element)
    {
        if(low>high) {
            return -1;
        }
            int mid = (low + high) / 2;

            if (element == arr[mid]) {
                return mid;
            } else if (element > arr[mid]) {
                low = mid + 1;
                return binarySearchRecursive(arr, low, high, element);
            } else {
                high = mid - 1;
                return binarySearchRecursive(arr, low, high, element);
            }




    }
}
