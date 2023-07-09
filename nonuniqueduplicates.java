import java.util.Arrays;
import java.util.Scanner;

    public class nonuniqueduplicates {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
            for(int j=0;j<arr.length;j++){
                int s=arr[j];
                for(int k=j+1;k<arr.length;k++){
                    if(s==arr[k]){
                        count++;
                    }
                    if(count==1){
                        System.out.print(arr[k]+" ");
                        break;
                    }
                }
                count=0;
            }

        }
    }


