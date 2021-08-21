public class PrimeirosCem{

    public static void main(String[] args) {
        
        int n;
        
        for (n = 0 ; n < 101; n++){

            System.out.print(n);
            if (n < 100) {
                System.out.print(" - ");
            }
            else{
                System.out.println(" ");
            }
        }



        n = 0;
        while (n < 101){

            System.out.print(n);
            if (n < 100) {
                System.out.print(" - ");
            }
            else{
                System.out.println(" ");
            }
            n++;

        }



        n = 0;
        do{

            System.out.print(n);
            if (n < 100) {
                System.out.print(" - ");
            }
            else{
                System.out.println(" ");
            }
            n++;

        }while(n < 101);

    }

}