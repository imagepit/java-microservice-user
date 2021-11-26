package com.microservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // このクラスがREST APIのコントローラ役になる
@SpringBootApplication
public class UserApplication {

	@RequestMapping("/") // リクエストハンドラー（http://localhost:8080/）
	public String home(){
		return "hello spring boot!!!"; // 文字列をレスポンス
	}

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
