import java.util.Scanner;

class Library {
    String bookName;
    String author;
    int pages;
    float price;
}

public class ELibraryManagement {
    public static void main(String[] args) {
        Library[] lib = new Library[100];
        String authorName,bookName;
        int input, count = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < lib.length; i++) {
            lib[i] = new Library();
        }
        while (true) {
            System.out.println("\n\n*###### WELCOME TO E-LIBRARY ######*");
            System.out.println("\n1. Add book information");
            System.out.println("2. Display book information");
            System.out.println("3. List all books of a given author");
            System.out.println("4. List the count of books in the library");
            System.out.println("5. Exit");
            System.out.print("\nEnter one of the above options: ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.print("Enter book name: ");
                    lib[count].bookName = scanner.next();
                    System.out.print("Enter author name: ");
                    lib[count].author = scanner.next();
                    System.out.print("Enter pages: ");
                    lib[count].pages = scanner.nextInt();
                    System.out.print("Enter price: ");
                    lib[count].price = scanner.nextFloat();
                    count++;
                    break;
                case 2:
                    System.out.println("You have entered the following information:");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Book name: " + lib[i].bookName +
                                "\tAuthor: " + lib[i].author +
                                "\tPages: " + lib[i].pages +
                                "\tPrice: " + lib[i].price);
                    }
                    break;
                case 3:
                    System.out.print("Enter author name: ");
                    authorName = scanner.next();
                    for (int i = 0; i < count; i++) {
                        if (authorName.equals(lib[i].author)) {
                            System.out.println(lib[i].bookName + " by " + lib[i].author +
                                    " (" + lib[i].pages + " pages, $" + lib[i].price + ")");
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nNumber of books in the library: " + count);
                    break;
                case 5:
                    System.out.println("Exiting E-Library Management System. Have a great day!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}