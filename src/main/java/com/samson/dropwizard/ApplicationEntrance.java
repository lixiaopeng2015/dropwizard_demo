package com.samson.dropwizard;

import com.samson.dropwizard.health.TemplateHealthCheck;
import com.samson.dropwizard.rest.TodoService;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lixiaopeng on 2015/7/9.
 */
public class ApplicationEntrance extends Application<ApplicationConfiguration>{

    private static Logger logger = LoggerFactory.getLogger(ApplicationEntrance.class);

    public static void main(String... args) {
        try {
            new ApplicationEntrance().run(args);
        } catch (Exception e) {
            logger.error("Application run exception....");
        }
    }

    @Override
    public String getName(){
        return "dropwizard";
    }

    @Override
    public void run(ApplicationConfiguration crawlerConfiguration, Environment environment) throws Exception {
        final TodoService todoServiceResource = new TodoService();
        final TemplateHealthCheck templateHealthCheck = new TemplateHealthCheck(crawlerConfiguration.getTemplate());
        environment.healthChecks().register("template",templateHealthCheck);
        environment.jersey().register(todoServiceResource);
    }
}
