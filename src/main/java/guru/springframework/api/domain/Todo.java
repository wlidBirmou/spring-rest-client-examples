package guru.springframework.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Todo {

    private Long id;
    private Long userId;
    private String title;
    private Boolean completed;
}
