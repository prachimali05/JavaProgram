package array;

public class Array {
    public static void main(String args[])
    {
    	int arr[] = {1,2,3,4,5,6};
    	int max = arr[0];
    	for(int a:arr) {
    		if (max<a) {
    			max=a;
    		}
    	}
    	System.out.println(max);
    }
}
