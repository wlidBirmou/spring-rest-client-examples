package guru.springframework.api.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Comment {

    private Long id;
    private Long postId;
    private String name;
    private String email;
    private String body;
}
