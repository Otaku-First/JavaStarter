import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        new Lesson2();
    }

    public Lesson2(){
        String txt;

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть слово>> ");
        txt = input.next();
        char J = txt.charAt(0);
        char A = txt.charAt(1);
        char V = txt.charAt(2);
        char A2 = txt.charAt(3);

        System.out.print("\t\t"+J+"\t      "+A+"\t   "+V+"         "+V+"    "+A2+"\n\t\t"+J+"\t     "+A+" "+A+"    "+V+"" +
                "       "+V+"    "+A2+" "+A2+"\n\t\t"+J+"\t    "+A+"   "+A+"    "+V+"     "+V+"    "+A2+"   "+A2+
                "\n"+J+"\t\t"+J+"\t   "+A+"     "+A+"    "+V+"   "+V+"    "+A2+"     "+A2+"\n"+J+"\t\t"+J+"\t  "+A+" " +
                ""+A+" "+A+" "+A+" "+A+"    "+V+" "+V+"    "+A2+" "+A2+" "+A2+" "+A2+" "+A2+"\n"+J+" "+J+" "+J+" "+J+" " +
                ""+J+"\t "+A+"         "+A+"    "+V+"    "+A2+"         "+A2);





    }

}
