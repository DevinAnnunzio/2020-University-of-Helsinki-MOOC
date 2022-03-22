/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Book {

    String title;
    int pageNum;
    int pubYear;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, int pageNum) {
        this.title = title;
        this.pageNum = pageNum;
    }

    public Book(String title, int pageNum, int pubYear) {
        this.title = title;
        this.pageNum = pageNum;
        this.pubYear = pubYear;
    }

    public String everything() {
        return title + ", " + pageNum + " pages" + ", " + pubYear;
    }

    public String bookTitle() {
        return title;
    }

}
