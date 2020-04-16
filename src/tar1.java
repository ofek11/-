public class tar1 {
	public static  int[] tar_1 (int[] a, int[] b)
	{
		boolean check = true;
		int numA=0;
		int numB=0;
		int p = 0;
		int[] ordlist = new int[a.length+b.length];
		for (int len = 0; len<ordlist.length-1;len++)
		{
			if(check)
			{
				if(numB==a.length-1)
				{
					check =false;
					numB = a.length-1;
				}
				for (int i = numA; i < a.length;i++)
				{
					if(a[i]<=b[numB])
					{		
						ordlist[p] = a[i];
						p++;
						check = false;
						numA++;
					}
					if(!check)
					{
						if(numA==b.length-1)
						{
							check =false;
							numA = b.length-1 ;
						}				
						for (int g = numB; g < b.length;g++)
						{
							if(b[g]<a[numA])
							{							
								ordlist[p] = b[g];
								p++;
								check = true;
								numB++;
		}	}	}	}	}	}
		return ordlist;
	}
	public static void main(String[] args)	  
	{
		int[] c =  {1,2,4,6,8};
		int[] f =   {3,5,9,11,15};
		tar_1(c,f);
	}
}
