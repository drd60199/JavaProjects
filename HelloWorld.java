import java.time.LocalDate;

class Main {
    public static void main(String[]args) {
       User user = new User("Damien", "1995-01-31");
       
    

       Book book = new Book();

       book.title = "Carmilla";
       book.author = "Sheridan Le Fanu";

       user.borrow(book);

       System.out.printf("%s was born back in %s and he is now %d years old. \n",
       user.getName(), user.getBirthDay(), user.age());

        System.out.printf("%s has borrowed these books: %s \n", user.getName(), user.borrowedBooks());
    }
}