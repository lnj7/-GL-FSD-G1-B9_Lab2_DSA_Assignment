package Solution_1;

import java.util.Scanner;

import MergeSort.MergeSort;

public class Solution1 {

	public Solution1() {
		// TODO Auto-generated constructor stub
	}

	 MergeSort msort=new MergeSort();
	    
	    void transactions(int arr[],int target)
	    {

	    	int counter=1;
	    	int sum=0;
	    	
	    	try {
	    		for(int i=0;i<arr.length;i++)
	    		{    			
	    				sum+=arr[i];
	    				if(target<=sum)
		    			{
		    				 System.out.println("Target achieved after "+ counter +" transactions ");
		    				 return;
		    			}
	    				++counter;
	    			    			
	    		}
	    		
	    		
   				 System.out.println("Given target is not achieved ");
   				    		
	    		   		
	    	}catch(ArithmeticException e)
	    	{
	    		 System.out.println("target are invalid");
	    	}
	    	
	    }
	    
	   public  void PayMoney()
	    {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	int d_size;
	    	System.out.print("enter the size of transaction array :\n");
	    	d_size=sc.nextInt();
	    	
	    	int arr[]=new int[d_size];
	    	
	    	System.out.print("enter the values of array :\n");
	    	
	    	for(int i=0;i<d_size;i++)
	    	{
	    		arr[i]=sc.nextInt();
	    	}
	    	System.out.print("enter the total no of targets that needs to be achieved :\n");
	    	int targets;
	    	targets=sc.nextInt();

	    	int trgts[]=new int[targets];
	    	for(int i=0;i<targets;i++)
	    	{
	    		System.out.print("enter the value of target :\n");
	    		trgts[i]=sc.nextInt();
	    		transactions(arr,trgts[i]);
	    	}
	    	
	    	
	    	
	    	   	
	    	
	    }

}
