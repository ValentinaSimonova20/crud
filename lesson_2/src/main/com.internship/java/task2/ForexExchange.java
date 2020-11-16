package task2;

/**
 * Демонстрация работы сервиса ForexService
 */
public class ForexExchange {
    public static void main(String[] args) {
        ForexService forexService = new ForexService();

        double dollars = 35.6, uan = 100, euros = 47;

        System.out.println(dollars + " долларов: "+forexService.dollarsToRubles(dollars)+" рублей");
        System.out.println(uan + " юаней: "+forexService.uanToRubles(uan)+" рублей");
        System.out.println(euros + " евро: "+forexService.eurosToRubles(euros)+" рублей");
    }
}