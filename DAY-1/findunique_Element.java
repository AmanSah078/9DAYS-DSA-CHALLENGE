package StriverArrayQuest;
import java.util.Arrays;
public class findunique_Element {
    static void findunique(int[] arr)
    {
for(int i=0;i<arr.length-1; i++)
{
    if(arr[i]==arr[i+1])
    {
        continue;
    }
    System.out.println(arr[i]);

}
int last=arr[arr.length-1];
System.out.println(last);
    }
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 4, 5, 3, 4};
        Arrays.sort(arr);
        findunique(arr);
    }
}
