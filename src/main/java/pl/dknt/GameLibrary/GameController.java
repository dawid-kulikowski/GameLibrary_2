package pl.dknt.GameLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("gamesList",gameService.getAllGames());
        return "index";
    }
    }
