package com.mkyong;

/**
 * Created by KOUSAR on 7/10/2017.
 */

 import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class AppConfig {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() throws SQLException {
        HikariConfig config = new HikariConfig("/hikari.properties");
        config.addDataSourceProperty("characterEncoding","utf8");
        config.addDataSourceProperty("useUnicode","true");
        HikariDataSource dataSource = new HikariDataSource(config);

        return dataSource;
    }
}