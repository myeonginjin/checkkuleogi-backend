package com.Familyship.checkkuleogi.domains.book.implementation.mapper;

import com.Familyship.checkkuleogi.domains.book.jpa.Book;
import com.Familyship.checkkuleogi.domains.book.dto.response.BookResponse;
import org.springframework.stereotype.Component;

@Component
public class BookDtoMapper {
    public BookResponse toBookResp(Book book) {
        return new BookResponse(book.getIdx(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublisher(),
                book.getSummary(),
                book.getContent(),
                book.getMbti(),
                null);
    }
}
