package nodomain.stswoon.lectures.js.performance;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    private static final int BROWSER_CACHE_CONTROL = 604800; //one week

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/lesson4/**")
                .addResourceLocations("classpath:/static/lesson4/")
                .setCachePeriod(BROWSER_CACHE_CONTROL);
    }
}