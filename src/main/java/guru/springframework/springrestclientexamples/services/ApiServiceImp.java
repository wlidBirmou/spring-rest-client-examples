package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import lombok.AllArgsConstructor;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;

@Service
public class ApiServiceImp implements  ApiService{

    private RestTemplate restTemplate;
    private final String API_URL;

    public ApiServiceImp(RestTemplate restTemplate, @Value("${api.url}") String API_URL) {
        this.restTemplate = restTemplate;
        this.API_URL = API_URL;
    }

    @Override
    public List<User> getUsers() {
        UriComponentsBuilder builder=UriComponentsBuilder.fromUriString(this.API_URL);
        ResponseEntity<User[]> responseEntity= this.restTemplate.getForEntity(builder.toUriString(),User[].class);
        return Arrays.asList(responseEntity.getBody());
    }
}
