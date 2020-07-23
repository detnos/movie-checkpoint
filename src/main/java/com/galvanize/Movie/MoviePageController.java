package com.galvanize.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/movies")
public class MoviePageController {
    @GetMapping("/movie")
    public Movie movie() {
        Movie movie = new Movie();
        movie.setTitle("The Godfather");
        movie.setMinutes(175);
        movie.setGenre("Crime, Drama");
        movie.setRating(9.2);
        movie.setMetascore(100);
        movie.setDescription("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        movie.setVotes(1561591);
        movie.setGross(134.97);

        Movie.Credit c1 = new Movie.Credit();
        Movie.Person p1 = new Movie.Person();
        p1.setRole("Director");
        p1.setFirstName("Francis Ford");
        p1.setLastName("Copolla");
        c1.setPerson(p1);

        Movie.Credit c2 = new Movie.Credit();
        Movie.Person p2 = new Movie.Person();
        p2.setRole("Star");
        p2.setFirstName("Marlon");
        p2.setLastName("Brando");
        c2.setPerson(p2);

        Movie.Credit c3 = new Movie.Credit();
        Movie.Person p3 = new Movie.Person();
        p3.setRole("Star");
        p3.setFirstName("Al");
        p3.setLastName("Pacino");
        c3.setPerson(p3);

        Movie.Credit c4 = new Movie.Credit();
        Movie.Person p4 = new Movie.Person();
        p4.setRole("Star");
        p4.setFirstName("James");
        p4.setLastName("Caan");
        c4.setPerson(p4);

        Movie.Credit c5 = new Movie.Credit();
        Movie.Person p5 = new Movie.Person();
        p5.setRole("Star");
        p5.setFirstName("Diane");
        p5.setLastName("Keaton");
        c5.setPerson(p5);

        movie.setCredits(Arrays.asList(c1, c2, c3, c4, c5));

        return movie;
    }
}
