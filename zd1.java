public class zd1 {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "Джордж Оруэлл", 299.9);
        Book book2 = new Book("Война и мир", "Лев Толстой", 499.5);
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков", 350);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
