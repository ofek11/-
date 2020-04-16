import java.util.Arrays;
public class tar1 {
	public static int[] tar_1 (int[] a, int[] b)
	{
		int lenA = a.length-1;
	    int lenB = b.length-1;
	    int contA = 0;
	    int contB = 0;
	    int i = 0;
	    int[] OrdList = new int[(lenA+lenB+2)];
	    while (contA + contB <= lenA+lenB)
	    {
	    	if (a[contA] < b[contB])
	    	{
	    		OrdList[i] = a[contA];
	    		i++;
	    		if(contA<lenA) {
		    		contA++;	
	    		}
	    	}
	    	else
	    	{
	    		OrdList[i] = b[contB];
	    		i++;
	    		if(contB<lenB) {
		    		contB++;	
	    		}
	    	}
	    }
		    return OrdList;
		  }
		  public static void main(String[] args) {
		        
		    int[] c =  new int[] {1,2,4,6,8};
		    int[] f =   new int[] {1,3,6,9,11,15};
		    int[] g = tar_1(c,f);
		    System.out.print(Arrays.toString(g));
		  }
		}
