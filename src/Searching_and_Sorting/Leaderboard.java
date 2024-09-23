package Searching_and_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Leaderboard {
    List<Player> list;

    public static Comparator<Player> EMAIL_COMPARATOR = new Comparator<Player>() {
        @Override
        public int compare(Player o1, Player o2) {
            return o1.getEmailId().compareTo(o2.getEmailId());
        }
    };

    Leaderboard(List<Player> list){
        Collections.sort(list, EMAIL_COMPARATOR);
        this.list = list;
    }

    public int getMyScore(String email){
        int myPosition = performBinarySearchForEmail(email, 0, list.size() - 1);
        if(myPosition == -1){
            throw new IllegalArgumentException("Input email does not exist");
        }else{
            return list.get(myPosition).getScore();
        }
    }

    private int performBinarySearchForEmail(String email, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        String emailAtMid = list.get(mid).getEmailId();
        int comparison = email.compareTo(emailAtMid);
        if(comparison < 0){
            end = mid-1;
        }else if(comparison > 0){
            start = mid+1;
        }else{
            return mid;
        }
        return performBinarySearchForEmail(email, start, end);
    }

}
