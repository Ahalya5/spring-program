package com.book.artical.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "artical_ahalya")
public class ArticalDAO {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "book_name")
    private String bookName;

    @Column (name = "author_name")
    private String authorName;

    @Column (name = "price")
    private int price;

    @Column (name = "no_of_pages")
    private int noOfPages;
}
