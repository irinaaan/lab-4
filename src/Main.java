public class Main {

    public static void main(String[] args) {
        RightTriangle tr1 = new RightTriangle();
        RightTriangle tr2 = new RightTriangle(4, 5);
        tr1.printInfo();
        tr2.printInfo();

        Circle circle = new Circle(4, 5, 3);
        System.out.println("");
        circle.printInfo();

        Book[] book = new Book[3];
        book[0] = new Book("Harry Potter", "J.K. Rowling",1997, 500,  1);
        book[1] = new Book("The Adventures of Tom Sawyer", "Mark Twain", 1876, 400,  1);
        book[2] = new Book("War and Peace", "L. N. Tolstoy", 1873, 300,  1);
        System.out.println("");

        for (Book b : book) {
            b.printInfo();
        }

        for (Book b : book) {
            b.changeAmount();
        }

        for (Book b : book) {
            b.considerPrice();
        }
        System.out.println("");

        for (Book b : book) {
            b.printInfo();
        }

        Student[] st = new Student[3];
        st[0] = new Student("Cracker", "Carl", 1, 123, 3);
        st[1] = new Student("Hacker", "Harry", 2, 124, 4);
        st[2] = new Student("Tester", "Tony", 1, 125, 5);
        System.out.println("");

        for (Student s : st) {
            s.nextCourse();
        }

        for (Student s : st) {
            s.printInfo();
        }

        for (Student s : st) {
            s.changeAverage();
        }
        System.out.println("");

        for (Student s : st) {
            s.printInfo();
        }
    }
}