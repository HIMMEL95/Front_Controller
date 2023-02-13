package org.example.mvc;

import org.example.mvc.Controller.Controller;
import org.example.mvc.Controller.Homecontroller;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {

    // key : /users, value : UserController
    private Map<String, Controller> mappings = new HashMap<>();

    void init() {
        mappings.put("/", new Homecontroller());
    }

    public Controller findHandler(String uriPath) {
        return mappings.get(uriPath);
    }
}
