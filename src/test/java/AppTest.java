import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    @DisplayName("'== 명언 앱 ==' 출력")
    void t1() throws Exception {
        Scanner sc = TestUtil.genScanner("종료");

        ByteArrayOutputStream outputStream = TestUtil.setOutByteArray();
        new App(sc).run();

        String out = outputStream.toString();

        assertThat(out).contains("== 명언 앱 ==");

    }

    @Test
    @DisplayName("등록")
    void t2() throws Exception {
        Scanner sc = TestUtil.genScanner("등록");

        ByteArrayOutputStream outputStream = TestUtil.setOutByteArray(); // 모니터가 아닌 배열로 받기
        new App(sc).run();

        String out = outputStream.toString();

        assertThat(out).contains("== 명언 앱 ==");

    }
}