package Searching_and_Sorting;

public class Player {

    private String emailId;
    private int score;
    private long createdAtTS;

    public Player(String emailId, int score){
        this.emailId = emailId;
        this.score = score;
        createdAtTS = System.currentTimeMillis();
    }

    public Player(String emailId, int score, long createdAtTS){
        this.emailId = emailId;
        this.score = score;
        this.createdAtTS = createdAtTS;
    }

    public String getEmailId() {
        return emailId;
    }
    public int getScore() {
        return score;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public void setScore(int score){
        this.score = score;
    }
}
