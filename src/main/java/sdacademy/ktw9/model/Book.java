package sdacademy.ktw9.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Book {

    private String name;
    private Boolean isAvialable;
    private Author author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvialable() {
        return isAvialable;
    }

    public void setAvialable(Boolean avialable) {
        isAvialable = avialable;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
