import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String author;
    private String genre;
    private double rating;

    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}

class BookRecommendation {
    private String title;
    private double rating;

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
}

public class BookRecommendations {
	public static List<BookRecommendation> getPaginatedBooks(List<Book> books, int pageNumber) {
        
        List<BookRecommendation> recommendations = books.stream()
                .filter(book -> "Science Fiction".equals(book.getGenre()) && book.getRating() > 4.0)
                .map(book -> new BookRecommendation(book.getTitle(), book.getRating()))  
                .sorted(Comparator.comparingDouble(BookRecommendation::getRating).reversed())  
                .limit(10)  
                .collect(Collectors.toList());

      
        int startIndex = (pageNumber - 1) * 5;
        int endIndex = Math.min(startIndex + 5, recommendations.size());

        return recommendations.subList(startIndex, endIndex);
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Dune", "Frank Herbert", "Science Fiction", 4.8));
        books.add(new Book("Foundation", "Isaac Asimov", "Science Fiction", 4.6));
        books.add(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "Science Fiction", 4.5));
        books.add(new Book("1984", "George Orwell", "Dystopian", 4.7));
        books.add(new Book("Brave New World", "Aldous Huxley", "Dystopian", 4.4));
        books.add(new Book("Neuromancer", "William Gibson", "Science Fiction", 4.9));
        books.add(new Book("Snow Crash", "Neal Stephenson", "Science Fiction", 4.7));
        books.add(new Book("The Left Hand of Darkness", "Ursula K. Le Guin", "Science Fiction", 4.3));
        books.add(new Book("The Dispossessed", "Ursula K. Le Guin", "Science Fiction", 4.4));
        
        System.out.println("\nBookRecommendation List of Science Fiction and rating is greater than 4 :\\n========== ");
        books.stream().filter(x->(x.getGenre().equals("Science Fiction") && (x.getRating()>4))).forEach(x->System.out.println(x.getTitle() + " -- "+ x.getGenre() + " -- "+x.getRating()));
       
        System.out.println("\n==========\nNew BookRecommendation List\n==========");
        List<BookRecommendation> br = books.stream().map(x-> new BookRecommendation(x.getTitle(),x.getRating())).collect(Collectors.toList());
        br.forEach(x->System.out.println(x.getTitle() + " -- " + x.getRating()));
        
        System.out.println("\n==========\nSorted order\n==========");
        br.stream().sorted(Comparator.comparingDouble(BookRecommendation :: getRating).reversed()).forEach(x->System.out.println(x.getTitle() + " -- " + x.getRating()));
        
        System.out.println("\n=========\nPaginated Result\n==========");
        List<BookRecommendation> page1Books = getPaginatedBooks(books, 1);
        System.out.println("Top Books (Page 1):");
        page1Books.forEach(book -> System.out.println("Title: " + book.getTitle() + ", Rating: " + book.getRating()));
    }
}
