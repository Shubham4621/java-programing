public class Book {
    int id;
    String auth_name;
    String title;

    // Default Constructor
    Book() {
        System.out.println("\nDefault Constructor is invoked");
    }

    // Parameterized Constructor
    Book(int a, String b, String c) {
        this.id = a;
        this.auth_name = b;
        this.title = c;
    }

    // Copy Constructor
    Book(Book x) {
        this.id = x.id;
        this.auth_name = x.auth_name;
        this.title = x.title;
    }

    void display() {
        System.out.println("Book Details: " + id + ", " + auth_name + ", " + title);
    }

    public static void main(String[] args) {
        Book obj = new Book();
        Book obj1 = new Book(121, "Balagurusamy", "Java Programming");
        Book obj2 = new Book(obj1);

        obj1.display();
        obj2.display();
    }
}


