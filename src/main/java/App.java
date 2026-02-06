import java.util.Scanner;

public class App {
    //  clearSetOutToByteArray 모니터로 볼 때만 사용

    private Scanner scanner;

    public App(Scanner scanner){
        this.scanner = scanner;
    }

    public void run(){
        System.out.println("== 명언 앱 ==");
        System.out.println("명령) ");
        System.out.println("명언 : ");
        System.out.println("작가 : "); // ouputStream에 쌓인다.
    }
}
