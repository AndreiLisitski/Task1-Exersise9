
import java.util.Scanner;

public class Task1Ex9 {
    public static void main(String[] args) {
        int[] listSmall = new int[10];
        int[] listBig = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pos = ");
        int pos = sc.nextInt();

        for (int i = 0; i < listSmall.length; i++) {
            listSmall[i] = (int) (1 + Math.random() * 10);
            System.out.print(listSmall[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < listBig.length; i++) {
            listBig[i] = (int) (1 + Math.random() * 10);
            System.out.print(listBig[i] + " ");
        }
        System.out.println();

        int[] commonList = new int[listSmall.length + listBig.length];

        for(int i = 0; i < pos; i++){
                commonList[i] = listSmall[i];
        }

        for(int i = 0; i < listBig.length; i++){
            commonList[i + pos] = listBig[i];
        }

        for(int i = pos; i < listSmall.length; i++){
            commonList[i + listBig.length] = listSmall[i];
        }
        System.out.println();
        for (int i = 0; i < commonList.length; i++) {
            System.out.print(commonList[i] + " ");
        }
    }
}



