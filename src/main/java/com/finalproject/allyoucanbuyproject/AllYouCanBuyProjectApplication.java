package com.finalproject.allyoucanbuyproject;

import com.finalproject.allyoucanbuyproject.service.AdminService;
import com.finalproject.allyoucanbuyproject.service.ProductService;
import com.finalproject.allyoucanbuyproject.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AllYouCanBuyProjectApplication implements CommandLineRunner {

	private final ProductService productService;

	private final AdminService adminService;

	private final UserService userService;

	public AllYouCanBuyProjectApplication(ProductService productService, AdminService adminService, UserService userService) {
		this.productService = productService;
		this.adminService = adminService;
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AllYouCanBuyProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
