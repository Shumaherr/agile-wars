package agile.wars.hackathon.data;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name ="user")
@EqualsAndHashCode(of = "id")
@Setter
@Getter
@NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;


}
