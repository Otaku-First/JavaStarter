public class Task2 {

    public static void main(String[] args) {
        new Task2();
    }
    public Task2(){

        String str = "Напишіть програму, яка зчитує символи поки не зустрінеться крапка. Також передбачте вивід кількості пропусків.";
        StringBuilder strb = new StringBuilder(str);
        int index = 0;
    char c;
    String txt = "";
        while ((c = strb.charAt(index))!= '.'){
            index ++;
            System.out.print(c);
            txt += c;

    }

    System.out.println("\nПробілів: "+space(txt));

    }
    public int space(String s){
        StringBuilder t = new StringBuilder(s);
        int resulte = 0;
        for (int i=0; i<t.length(); i++){
            if(t.charAt(i)==' '){
                resulte ++;

            }

        }
    return resulte;
    }
}
