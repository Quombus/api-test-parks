package api.demo.api_park_data_demo.models.nps_data_fields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "images")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParkImage {

    private int id;


    private String url;
    private String credit;
    private String title;

}
