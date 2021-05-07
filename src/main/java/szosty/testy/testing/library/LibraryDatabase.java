package szosty.testy.testing.library;

import java.util.List;

public interface LibraryDatabase {

    List<Book> listBookWithCondition(String titleFragment);

    List<Book> listBooksWithHandsOf(User user);

    boolean rentABook(User user, Book book);

    int returnBooks(User user);
}
