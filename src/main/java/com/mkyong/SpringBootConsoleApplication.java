package com.mkyong;

import com.mkyong.dao.CustomerRepository;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

import static java.lang.System.exit;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // If you want to check the HikariDataSource settingsjav
        HikariDataSource newds = (HikariDataSource)dataSource;
        System.out.println("getMaximumPoolSize = " + ((HikariDataSource) dataSource).getDataSourceProperties());
       // newds.getDataSourceProperties().put("useUnicode","yes");
     //   newds.getDataSourceProperties().put("characterEncoding","UTF-8");
     //   System.out.println("DATASOURCE = " + newds.getDataSourceProperties().getProperty("hikari.useUnicode"));

        if (args.length <= 0) {
            System.err.println("[Usage] java xxx.jar {display}");
        } else {
                if (args[0].equalsIgnoreCase("display")) {
                System.out.println("Display items...");
                List<String> list = customerRepository.findAll();
                list.forEach(x -> System.out.println(x));
            }
            System.out.println("Done!");
        }
        exit(0);
    }
}