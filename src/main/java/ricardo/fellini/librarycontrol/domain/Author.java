package ricardo.fellini.librarycontrol.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    //Unique = true depois, em PRD
    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dateAdded;

    public Author (String name){
        this.name = name;
    }
}
