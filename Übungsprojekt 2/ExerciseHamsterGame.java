import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
/**
 * Beschreiben Sie hier die Klasse MyFirstSimpleHamster.
 * 
 * @author Jan Waidleich und Marcel Grote
 * @version 07.11.2018
 * 
 */
public class ExerciseHamsterGame extends SimpleHamsterGame
{
    ExerciseHamsterGame(){
        game.initialize();
        game.displayInNewGameWindow();   
    }
    /**
     * spawning a Hamster
     */
    Hamster getHamster(){
        return paule;
    }

    /**
     * Paule turns right
     */
    Hamster turnRight(){
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.turnLeft();
        return paule;

    }

    /**
     * Paule picks up all grain on the tile he is standing on
     */
    Hamster pickUpAllGrain(){
        while (this.paule.grainAvailable()){
            this.paule.pickGrain();
        }
        return paule;
    }
    /**
     * Paule ejects all grain on the tile he is standing on
     */
    Hamster droppAllGrain(){
        while (this.paule.mouthEmpty() == false){
            this.paule.putGrain();
        }
        return paule;
    }
            
}

