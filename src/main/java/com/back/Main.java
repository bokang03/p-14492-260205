package com.back;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        lab2();
    }

    private static void lab2() {
        PrintStream ORIGINAL_OUT = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream((byteArrayOutputStream));

        System.setOut(printStream);

        // 여기는 안나옴 (byteArrayOutputStream에 쌓이고 있음)
        System.out.println("hihi");
        System.out.println("bye");
        System.out.println("ok");

        System.setOut(ORIGINAL_OUT); // 모티터로 출력 복원

        String result = byteArrayOutputStream.toString();
        System.out.println(result);
    }

    public static void lab1(){
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
