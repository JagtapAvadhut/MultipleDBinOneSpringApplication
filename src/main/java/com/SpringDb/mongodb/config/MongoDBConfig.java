package com.SpringDb.mongodb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import java.net.URLEncoder;

@Configuration
@EnableMongoRepositories(basePackages = "com.SpringDb.mongodb.repository")
public class MongoDBConfig extends AbstractMongoClientConfiguration {

    @Autowired
    private Environment environment;

    @Override
    protected String getDatabaseName() {
        return environment.getProperty("mongo.spring.data.mongodb.database");
    }

    @Override
    @Bean
    public MongoClient mongoClient() {
        String connectionString = buildConnectionString();
        return MongoClients.create(connectionString);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

    private String buildConnectionString() {
        String username = environment.getProperty("mongo.spring.data.mongodb.username");
        String password = environment.getProperty("mongo.spring.data.mongodb.password");
        String database = environment.getProperty("mongo.spring.data.mongodb.database");
        String uri = environment.getProperty("mongo.spring.data.mongodb.uri");

        // URL encode username and password
        String encodedUsername = URLEncoder.encode(username);
        String encodedPassword = URLEncoder.encode(password);

        // Replace username and password in URI
        uri = uri.replace("<username>", encodedUsername)
                .replace("<password>", encodedPassword)
                .replace("<database>", database);

        return uri;
    }
}
