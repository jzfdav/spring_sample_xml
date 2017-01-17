import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jzf.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		// CustomerService service = new CustomerServiceImpl();

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service);

		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service2);

		System.out.println(service.findAll().get(0).getFirstName());

		appContext.close();

	}

}
