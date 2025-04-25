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
            break;
            case 2: Write.inverse();
            break;
            case 3: Write.vertical();
            break;
        }
    }

    public static void standard(){
        System.out.println("Hello World!");
    }


    public static void vertical() {
        System.out.println("H\ne\nl\nl\no\n\nW\no\nr\nl\nd\n!");
    }

    public static void inverse() {
        System.out.println("!dlroW olleH");
    }

    
}
