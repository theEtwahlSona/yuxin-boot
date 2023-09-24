package cn.hinata.yuxin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Etwahl
 * @Date 2023-09-24 19:02
 */
@SpringBootApplication(scanBasePackages = {"cn.hinata.yuxin.server"})
public class YuxinServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(YuxinServerApplication.class, args);
	}
}
