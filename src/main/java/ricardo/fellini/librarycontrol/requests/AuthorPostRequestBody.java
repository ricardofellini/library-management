package ricardo.fellini.librarycontrol.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorPostRequestBody {

    @NotEmpty(message = "Name cannot be empty.")
    @NotNull(message = "Name cannot be null.")
    private String name;

}
