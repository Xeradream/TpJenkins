package Book;

import java.util.Date;

public class Book {
    String titre;
    String auteur;
    Date publication;

    public Book(String titre, String auteur, Date publication) {
        this.titre = titre;
        this.auteur = auteur;
        this.publication = publication;
    }

    public String getTitle() {
        return titre;
    }

    public String getAuthor() {
        return auteur;
    }

    public Date getPublished() {
        return publication;
    }

    public void setTitle(String title) {
        this.titre = title;
    }

    public void setAuthor(String author) {
        this.auteur = author;
    }

    public void setPublished(Date published) {
        this.publication = published;
    }

    public String toString() {
        return "Title: " + titre + ", Author: " + publication + ", Published: " + publication;
    }
}


