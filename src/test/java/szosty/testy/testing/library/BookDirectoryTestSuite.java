package szosty.testy.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Test
    public void testBooksWithConditionReturnList() {
        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultList = new ArrayList<>();
        Book book1 = new Book("Secrets", "John", 2000);
        Book book2 = new Book("Secrets", "Ahn", 2001);
        Book book3 = new Book("Secrets", "JBgfn", 2019);
        Book book4 = new Book("Secrets", "Pkahn", 2020);

        resultList.add(book1);
        resultList.add(book2);
        resultList.add(book3);
        resultList.add(book4);

        when(libraryDatabaseMock.listBookWithCondition("Secrets")).thenReturn(resultList);

        //when
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secrets");

        //then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBookWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBookWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBookWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBookWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBookWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfWhen0() {
        //given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        User user = new User("jon", "snow", "123");
        //when
        List<Book> listOfUserOne = bookLibrary.listBooksInHandsOf(user);
        //then
        Assert.assertTrue(listOfUserOne.size() == 0);
    }

    @Test
    public void testListBooksInHandsOfWhenHasOneBook() {
        //given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        User user = new User("Adam", "Smith", "345");
        ArrayList<Book> listWithOneBook = new ArrayList<>();
        listWithOneBook.add(new Book("1", "Lem", 1999));
        when(libraryDatabase.listBooksWithHandsOf(user)).thenReturn(listWithOneBook);

        //when
        List<Book> listOfUser = bookLibrary.listBooksInHandsOf(user);
        //then
        Assert.assertEquals(listWithOneBook, listOfUser);
    }

    @Test
    public void testListBookInHandsOfWhen5BooksRented() {
        //given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        User user = new User("Kim", "Kardashian", "1223");
        List<Book> listOfFive = generateListOfNBooks(5);
        when(libraryDatabase.listBooksWithHandsOf(user)).thenReturn(listOfFive);
        //when
        List<Book> listOfUser = bookLibrary.listBooksInHandsOf(user);
        //then
        Assert.assertEquals(listOfFive, listOfUser);
    }

}
