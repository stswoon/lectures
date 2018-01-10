package com.netcracker.education.hero;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
@Component
public class HeroTestData {
    private final HeroRepository heroRepository;
    private final DataSource dataSource;

    @Autowired
    public HeroTestData(HeroRepository heroRepository, DataSource dataSource) {
        this.heroRepository = heroRepository;
        this.dataSource = dataSource;
    }

    @PostConstruct
    public void initTestData() {
        heroRepository.save(new Hero("superman", 10));
        heroRepository.save(new Hero("batman", 5));
        heroRepository.save(new Hero("Сусанин", 100));
    }

    @PostConstruct
    public void initTestDataInOldFashionWay() {
        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Hero (id, name, rating) VALUES (4, 'Joker', 3)");
        } catch (SQLException e) {
            log.error("Failed to init test DB data in old fashion way", e);
        }
    }
}
