import java.util.ArrayList;
import java.util.List;

public class Player2  implements Player{
    private int amount;

    @Override
    public void penalty_points(int amount) {
        this.amount += amount;
    }
    public int getPoints(){
        return amount;
    }

    @Override
    public List<Integer> cards() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        return list;
    }
    @Override
    public int getCard(){
        if(Math.random()>0.49){
            return cards().get(0);
        }else{
            return cards().get(cards().size()-1);
        }
    }

    @Override
    public void deleteCard(int card) {
        cards().removeIf(x->x==card);
    }
}
