import java.util.Scanner;

        public class Main {
            public Main() {
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int mynumber = (int)(Math.random() * 100.0);


                int userNumber;
                do {
                    System.out.println("guss mt number :");
                    userNumber = sc.nextInt();
                    if (userNumber == mynumber) {
                        System.out.println("yes you are right");
                        break;
                    }

                    if (userNumber > mynumber) {
                        System.out.println("your number is too big");
                    } else {
                        System.out.println("your number is too small");
                    }
                } while(userNumber >= 0);

                System.out.println("my number was :");
                System.out.println(mynumber);
            }
        }