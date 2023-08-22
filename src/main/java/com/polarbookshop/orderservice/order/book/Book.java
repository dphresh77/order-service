package com.polarbookshop.orderservice.order.book;

public record Book(
        String isbn,
        String title,
        String author,
        Double price
) {
}
