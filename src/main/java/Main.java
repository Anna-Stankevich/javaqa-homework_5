import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args){

        SQRService service = new SQRService();
        System.out.println("В выбранном диапазоне корней будет: " + service.calcSQR(101,9_603) + ".");
    }
}
