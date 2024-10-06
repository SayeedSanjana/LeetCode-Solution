
import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int num:nums){
            if(hash.containsKey(num)){
                hash.put(num,hash.get(num)+1);
            }else{
                hash.put(num,1);
            }
        }

        int maxCount=0;
        int maxElement=0;

        for(Integer key:hash.keySet()){
            if(hash.get(key)>maxCount){
                maxCount=hash.get(key);
                maxElement=key;
            }
        }
        return maxElement;
    }

    public static void main(String[]args){
        int nms[]={3,6,8,8,4,8,3,1};
        System.out.println(majorityElement(nms));

}
}
