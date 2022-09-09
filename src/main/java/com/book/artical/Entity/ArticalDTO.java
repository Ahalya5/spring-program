package com.book.artical.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticalDTO {
    private int id;
    private String bookName;
    private String authorName;
    private int price;
    private int noOfPages;
}
