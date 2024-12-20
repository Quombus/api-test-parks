package api.demo.api_park_data_demo.data;

import api.demo.api_park_data_demo.models.Park;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ParkRepository extends CrudRepository<Park, String> {
}
