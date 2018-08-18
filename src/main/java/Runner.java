import db.DBHelper;
import models.Film;
import models.Genre;
import models.Rating;
import models.Studio;

public class Runner {

    public static void main(String[] args){

        Studio wb = new Studio("Warner Bros.");
        DBHelper.save(wb);
        Studio lucasfilm = new Studio("lucasfilm");
        DBHelper.save(lucasfilm);

        Film starWars = new Film("Star Wars", Genre.SCIFI, Rating.U);
        DBHelper.save(starWars);
        Film empireStrikesBack = new Film("Episode V: The Empire Strikes Back", Genre.SCIFI, Rating.U);
        DBHelper.save(empireStrikesBack);
        Film fellowship = new Film("Episode VI: The Fellowship of the Ring", Genre.SCIFI, Rating.U);
        DBHelper.save(fellowship);

        starWars.setTitle("Episode IV: A New Hope");
        DBHelper.update(starWars);
        
        DBHelper.delete(fellowship);



    }
}
