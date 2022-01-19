package com.williamsarti.ProjetoSpring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.williamsarti.ProjetoSpring.entities.Category;
import com.williamsarti.ProjetoSpring.entities.Order;
import com.williamsarti.ProjetoSpring.entities.User;
import com.williamsarti.ProjetoSpring.entities.enums.OrderStatus;
import com.williamsarti.ProjetoSpring.repositories.CategoryRepository;
import com.williamsarti.ProjetoSpring.repositories.OrderRepository;
import com.williamsarti.ProjetoSpring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		User u1 = new User(null, "Mateus Rieg", "mateusrieg@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Paulo Henrique", "paulohenrique@gmail.com", "977777777", "123456");
		User u3 = new User(null, "William Sarti", "williamsarti@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2022-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-07-21T03:42:10Z"),OrderStatus.WAITING_PATMENT, u2);
		Order o3 = new Order(null, Instant.parse("2022-07-22T15:21:22Z"),OrderStatus.PAID, u3);
		
		userRepository.saveAll(Arrays.asList(u1, u2 , u3));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}

}
