package api.demo.api_park_data_demo.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Park {

    @Id
    @GeneratedValue
    private String id;


    private String name;
    private String description;
    private String url;
    private ArrayList<Image> images;

    @JsonIgnore
    public String getId() {
        return id;
    }
}