import com.PHS.interfaces.CustomerRepository;
import com.PHS.interfaces.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.PHS.repository.HibernateCustomerRepositoryImpl;
import com.PHS.service.CustomerServiceImpl;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.PHS"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean(name ="customerService")
//    public CustomerService getCustomerService(){
//        //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        CustomerServiceImpl service = new CustomerServiceImpl();
//        //service.setCustomerRepository(getCustomerRepository());
//        return service;
//    }

//    @Bean(name="customerRepository")
//    public CustomerRepository getCustomerRepository(){
//        return new HibernateCustomerRepositoryImpl();
//    }


}
