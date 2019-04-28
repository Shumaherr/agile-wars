package agile.wars.hackathon.data;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

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

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "sex")
    private String sex;

    @Column(name = "race")
    private String race;

    @Column(name = "level")
    private String level;

    @Column(name = "experience")
    private String experience;

    @Column(name = "money")
    private String money;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "UserItemTmp",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
    private Set<Item> item;

}
