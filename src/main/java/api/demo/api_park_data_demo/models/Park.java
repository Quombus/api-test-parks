package api.demo.api_park_data_demo.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Park {
    private String name;
    private String description;
    private String url;

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}