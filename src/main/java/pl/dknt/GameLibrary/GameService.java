package pl.dknt.GameLibrary;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GameService {
    List<Game> getAllGames();
}
