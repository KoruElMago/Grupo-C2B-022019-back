package unq.dapp.viandaslagauchita.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Viand {

    private @Id
    @GeneratedValue
    Long id;
    private @NonNull String name;
    private @NonNull String description;

}