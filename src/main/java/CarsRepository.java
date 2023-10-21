import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ak.entity.Cars;
@Repository
public interface CarsRepository extends JpaRepository<Cars,Integer> {

}
