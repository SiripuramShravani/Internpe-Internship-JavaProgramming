    public class labeledloop {
        public static void main(String[] args) {
            outerloop:
            for(int i=0;i<5;i++){
                innerlopp:
                for(int j=0;j<5;j++){
                    System.out.print("* ");
                    if(j==5){
                        break innerlopp;
                    }
                }
                System.out.println();

            }
        }
    }


