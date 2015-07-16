package com.samson.dropwizard.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by lixiaopeng on 2015/7/15.
 */
public class TemplateHealthCheck extends HealthCheck {
    private final String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String check = String.format(template,"sampson");
        if (!check.contains("sampson")) {
            return Result.unhealthy("NoSuch sampson template....");
        }
        return Result.healthy();
    }
}
