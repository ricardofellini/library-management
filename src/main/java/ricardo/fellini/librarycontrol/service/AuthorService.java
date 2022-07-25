package ricardo.fellini.librarycontrol.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ricardo.fellini.librarycontrol.domain.Author;
import ricardo.fellini.librarycontrol.mapper.AuthorMapper;
import ricardo.fellini.librarycontrol.repository.AuthorRepository;
import ricardo.fellini.librarycontrol.requests.AuthorPostRequestBody;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;


    public Page<Author> listAll(Pageable pageable){
        return authorRepository.findAll(pageable);

    }

    @Transactional
    public Author save(AuthorPostRequestBody authorPostRequestBody){
        return  authorRepository.save(AuthorMapper.INSTANCE.toAuthor(authorPostRequestBody));
    }
}
