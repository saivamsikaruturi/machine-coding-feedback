package bookmyshow;


import java.util.Date;


class Movie {
    private Integer movieId;
    private String movieName;
    private String title;
    private String genre;
    private int duration; // Duration in minutes
    private Date releaseDate;


    // Constructors, getters, and setters


    public Movie() {
    }

    public Movie(int duration, String genre, Integer movieId, String movieName, Date releaseDate, String title) {
        this.duration = duration;
        this.genre = genre;
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}