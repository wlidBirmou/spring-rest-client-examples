package guru.springframework.api.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Geo {

    private Double lat;
    private Double lng;
}
