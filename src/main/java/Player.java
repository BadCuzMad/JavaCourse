import java.util.List;

public interface Player {
    void penalty_points(int amount);
    List<Integer> cards();
    int getCard();
    void deleteCard(int card);
}
