package pl.dknt.GameLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GameServiceImpl implements GameService{

    @Autowired
    private GameRepo gameRepo;

    @Override
    public List<Game> getAllGames() {
        return gameRepo.findAll();

    }
}
