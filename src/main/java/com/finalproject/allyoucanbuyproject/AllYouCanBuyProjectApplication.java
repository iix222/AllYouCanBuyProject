package com.finalproject.allyoucanbuyproject;

import com.finalproject.allyoucanbuyproject.model.OrderModel;
import com.finalproject.allyoucanbuyproject.service.AdminService;
import com.finalproject.allyoucanbuyproject.service.OrderService;
import com.finalproject.allyoucanbuyproject.service.ProductService;
import com.finalproject.allyoucanbuyproject.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;
import java.time.LocalDate;

@EntityScan
@SpringBootApplication
public class AllYouCanBuyProjectApplication implements CommandLineRunner {

	private final ProductService productService;

	private final AdminService adminService;

	private final UserService userService;

	private final OrderService orderService;

	public AllYouCanBuyProjectApplication(ProductService productService, AdminService adminService, UserService userService, OrderService orderService) {
		this.productService = productService;
		this.adminService = adminService;
		this.userService = userService;
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AllYouCanBuyProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		OrderModel orderModel = new OrderModel();
		BigDecimal cost = new BigDecimal("50.00");
		orderModel.setUserAddress("Riia street");
		orderModel.setTotalCost(cost);
		orderModel.setDeliveryAddress("Tallinn");
		orderModel.setOrderDate(LocalDate.of(2023, 1, 23));
		orderModel.setUserName("JaneDoe");
		orderService.save(orderModel);
	}
}

