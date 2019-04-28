package agile.wars.hackathon.repository;

import agile.wars.hackathon.data.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository <Item, Long> {
}
