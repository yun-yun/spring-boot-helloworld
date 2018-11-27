package top.lyunk.sayhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SayhelloApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SayhelloApplication.class, args);
        System.out.println("==============hello==============");
        while (true){
            Thread.sleep(1000 * 60);
            System.out.println("==============RUN==============");
        }
    }
}
