import java.util.Scanner;

public class Game {

    public static void start() {
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Scanner in = new Scanner(System.in);
        System.out.println("Вам дано 12 карт номиналом от 0 до 11.\n" +
                "Смысл игры в том, чтобы набрать меньшее количество очков.\n" +
                "игрок делающий первый ход считается нападающим и выкладывает желаемую карту взакрытую.\n" +
                "Второй игрок считается защищающимся и выкладывает свою карту после нападющего.\n" +
                "Если карта нападающего игрока номинально выше чем карта защищающегося,\n" +
                " то защищающийся получает количество очков равное разности между этими картами,\n" +
                "в обратном случае атака считается отбитой и очков не получает никто.\n" +
                "После этого карты идут в сброс, а игроки меняются ролями.\n" +
                "игра идет пока есть карты");

        System.out.println("Выберите карту");

        for(int i = 0; i< 12;i++){
            if(i%2==0){
                System.out.println("Вы атакуете");
                System.out.println("Выберите карту из имеющихся");
                System.out.println(p1.cards());
                int move = in.nextInt();
                int aiMove = p2.getCard();
                if(p1.cards().contains(move)) {
                    if (move > aiMove) {
                        p2.penalty_points(move - aiMove);
                    }
                }else {
                    System.out.println("У вас нет такой карты");
                    i--;
                    continue;
                }
                p1.deleteCard(move);
                p2.deleteCard(aiMove);
            }else {
                System.out.println("Вы защищаетесь");
                System.out.println("Выберите карту из имеющихся");
                System.out.println(p1.cards());
                int move = in.nextInt();
                int aiMove = p2.getCard();
                if(p1.cards().contains(move)) {
                    if (move < aiMove) {
                        p1.penalty_points(move - aiMove);
                    }
                }else {
                    System.out.println("У вас нет такой карты");
                    i--;
                    continue;
                }
                p1.deleteCard(move);
                p2.deleteCard(aiMove);
            }
        }
        if(p1.getPoints()>p2.getPoints()){
            System.out.println("Вы победили со счетом"+ p1.getPoints() + " : " + p2.getPoints());
        }else{
            System.out.println("Вы проиграли со счетом"+ p1.getPoints() + " : " + p2.getPoints());
        }
    }
}
/*switch (move){
                case 0:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 1:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 2:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 3:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 4:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 5:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 6:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 7:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 8:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 9:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 10:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                case 11:
                    if(ifodd%2==0){
                        System.out.println("Вы атакуете");
                    }else {
                        System.out.println("Вы защищаетесь");
                        System.out.println(art.card_art());
                        System.out.println("Выберите карту");
                    }
                    break;
                default:
                    System.out.println("Выбран неверный номер карты");
            }*/