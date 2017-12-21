package com.kodilla.patterns2.adapter.bookclasifier.librarya.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.OldBook;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<OldBook> oldBookSet) {
        Map<BookSignature, Book> books = new HashMap<>();

        for (OldBook b : oldBookSet) {
            books.put(new BookSignature(b.getSignature()), new Book(b.getAuthor(), b.getTitle(), b.getPublicationYear()));
        }
        System.out.println(books.toString());
        return avaragePublicationYear(books);
    }
}*/