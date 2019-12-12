package eb.egonb.blogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class BloggingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloggingApplication.class, args);
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource= new ReloadableResourceBundleMessageSource();messageSource.setBasename("classpath:messages/messages");messageSource.setDefaultEncoding("UTF-8");return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean getValidator() {LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();bean.setValidationMessageSource(messageSource());return bean;}
}
