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

    @OneToMany(mappedBy = "userid")
    private Set<UserItemTmp> userItemTmps;

}
