package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class LibraryTestSuite {
    @Test
    public void testGetBook() {
       Book book = new Book("Title 1", "Author 1", LocalDate.of(2013,7, 3));
       Book book1 = new Book("Title 2", "Author 2", LocalDate.of(2013, 5, 2));
       Book book2 = new Book("Title 3", "Author 3", LocalDate.of(2000, 11, 7));

       Library library = new Library("Library");
       library.getBooks().add(book);
       library.getBooks().add(book1);
       library.getBooks().add(book2);

        //making a shallow copy of object board
       Library clonedLibrary = null;
       try {
           clonedLibrary = library.shallowCopy();
           clonedLibrary.setName("Library nr.1");
       }catch (CloneNotSupportedException e){
           System.out.println(e);
       }

        //making a deep copy of object board
       Library deepClonedLibrary = null;
       try {
           deepClonedLibrary = library.deepCopy();
           deepClonedLibrary.setName("Library nr.3");
       }catch (CloneNotSupportedException e){
           System.out.println(e);
       }

       //When
        library.getBooks().remove(book);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,clonedLibrary.getBooks().size());
        Assert.assertEquals(3,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());

    }
}
