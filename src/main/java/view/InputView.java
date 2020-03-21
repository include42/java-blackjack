package view;

import domain.game.Money;
import domain.game.PlayerAnswer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String NAMES_DELIMITER = ",";

    public static List<String> requestName() {
        OutputView.printNameFormat();
        String[] splitNames = scanner.nextLine().split(NAMES_DELIMITER);
        return Arrays.asList(splitNames);
    }

    public static PlayerAnswer requestDraw() {
        return PlayerAnswer.of(scanner.nextLine());
    }

    public static Money requestMoney() {
        return new Money(Integer.parseInt(scanner.nextLine()));
    }
}
