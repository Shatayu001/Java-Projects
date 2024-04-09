// pattern using while loop
public class PatternUwhile  {
    public static void main(String[]args){
        int i=1,n=10;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.printf("#");
                j+=1;
            }
            System.out.println("");
            i+=1;
        }
    }
}
