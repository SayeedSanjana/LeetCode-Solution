public class MergeSorteddArray {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int length=m+n;
            int[] arr=new int[length];
            int minPos=0;
            for(int i=0;i<m;i++){
                arr[i]=nums1[i];
            }
            for(int j=0;j<n;j++){
                arr[j+m]=nums2[j];
            }
    
            for(int i=0;i<arr.length;i++){
                minPos=i;
                for(int j=i;j<arr.length;j++){
                    if(arr[j]<arr[minPos]){
                        minPos=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[minPos];
                arr[minPos]=temp;
            }
           
           for(int i=0;i<nums1.length;i++){
            nums1[i]=arr[i];
           }

           for(int i=0; i<nums1.length;i++){
              System.out.print(nums1[i]);
           }
           System.out.println();
    
    
            
        }
        public static void main(String[] args){
            int[] nums1 ={1,2,3,0,0,0};
            int[] nums2={2,5,6};
            int m=3;
            int n=3;
            merge(nums1,m,nums2,n);
        }
    }

