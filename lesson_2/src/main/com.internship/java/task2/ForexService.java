package task2;

/**
 * Класс предоставляет текущие курсы обмена валют
 */
public class ForexService {
    /**
     * Перевод заданного кол-ва долларов в рубли
     * @param dollars - сумма в доларах
     * @return вещественное число в рублях
     */
    public double dollarsToRubles(double dollars){
        return dollars * 91.3514;
    }

    /**
     * Перевод заданного кол-ва евро в рубли
     * @param euros -  сумма в евро
     * @return вещественное число в рублях
     */
    public  double eurosToRubles(double euros){
        return euros * 77.11875;
    }

    /**
     * Перевод заданного кол-ва юаней в рубли
     * @param uan - сумма в юанях
     * @return вещественное число в рублях
     */
    public double uanToRubles(double uan){
        return uan * 11.6589;
    }
}

