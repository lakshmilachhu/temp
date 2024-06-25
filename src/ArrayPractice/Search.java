package ArrayPractice;

public class Search {

	public boolean search(String[] arr, String searchData) {
		searchData=searchData.trim().toLowerCase();
		boolean flag=false;
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k].toLowerCase().equals(searchData))
			{
			flag=true;
			break;
			}
		}
		return flag;
	}
	
//	public boolean titleOccurance(int[] value, int count)
//	{
//		boolean flag=false;
//		for(int i=0;i<)
//	}
}
