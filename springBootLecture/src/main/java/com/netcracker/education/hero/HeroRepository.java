package com.netcracker.education.hero;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface HeroRepository extends PagingAndSortingRepository<Hero, Long> {
    Hero findByName(String name);

    @Query("select hero from Hero hero where hero.name = 'superman' or hero.name = 'batman'")
    List<Hero> findSupermanAndBatman();
}
