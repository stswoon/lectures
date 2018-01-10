package com.netcracker.education.hero;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class HeroController {
    private final HeroRepository heroRepository;

    @Autowired
    public HeroController(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @RequestMapping(value = "/heroes/lite", method = RequestMethod.GET)
    public List<Hero> get() {
        List<Hero> result = new ArrayList<>();
//        for (Iterator<Hero> it = heroRepository.findAll().iterator(); it.hasNext();) {
//            result.add(it.next());
//        }
        heroRepository.findAll().forEach(hero -> result.add(hero));
//        heroRepository.findAll().forEach(result::add);
        return result;
    }

    //Use different name because if use '/heroes' it overrides all standard rest-points
    @RequestMapping(value = "/heroesUniqueCreate", method = RequestMethod.POST)
    public void create(@RequestBody Hero hero) {
        Hero duplicate = heroRepository.findByName(hero.getName());
        if (duplicate != null) {
            throw new RuntimeException("Found duplicate during creation");
        }
        heroRepository.save(hero);
    }

    @RequestMapping(value = "/heroes/{id}/{name}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id, @PathVariable String name) {
        log.info("Safe deleting hero with id='{}' and name='{}'", id, name);
        Hero hero = heroRepository.findOne(id);
        if (hero.getName().equals(name)) {
            heroRepository.delete(id);
        } else {
            throw new RuntimeException("Input name doesn't equal to removing hero id");
        }
    }

    @RequestMapping(value = "/mainHeroes", method = RequestMethod.GET)
    public List<Hero> mainHero() {
        return heroRepository.findSupermanAndBatman();
    }
}
