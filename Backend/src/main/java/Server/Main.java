package Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication()
@RestController
public class Main {

    @Autowired
    private BoekRepository boekRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @PostMapping(path = "/boek")
    public @ResponseBody String addNewBook(@RequestParam String titel, @RequestParam String auteur, @RequestParam int aantalExemplaren, @RequestParam String afbeeldingURL) {
        Boek n = new Boek();
        n.setTitle(titel);
        n.setAuthor(auteur);
        n.setAantalExemplaren(aantalExemplaren);
        n.setAfbeeldingURL(afbeeldingURL);
        boekRepository.save(n);
        return "Created new book with title: " + n.getTitle() + " from author: " + n.getAuthor();
    }
}
