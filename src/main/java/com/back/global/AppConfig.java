package com.back.global;

import lombok.Getter;

// 전역 설정
public class AppConfig {

    @Getter
    private static String mode;

    public static void setTestMode() {
        AppConfig.mode = "test";
    }

    public static void setDevMode() {
        AppConfig.mode = "dev";
    }
}