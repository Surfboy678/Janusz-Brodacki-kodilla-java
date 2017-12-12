package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.OldBook;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.bookclasifier.MedianAdapter;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian(){
        //Given
        Set<OldBook> oldBooksList = new HashSet<>();
        oldBooksList.add(new OldBook("Author1", "Title1", 1971, "647492"));
        oldBooksList.add(new OldBook("Author2", "Title2", 2010, "563947"));
        oldBooksList.add(new OldBook("Author3", "Title3", 1997, "93783894"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(oldBooksList);

        System.out.println( median);
        //Then
        assertEquals(median, 647492,0);
    }

}

