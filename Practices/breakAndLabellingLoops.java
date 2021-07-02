public class breakAndLabellingLoops { 
    public static void main(String[] args) { 
        int i = 1;
        int j = 1;
        outer:
            while(i<=3) {
            System.out.println("New operation");
            inner:
                while(j<=4) {
                System.out.println("Operating");
                if(j==2){
                    System.out.println("Operation fnished");
                    break inner;
                }
                j++;
            }
                j++;
                if(i==2){
                    System.out.println("Operation finished");
                    break outer;
                }
                i++;
        }
    }
}
            
            
            
            
            
            
            
            
            