
/**
 * Beschreiben Sie hier die Klasse HomeworkHamster.
 * 
 * @author Jan Waideliche und Marcel Grote
 * @version 07.11.2018
 */
public class HomeworkHamster extends HomeworkHamsterGame{

    /*
     * Verwirrter Paule!
     * Helfe Paule um durch das Territorium zu laufen und alle Körner in seine Höhle zu bringen
     * Dabei soll Paule alle Körner auf dem Feld aufsammeln und sie in seiner Höhle (rechts unten
     * - Spalte 6 * Zeile 4 bei 0 beginnend) wieder ablegen. 
     */
    @Override
    protected void run(){
        paule.write("Ich weiß nicht wie :'(");
        // Helfe Paule dabei durch das Territorium zu laufen 
        // und alle Körner nachhause zu bringen
        int counter = 0;
        String koerner = "";
        //check if front is clear and move
        while(this.paule.frontIsClear()){
            //Paule is checking if a Grain is available, if a grain is a available he picks the grain up, count it and say how much he already have,
            //after this he move a step forward, else he just move 1 step forward
            if(this.paule.grainAvailable()){
                this.paule.pickGrain();
                counter++;
                koerner = Integer.toString(counter);
                this.paule.write(koerner);
            }
            this.paule.move();
        }
        
        if(this.paule.grainAvailable()){
            this.paule.pickGrain();
            counter++;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }

        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.move();
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.turnLeft();

        while(this.paule.frontIsClear()){
            if(this.paule.grainAvailable()){
                this.paule.pickGrain();
                counter++;
                koerner = Integer.toString(counter);
                this.paule.write(koerner);
            }
            this.paule.move();
        }
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.move();
        this.paule.move();
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.move();
        if(this.paule.grainAvailable()){
            this.paule.pickGrain();
            counter++;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }
        this.paule.turnLeft();
        this.paule.move();
        if(this.paule.grainAvailable()){
            this.paule.pickGrain();
            counter++;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.move();
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.turnLeft();

        while(this.paule.frontIsClear()){
            if(this.paule.grainAvailable()){
                this.paule.pickGrain();counter++;
                koerner = Integer.toString(counter);
                this.paule.write(koerner);
            }
            this.paule.move();
        }

        if(this.paule.grainAvailable()){
            this.paule.pickGrain();counter++;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }
        this.paule.turnLeft();
        this.paule.move();
        while(this.paule.frontIsClear()){
            if(this.paule.grainAvailable()){
                this.paule.pickGrain();counter++;
                koerner = Integer.toString(counter);
                this.paule.write(koerner);
            }
            this.paule.move();
        }
        this.paule.turnLeft();
        if(this.paule.grainAvailable()){
            this.paule.pickGrain();counter++;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }
        this.paule.move();
        if(this.paule.grainAvailable()){
            this.paule.pickGrain();counter++;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }
        this.paule.turnLeft();
        this.paule.move();
        if(this.paule.grainAvailable()){
            this.paule.pickGrain();counter++;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.turnLeft();
        while(this.paule.frontIsClear()){
            this.paule.move();
            if(this.paule.grainAvailable()){
                this.paule.pickGrain();counter++;
                koerner = Integer.toString(counter);
                this.paule.write(koerner);
            }

        }
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.turnLeft();
        this.paule.move();
        if(this.paule.grainAvailable()){
            this.paule.pickGrain();counter++;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }

        this.paule.turnLeft();
        if(this.paule.grainAvailable()){
            this.paule.pickGrain();counter++;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }

        while(this.paule.frontIsClear()){
            this.paule.move();
            if(this.paule.grainAvailable()){
                this.paule.pickGrain();counter++;
                koerner = Integer.toString(counter);
                this.paule.write(koerner);
            }

        }
        this.paule.turnLeft();
        while(this.paule.frontIsClear()){
            this.paule.move();
            if(this.paule.grainAvailable()){
                this.paule.pickGrain();counter++;
                koerner = Integer.toString(counter);
                this.paule.write(koerner);
            }

        }
        //Paule is checking if he have grain in his mouth, when he got grain in his mouth he ejects all grain on the tile he is standing on
        while(this.paule.mouthEmpty() == false){
            this.paule.putGrain();
            counter--;
            koerner = Integer.toString(counter);
            this.paule.write(koerner);
        }
    }
}