package guru.springframework.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {

    private Long id;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;


}
