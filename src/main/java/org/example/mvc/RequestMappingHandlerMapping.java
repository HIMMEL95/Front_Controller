package org.example.mvc;

import org.example.mvc.Controller.Controller;
import org.example.mvc.Controller.Homecontroller;
import org.example.mvc.Controller.UserListController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {

    // key : /users, value : UserController
    private Map<String, Controller> mappings = new HashMap<>();

    void init() {
        mappings.put("/", new Homecontroller());
        mappings.put("/users", new UserListController());
    }

    public Controller findHandler(String uriPath) {
        return mappings.get(uriPath);
    }
}
