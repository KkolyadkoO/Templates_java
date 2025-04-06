package lab5.task2;

class Exhibit implements MuseumComponent {
    private String name;
    private String description;

    public Exhibit(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void display() {
        System.out.println("Экспонат: " + name + " - " + description);
    }

    @Override
    public void add(MuseumComponent component) {
        throw new UnsupportedOperationException("Нельзя добавить к экспонату");
    }

    @Override
    public void remove(MuseumComponent component) {
        throw new UnsupportedOperationException("Нельзя удалить из экспоната");
    }
}

