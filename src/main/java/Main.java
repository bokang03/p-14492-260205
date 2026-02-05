import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        Scanner scan = new Scanner("aaa\nbbb\nddd");
        Scanner scan = new Scanner("""
                등록
                과거에 등록해라
                작자 미상
                """);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
