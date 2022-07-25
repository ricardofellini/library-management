package ricardo.fellini.librarycontrol.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ricardo.fellini.librarycontrol.enums.Language;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;

    @Column(name = "pages", length = 10, nullable = false)
    private int pages;

    @Column(name = "isbn", length = 50, nullable = false, unique = true)
    private String isbn;

    @Column(name = "dateAdded", nullable = false)
    private LocalDateTime dateAdded;

    @Column(name = "dateLastReserved")
    private LocalDateTime dateLastReserved;

    @Enumerated(EnumType.STRING)
    private Language language;

    //TODO para buscar do editor, assim podemos cadastrar editores e filtrar quando precisar
    private String publisher;

    //TODO para cadastrar autor separado, dessa forma evita duplicacao de autor no banco de dados
    private String author;

    @Column(name = "datePublished", nullable = false)
    private Date datePublished;

    private String urlImage;

    //TODO verificar o cadastro de generos aqui tbm
    private String category;

}
