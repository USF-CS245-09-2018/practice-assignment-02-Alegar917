public class BinaryIterativeSearch implements Practice2Search{
	public int search(int[] arr,int target){
		int low=0;
		int high=arr.length-1;
		while(low<high){
			int mid=(low+high)/2;
			if(arr[mid]==target){
				return mid;
			}
			if(arr[mid]>target){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		return -1;
	}
	public String searchName(){
		return "BinaryIterativeSearch";
	}
}