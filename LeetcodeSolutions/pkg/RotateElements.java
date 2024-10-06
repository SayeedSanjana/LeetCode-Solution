public class RotateElements {
    public static void rotate(int[] nums, int k) {
            k=k%nums.length;
            reverse(nums,0,nums.length-k-1);
            reverse(nums,nums.length-k,nums.length-1);
            reverse(nums,0,nums.length-1);
            
        }
    
        public static void reverse(int[] nums,int start,int end){
            int st=start;
            int en=end;
            while(st<en){
                int temp=nums[st];
                nums[st]=nums[en];
                nums[en]=temp;
                st++;
                en--;
            }
        }
    
    public static void main(String[] args){
        int[] nums1 ={-1,-100,3,99};
        int k=2;
        rotate(nums1,k);
    }

}
