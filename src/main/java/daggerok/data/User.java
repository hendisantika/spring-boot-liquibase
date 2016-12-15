package daggerok.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class User {

    @Id @GeneratedValue Long id;
    @NotNull String username;
    String email;
}
