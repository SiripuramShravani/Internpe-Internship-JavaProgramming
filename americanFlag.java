public class americanFlag {
        public static void main(String[] args) {
            for(int i=0;i<9;i++){
                int k=0;
                while(k<6){
                    System.out.print("*"+" ");
                    k++;
                }
                System.out.print("==================================");
                System.out.println();
                i++;
                if(i<9) {
                    int s = 0;
                    while (s < 5) {
                        System.out.print(" *");
                        s++;
                    }
                    System.out.print("  ==================================");
                    System.out.println();
                }
            }
            int a=0;
            while(a<6){
                System.out.println("==============================================");
                a++;
            }
        }
    }


