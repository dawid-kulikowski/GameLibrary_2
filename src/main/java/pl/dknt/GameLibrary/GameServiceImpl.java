package pl.dknt.GameLibrary;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameServiceImpl implements GameService{

    @Autowired
    private GameRepo gameRepo;

    @Override
    public List<Game> getAllGames() {
        return gameRepo.findAll();
    }
}
