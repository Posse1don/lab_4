package org.example;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void showConfiguration() {
        System.out.println("Computer Configuration:");
        components.forEach(component -> System.out.println(component.getDescription()));
    }

    public List<Component> getComponents() {
        return components;
    }
}

