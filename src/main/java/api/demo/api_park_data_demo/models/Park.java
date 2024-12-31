package api.demo.api_park_data_demo.models;





import api.demo.api_park_data_demo.models.nps_data_fields.ParkImage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Park {

    @Id
    @Column(unique = true)
    private String parkCode;

    @Transient
    @JsonInclude
    private String url;
    private String fullName;
    @Transient
    @JsonInclude
    private String description;
    @Transient
    @JsonInclude
    private String latitude;
    @Transient
    @JsonInclude
    private String longitude;
    @Transient
    @JsonInclude
    private String latLong;
    private String states;
    @Transient
    @JsonInclude
    private List<ParkImage> images;


}
