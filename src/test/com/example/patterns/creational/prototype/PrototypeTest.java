package com.example.patterns.creational.prototype;

import com.example.patterns.creational.propotype.Copyable;
import com.example.patterns.creational.propotype.Movie;
import com.example.patterns.creational.propotype.MovieFactory;
import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void testCopy() {
        Movie movie = new Movie("Spider-man", "Sam Raimi", "the courier who saved the city");
        Copyable<Movie> copyable = new MovieFactory(movie);
        Movie copy = copyable.copy();
        Assert.assertEquals(movie.toString(), copy.toString());
    }
}
