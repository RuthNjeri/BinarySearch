// Name: Waiganjo Ruth Njeri
// Reg: p15/1694/2014


public class BinarySearchNonRecursive {
  
	
	public int NonRecursive(int[] X, int k)
	{
		int l = 0;
		int r  = X.length-1;
		
		while (l <= r) {
			
			int m = (l+r)/2 ;
		if (X[m] == k)
			
			return m;
		else if (X[m]<k)
			l=m+1;
		else 
			r= m-1;
		}
		return -1;
	}
	
	public static void main(String[] args){
		
		BinarySearchNonRecursive binary = new BinarySearchNonRecursive();
		
		int[] X =
			{
				1,2,3,4,5
			};
		
		         
		            
		      System.out.print(binary.NonRecursive(X,1)+"," );
		   
		      System.out.print(binary.NonRecursive(X,2)+"," );
		         
		      System.out.print(binary.NonRecursive(X,3)+"," );
		     
		      System.out.print(binary.NonRecursive(X,4)+"," );
		        
		      System.out.print(binary.NonRecursive(X,5)+"," );
		      
		      System.out.print(binary.NonRecursive(X,6)+"," );
			}
	}

