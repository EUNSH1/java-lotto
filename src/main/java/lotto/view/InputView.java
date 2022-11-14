package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final String INPUT_LOTTO_AMOUNT = "구입금액을 입력해 주세요.";

    private static final String INPUT_LOTTO_WINNING = "당첨 번호를 입력해 주세요.";

    private static List<Integer> winningNumberList;
    public static int inputPlayerAmount(){
        System.out.println(INPUT_LOTTO_AMOUNT);
        return Integer.parseInt(Console.readLine());
    }

    public static List<Integer> inputLottoWinningNum(){
        System.out.println(INPUT_LOTTO_WINNING);
        return numberList(Console.readLine());
    }

    public static List<Integer> numberList(String winningNumber){
        String[] result = winningNumber.split(",");
        winningNumberList = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            winningNumberList.add(Integer.parseInt(result[i]));
        }
        return winningNumberList;
    }

}
