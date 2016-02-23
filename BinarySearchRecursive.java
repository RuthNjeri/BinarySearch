// Name: Waiganjo Ruth Njeri
// Reg: p15/1694/2014

public class BinarySearchRecursive {

	
	public static int recursiveBs(int[] X, int l, int h, int key)
	{
		
		if (l<h)
		{
			int m = (l+h)/2;
			 
			if(key<X[m]){
				 return recursiveBs(X, l, m-1, key);
				 
			}
			else if(key>X[m]){
				 return recursiveBs(X, m+1,h, key);
			}
			 else {
	                return m;
	            }
		}
	
	return -1;
}


public static void main(String[] args) {
	 
    int[] X = {1,2,3,4,5};
    int index = recursiveBs(X,0,X.length,5);
    if(index != -1){
        System.out.println("Found 5 at "+index);
    }
    else{
        System.out.println("Element not found");
    }

    
}
}