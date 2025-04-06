package lab5.task2;

public class MuseumCompositeDemo {
    public static void main(String[] args) {
        MuseumComponent painting1 = new Exhibit("Мона Лиза", "Картина Леонардо да Винчи");
        MuseumComponent painting2 = new Exhibit("Звездная ночь", "Картина Ван Гога");
        MuseumComponent sculpture1 = new Exhibit("Давид", "Скульптура Микеланджело");
        MuseumComponent artifact1 = new Exhibit("Розеттский камень", "Древний артефакт");

        MuseumCollection paintings = new MuseumCollection("Картины");
        paintings.add(painting1);
        paintings.add(painting2);

        MuseumCollection sculptures = new MuseumCollection("Скульптуры");
        sculptures.add(sculpture1);

        MuseumCollection ancient = new MuseumCollection("Древние артефакты");
        ancient.add(artifact1);

        MuseumCollection mainCollection = new MuseumCollection("Основная коллекция музея");
        mainCollection.add(paintings);
        mainCollection.add(sculptures);
        mainCollection.add(ancient);

        MuseumComponent specialExhibit = new Exhibit("Особый экспонат", "Очень редкий предмет");
        mainCollection.add(specialExhibit);

        System.out.println("Полная коллекция музея:");
        mainCollection.display();

        System.out.println("\nПосле удаления скульптур:");
        mainCollection.remove(sculptures);
        mainCollection.display();
    }
}
