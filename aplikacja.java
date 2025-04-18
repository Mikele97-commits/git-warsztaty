import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int choice=Choice.input();
        Write.options(choice);
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
    public static void options(int input){
        switch(input){
            case 1: Write.standard();
        }
    }
    
    public static void standard(){
        System.out.println("Hello World!");
    }
}
