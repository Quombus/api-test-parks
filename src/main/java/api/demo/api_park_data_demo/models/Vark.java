package api.demo.api_park_data_demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Vark {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    public Vark(String name, String desc) {
        this.name = name;
        this.description = desc;
    }
}
