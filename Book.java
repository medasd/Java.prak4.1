public class Book {
    // Поля класса
    private String title;
    private String author;
    private double price;

    // Конструктор для инициализации полей
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Геттеры для получения значений полей
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Метод для вывода информации о книге
    public void displayInfo() {
        System.out.println("Название: " + title + ", Автор: " + author + ", Цена: " + price);
    }
}
