public class tar2 {
	public static String tar_2(String name)
	{
		 char[] char_array = name.toCharArray();
		 int len = char_array.length-1;
		 int[] alphabet = new int[26];
		 for (int i = 0; i<= len; i++)
		 {
			 // 'a' in ASCII = 97
			int ascii_to_num = (int) char_array[i]-97;
			alphabet[ascii_to_num]++;
		 }
		 char[] ord_list = new char[len+1];
		 int num = 0;
		 for(int i = 0; i<=len;i++)
		 {	 
			 for (int g = num ; g<=num; g++)
			 {
				 num = num + alphabet[i];
				 char c =(char) alphabet[i] ;
				 ord_list[g] = c;
			 }
		 }
		 String str = new String(ord_list);
		 return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String unord = "bcdeaafertdfertylx";
		String ord = tar_2(unord);
		System.out.print(ord);
		}
}
