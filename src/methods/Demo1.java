// gcd logic is present inside the findgcd()
package methods;

public class Demo1 {

    int findgcd(int m, int n)
    {
    	while(n!=0)
    	{
    		int rem = m % n;
    		m = n ;
    		n = rem;   		
    	}
    	int gcd = m;
    	return gcd;
    }

}
