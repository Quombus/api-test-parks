package api.demo.api_park_data_demo.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class NpsResponse {

    private String total;
    private String limit;
    private String start;
    private List<Park> data;
// url determines what is returned

}
