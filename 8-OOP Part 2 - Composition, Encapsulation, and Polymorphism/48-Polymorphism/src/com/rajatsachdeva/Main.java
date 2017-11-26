package com.rajatsachdeva;

// Polymorphism: This allows actions to act differently based on type of object
// or we can say action can be different depending on whom the action
// is being done.

import com.sun.java.swing.plaf.motif.MotifBorders;

// Base class
class Movie {
    private String movie;

    public Movie(String movie) {
        this.movie = movie;
    }

    public String plot() {
        return "No plot here";
    }

    public String getMovie() {
        return movie;
    }
}

// Jaws is-a Movie
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot () {
        return "A shark eats lots of people";
    }
}

// IndependenceDay is-a Movie
class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

// MazeRunner is-a Movie
class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

// StarWars is-a Movie
class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over universe.";
    }
}

// Not an actual movie name, but still extends from Movie
class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println(String.format("Movie#%d: %s\nPlot:  %s\n", i, movie.getMovie(), movie.plot()));
        }
    }

    public static Movie randomMovie() {
        //generate a random number
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                System.out.println("Jaws selected");
                return new Jaws();

            case 2:
                System.out.println("Independence Day selected");
                return new IndependenceDay();

            case 3:
                System.out.println("Maze runner selected");
                return new MazeRunner();

            case 4:
                System.out.println("Star wars selected");
                return new StarWars();

            case 5:
                System.out.println("Forgetable selected");
                return new Forgetable();

            default:
                System.out.println("Don't how it come to this !");
                return  null;
        }
    }
}