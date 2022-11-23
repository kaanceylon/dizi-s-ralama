import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu girin: ");
        int sizeArray = input.nextInt();
        int temp = 0;

        System.out.println("Dizinin elemanlarını girin: ");

        if(sizeArray > 0){
            int array[] = new int[sizeArray];
            for(int i=0; i < sizeArray; i++){
                System.out.print((i+1)+". Eleman : ");
                array[i]= input.nextInt();
            }
            for(int i=0; i < sizeArray; i++){

                for(int j=i+1; j < sizeArray; j++){

                    if(array[i] > array[j]){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("Sıralama : " + Arrays.toString(array));
        }





    }
}