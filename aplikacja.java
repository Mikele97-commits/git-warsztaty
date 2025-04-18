import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    }
}

class Choice {
        public static int input(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Daj input");
            int input=scan.nextInt();
            return input;
        }   
}


class Write {
    public static void basicWrite(){
        System.out.println("Hello World!");
    }
}
