package szosty.testy.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3)
            return bookList;

        List<Book> resultList = libraryDatabase.listBookWithCondition(titleFragment);
        if (resultList.size() > 20)
            return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf (User user) {
        return libraryDatabase.listBooksWithHandsOf(user);
    }

}


