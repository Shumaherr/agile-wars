package agile.wars.hackathon.data;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="useritemtmp")
@EqualsAndHashCode(of = "id")
@Setter
@Getter
@NoArgsConstructor
public class UserItemTmp {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User userid;

    @ManyToOne
    @JoinColumn(name = "itemid")
    private Item itemid;
}
