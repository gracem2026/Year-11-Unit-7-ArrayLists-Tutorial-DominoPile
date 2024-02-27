import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    //properties
    private ArrayList<Domino> pile = new ArrayList();

    //constructor
    public DominoPile() {
        pile.clear();
    }

    //methods
    public ArrayList<Domino> getPile() {
        return pile;
    }
    public void setPile(ArrayList<Domino> newPile) {
        pile = newPile;
    }
    public void newStack6() {
        for(int i = 0; i <= 6; i++) {
            for(int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }
    public void shuffle() {
        ArrayList <Domino> pile2 = new ArrayList<Domino>();
        Random random = new Random();
        for(int i = 0; i < pile.size(); i++) {
            int rand = random.nextInt(pile.size());
            pile2.add(i, pile.get(rand));
            int randCopy = rand;
            pile.remove(randCopy);
        }
    }
}
