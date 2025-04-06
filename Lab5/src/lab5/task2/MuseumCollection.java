package lab5.task2;

import java.util.ArrayList;
import java.util.List;

class MuseumCollection implements MuseumComponent {
    private String name;
    private List<MuseumComponent> components = new ArrayList<>();

    public MuseumCollection(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("\nКоллекция: " + name);
        System.out.println("----------------------");
        for (MuseumComponent component : components) {
            component.display();
        }
    }
    @Override
    public void add(MuseumComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MuseumComponent component) {
        components.remove(component);
    }
}

