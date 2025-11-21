package intro;

public class IFLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,56,86,15,678};
        
		for(int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2==0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i] +" not multiple by 2");
			}
		}
	}

}
