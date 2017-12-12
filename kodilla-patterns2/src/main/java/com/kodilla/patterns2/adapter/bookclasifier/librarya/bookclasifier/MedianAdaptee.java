package com.kodilla.patterns2.adapter.bookclasifier.librarya.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int  avaragePublicationYear(Map<BookSignature, Book> books){
        Statistics statistics = new Statistics();
        return statistics.avaragePublicationYear(books);
    }
    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books){
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
