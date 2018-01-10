package com.netcracker.education;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netcracker.education.hero.Hero;
import com.netcracker.education.hero.HeroRepository;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class NcLessonsSpringBoot2017ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private HeroRepository heroRepository;

    @Test
    public void createHero() throws Exception {
        Hero hero = new Hero("test", 0);
        String requestBody = saveRequestJsonString(hero);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("/heroes")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody)
                //comment next line if security is disabled
                .with(user(new User("admin", "admin",
                        Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")))));


        ResultActions resultActions = mockMvc.perform(request);

        resultActions
                .andExpect((status().isCreated()))
                .andExpect(jsonPath("$.name", Matchers.is(hero.getName())));

        Hero heroFromRepo = heroRepository.findByName(hero.getName());
        Assert.assertNotNull(heroFromRepo);
    }

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private String saveRequestJsonString(Object object) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(object);
    }
}
