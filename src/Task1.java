import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        new Task1();
    }

    public Task1(){
       String[]  arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

       Scanner input = new Scanner(System.in);
       Random ranobj = new Random();
int ran = ranobj.nextInt(26);

        String rand = arr[ran];
        System.out.println(rand);
        System.out.println(ran);
        System.out.println("Введіть слово>> ");
        String itm = input.nextLine();


        if (rand.equals(itm)) {
            System.out.println("Right");

        }else if(!ride(ran,itm,arr)) {
            System.out.println("Вже близбко");
            System.out.println("Введіть слово>> ");
            itm = input.nextLine();
        }else if(ride(ran,itm,arr)){
            System.out.println("За далеко");
            System.out.println("Введіть слово>> ");
            itm = input.nextLine();
        }else {
            System.out.println("Введіть слово>> ");
            itm = input.nextLine();

        }

    }
    public boolean ride(int r,String im,String[] f){
        int position = 0;
        for (int i =0; i<f.length;i++){
            if (f[i].equals(im)){
            position =i;
            }

        }
        if(position>r){
            return true;
        }else {
            return false;
        }

    }
}
