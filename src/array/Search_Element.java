package array;

public class Search_Element {
	public static void main(String args[])
    {
    	int a[] = {1,2,3,4,5,6,7};
    	int search = 11;
    	int flag = 0;
    	for(int x:a) {
    		if(x == search) {
    			flag=1;
    			break;
    			}
    	}
 
    	if(flag==1) {
    		System.out.println("Number found");
    	}else
              System.out.println("Number not found");
    		
    	
    	}
    }

	


