package codes.dope.practice.codes;

public class FindTheValueInArray {

	public static void main(String[] args) {

		//the for each loop is essentialy for read only
		
		int [] nums= {6,8,3,7,5,6,1,4};
		
		int val=5;
		boolean found=false;
		
		for(int x:nums) {
			if(x==val) {
			found=true;
			break;
		}
			
	} if(found)
		System.out.println("Values found! ");
		}

}
