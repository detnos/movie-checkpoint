package com.galvanize.Movie;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Movie {
    @JsonProperty("Title")
    @JsonAlias({"title"})
    private String title = "";
    @JsonProperty("Minutes")
    @JsonAlias({"minutes"})
    private int minutes = 0;
    @JsonProperty("Genre")
    @JsonAlias({"genre"})
    private String genre = "";
    @JsonProperty("Rating")
    @JsonAlias({"rating"})
    private double rating = 0.0;
    @JsonProperty("Metascore")
    @JsonAlias({"metascore"})
    private int metascore = 0;
    @JsonProperty("Description")
    @JsonAlias({"description"})
    private String description = "";
    @JsonProperty("Votes")
    @JsonAlias({"votes"})
    private int votes = 0;
    @JsonProperty("Gross")
    @JsonAlias({"gross"})
    private double gross = 0.00;
    @JsonProperty("Year")
    @JsonAlias({"year"})
    private String year = "";
    @JsonProperty("Credits")
    @JsonAlias({"credits"})
    private List<Credit> credits;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getMetascore() {
        return metascore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    static class Credit {
        @JsonProperty("Person")
        @JsonAlias({"person"})
        private Person person;

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }
    }

    static class Person {
        @JsonProperty("Role")
        @JsonAlias({"role"})
        private String role = "";
        @JsonProperty("FirstName")
        @JsonAlias({"firstName", "firstname"})
        private String firstName = "";
        @JsonProperty("LastName")
        @JsonAlias({"lastName", "lastname"})
        private String lastName = "";

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    static class GrossTotal {
        private int result;

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }
    }
}
