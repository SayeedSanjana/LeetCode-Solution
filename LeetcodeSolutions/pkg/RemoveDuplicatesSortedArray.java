public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        int un=0;
        for(int i=1;i<nums.length;i++){
            if(nums[un]!=nums[i]){
                un++;
                nums[un]=nums[i];
            }
        }
        return un+1;
    }  

    public static void main(String[] args){
        int[] nums1 ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums1));
    }

}
