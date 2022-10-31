package onboarding;


import java.util.Collections;
import java.util.List;

public class Problem5 {
    static List<Integer> MoneyType = List.of(50000,10000,5000,1000,500,100,50,10,1);
    public static List<Integer> solution(int money) {
        if(CheckInput(money)){
        }
        throw new IllegalArgumentException("잘못된 입력값");
    }

    /* 기능1 : input 확인 */
    private static boolean CheckInput(int money){
        if(money > 0 && money < 1000001){
            return true;
        }return false;
    }

    /* 기능2 : 사용할 화폐 지정 */
    private static int TypeofMoney(int money){
        for(int i = 0; i < MoneyType.size(); i++){
            if (money >= MoneyType.get(i)) return i;
        }
        return 0;
    }


}
