public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;

    }

    public static void main(String[] args){
        int[] nums1 ={3,2,2,3};
        int n=3;
        System.out.println(removeElement(nums1, n));
    }

}
