package ricardo.fellini.librarycontrol.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ricardo.fellini.librarycontrol.domain.Author;
import ricardo.fellini.librarycontrol.requests.AuthorPostRequestBody;

@Mapper(componentModel = "spring")
public abstract class AuthorMapper {

    public static final AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    public abstract Author toAuthor(AuthorPostRequestBody authorPostRequestBody);

    //TODO PUT
}
