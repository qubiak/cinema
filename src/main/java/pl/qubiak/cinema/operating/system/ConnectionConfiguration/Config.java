package pl.qubiak.cinema.operating.system.ConnectionConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.sql.DataSource;
import java.util.Collections;

@Configuration
public class Config {

    @Value("${password}")
    private String password;

    @Value("${url}")
    private String url;

    @Value("${username}")
    private String username;

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(url);
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        return dataSourceBuilder.build();
    }

    @Bean
    public Docket get() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/**"))
                .apis(RequestHandlerSelectors.basePackage("pl.qubiak.netflix.Controller"))
                .build().apiInfo(CreateApiInfo());
    }

    private ApiInfo CreateApiInfo() {
        return new ApiInfo("cinema operation system",
                "system for managing cinema screenings and reservations.",
                "1.00",
                "https://github.com/qubiak",
                new Contact("Bartłomiej Kubiak", "https://github.com/qubiak", "kubiak1986@gmail.com"),
                "my own licence",
                "https://github.com/qubiak",
                Collections.emptyList()
        );
    }
}
