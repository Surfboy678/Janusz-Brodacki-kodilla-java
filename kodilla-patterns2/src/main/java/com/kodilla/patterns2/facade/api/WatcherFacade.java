package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WatcherFacade {
    public static final Logger LOGGER = LoggerFactory.getLogger(WatcherFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& target(object)")
    public void logEvent(Object object) {
        LOGGER.info("Processing order: " + object.getClass().getName());
    }
}
