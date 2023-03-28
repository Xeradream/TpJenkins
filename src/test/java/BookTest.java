
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tpJenkins.exercice1.Book;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BookTest {

    public static Stream<Arguments> getBook() {
        return Stream.of(
                Arguments.of("title1"),
                Arguments.of("title2"),
                Arguments.of("title3")
        );
    }

    @ParameterizedTest
    @MethodSource("getBook")
    void testGetTitle(String titre) {
        Book b = new Book();
        b.setTitle("titre1");
        b.setAuthor("auteur1");
        b.setPublicationDate("12/05/2005");
        assertEquals("titre1", b.getTitle());
    }

    @Test
    void testGetAuthor(Book book, String expectedAuthor) {
        Book b = new Book();
        b.setTitle("titre1");
        b.setAuthor("auteur1");
        b.setPublicationDate("12/05/2005");
        assertEquals("auteur1", b.getAuthor());
    }


    @Test
    void testGetPublicationDate(Book book, LocalDate expectedPublicationDate) {
        Book b = new Book();
        b.setTitle("titre1");
        b.setAuthor("auteur1");
        b.setPublicationDate("12/05/2005");
        assertEquals("12/05/2005", b.getPublicationDate());
    }
}
