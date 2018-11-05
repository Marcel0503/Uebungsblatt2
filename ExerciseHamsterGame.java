import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
/**
 * Beschreiben Sie hier die Klasse MyFirstSimpleHamster.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ExerciseHamsterGame extends SimpleHamsterGame
{
    ExerciseHamsterGame(){
        game.initialize();
        game.displayInNewGameWindow();   
    }

    Hamster getHamster(){
        return paule;
    }

    Hamster turnRight(){
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.turnLeft();
        return paule;
    }

    Hamster koernerAufheben(){
        while(this.paule.grainAvailable() == true){
            this.paule.pickGrain();
        }
        return paule;
    }

    Hamster koernerHinlegen(){
        while(this.paule.mouthEmpty() == false){
            this.paule.putGrain();
        }
        return paule;
    }
}
