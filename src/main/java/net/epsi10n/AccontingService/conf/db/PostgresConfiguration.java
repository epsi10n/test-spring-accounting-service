package net.epsi10n.AccontingService.conf.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author epsi10n
 */
@Configuration
@PropertySource({"classpath:application.yml"})
@EnableJpaRepositories(
        basePackages = {"net.epsi10n.AccontingService.repo.crud"},
        entityManagerFactoryRef = "accountingPostgresEntityManager",
        transactionManagerRef = "accountingPostgresTransactionManager")
public class PostgresConfiguration {
    private final Environment env;

    public PostgresConfiguration(@Autowired Environment env) {
        this.env = env;
    }

    @Bean
    @Qualifier("accounting_postgres_entity_manager")
    public LocalContainerEntityManagerFactoryBean accountingPostgresEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(accountingPostgresDataSource());
        em.setPackagesToScan("net.epsi10n.AccontingService.data.entity");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "none");
        properties.put("hibernate.jdbc.batch_size", 10000);
        properties.put("hibernate.order_inserts", true);
        properties.put("hibernate.order_updates", true);
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    public DataSource accountingPostgresDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(env.getProperty("accounting_server.datasource.accounting_postgres_data_source.url"));
        dataSource.setUsername(env.getProperty("accounting_server.datasource.accounting_postgres_data_source.username"));
        dataSource.setPassword(env.getProperty("accounting_server.datasource.accounting_postgres_data_source.password"));
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager accountingPostgresTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(accountingPostgresEntityManager().getObject());
        return transactionManager;
    }

    @Bean
    @Qualifier("accounting_postgres_data_source")
    public JdbcTemplate accountingPostgresJdbcTemplate() {
        return new JdbcTemplate(accountingPostgresDataSource());
    }
}
