public class Book {
    private String title;
    private String author;
    private int year;
    private double price;
    private double amount;
    private Book[] book;

    public Book(String title, String author, int year, double price, double amount) { //constructor
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.amount = amount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String Author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double changeAmount() { //raise quantity per piece
        return amount++;
    } //change amount to 1

    public double considerPrice() { //we consider the price
        double newPrice = price * amount;
        return newPrice;
    }

    public double totalSumOfBooks() { //sum of all books
       double sum = 0;
       for (int i = 0; i < 3; i++) {
           sum = sum + book[i].considerPrice();
       }
       return sum;
    }

    public void printInfo() { //book info
        System.out.println("Title: " + getTitle() + ". Author: " + getAuthor() + ". Year: " + getYear() + ". Price: " + getPrice() + ". Amount: " + getAmount());
    }
}