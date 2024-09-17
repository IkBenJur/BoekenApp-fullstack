package Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication()
@RestController
public class Main {

    @Autowired
    private BoekRepository boekRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/boeken")
    @CrossOrigin
    public List<Boek> getBooks(){
        return (List<Boek>) boekRepository.findAll();
    }

    @PostMapping(path = "/boek")
    @CrossOrigin
    public @ResponseBody String addNewBook(@RequestParam String titel, @RequestParam String auteur, @RequestParam int aantalExemplaren, @RequestParam String afbeeldingURL) {
        Boek n = new Boek();
        n.setTitle(titel);
        n.setAuthor(auteur);
        n.setAantalExemplaren(aantalExemplaren);
        n.setAfbeeldingURL(afbeeldingURL);
        boekRepository.save(n);
        return "Created new book with title: " + n.getTitle() + " from author: " + n.getAuthor();
    }


    @PostMapping(path = "/boeken")
    @CrossOrigin
    public @ResponseBody String addNewBooks(@RequestBody List<Boek> boeken) {
        for (Boek boek : boeken) {
            Boek n = new Boek();
            n.setTitle(boek.getTitle());
            n.setAuthor(boek.getAuthor());
            n.setAantalExemplaren(boek.getAantalExemplaren());
            n.setAfbeeldingURL(boek.getAfbeeldingURL());
            boekRepository.save(n);
        }

        return "Created " + boeken.size() + " new books";
    }
}
