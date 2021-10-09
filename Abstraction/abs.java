package Abstraction;


abstract class Sorter
{
    abstract int[] sort(int[] arr);
}
class BubbleSorter extends Sorter
{
    private int[] arr;
    public int[] sort(int[] array)
    {

        arr = array.clone();
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            int flag = 0;
            for(int j=0; j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        return arr;
    }
}

class SelectionSorter extends Sorter
{
    private int [] arr;
    public int[] sort(int[] array)
    {
        arr = array.clone();
        int min ,temp = 0;
        for(int i=0;i<arr.length;i++)
        {
            min = i;
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[j] < arr[min])
                {
                    min=j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;

    }
}

public class abs
{
    public static void main(String[] args) {
        int[] arr = new int[] {36,19,29,12,5};
        Sorter obj = new SelectionSorter();

        int[] sorted_arr;

        sorted_arr = obj.sort(arr);

        System.out.println(arr[0]);
        System.out.println(sorted_arr[0]);

        
    }

}