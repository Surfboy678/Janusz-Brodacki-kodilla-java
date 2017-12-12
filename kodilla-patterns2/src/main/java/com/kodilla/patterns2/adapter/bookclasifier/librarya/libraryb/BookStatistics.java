package com.kodilla.patterns2.adapter.bookclasifier.librarya.libraryb;

import java.util.Map;

public interface BookStatistics {
    int avaragePublicationYear(Map<BookSignature, Book> books);
    int medianPublicationYear(Map<BookSignature, Book> books);
}