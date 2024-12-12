package api.demo.api_park_data_demo.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;

@Setter
@Getter
@NoArgsConstructor
public class Park {

    private String name;
    private String description;
    private String url;
    private ArrayList<Image> images;


}