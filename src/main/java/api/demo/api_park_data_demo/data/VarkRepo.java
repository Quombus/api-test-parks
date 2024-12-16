package api.demo.api_park_data_demo.data;

import api.demo.api_park_data_demo.models.Vark;
import org.springframework.data.repository.CrudRepository;

public interface VarkRepo extends CrudRepository<Vark, Integer> {
}
