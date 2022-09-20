package com.fdmgroup.Mockito;

import com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3.BookStore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CatalogueTest {

    Catalogue catalogue;

    @Mock
    ReadItemCommand readItemCommand;

    @Mock
    WriteItemCommand writeItemCommand;

    @Mock
    Basket basket;

    @Mock
    Book mockBook1,mockBook2,mockBook3,mockBook4,mockBook5;



    @BeforeEach
    void setUp() throws Exception{
        catalogue = new Catalogue(readItemCommand, writeItemCommand);
    }



    @Test
    void getAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {

        int sizeOfBookList = catalogue.getAllBooks().size();
        assertEquals(0,sizeOfBookList);
    }

    @Test
    void getAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
        catalogue.getAllBooks();
        verify(readItemCommand,times(1)).readAll();
    }

    @Test
    void getAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodsOfReadItemCommand_WhenCalled(){
        List<Book> mockBook = new ArrayList<>();
        mockBook.add(mockBook1);
        mockBook.add(mockBook2);
        mockBook.add(mockBook3);
        when(readItemCommand.readAll()).thenReturn(mockBook);

        List<Book> mockBookGetAll = catalogue.getAllBooks();
        assertEquals(mockBook,mockBookGetAll);
    }


    //Test5
    @Test
    void UserAddsMultipleBooksNewMethodAddBooKsWhenMethodCalledInsertItemOfWriteCommandShouldBeCalledNTimes(){
        List<Book> multipleBooks = new ArrayList<>(Arrays.asList(mockBook1,mockBook2,mockBook3,mockBook4,mockBook5));
        //when(catalogue.addBooks(multipleBooks)).thenReturn()
        catalogue.addBooks(multipleBooks);
        verify(writeItemCommand,times(5)).insertItem(any(Book.class));
    }

    //Test6

}
