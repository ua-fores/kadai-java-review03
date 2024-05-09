package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    // コンストラクタ
    // 引数なし
    public BaseBallTeam() {
        // 処理なし
    }

    // 引数あり
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    // 勝率を計算する
    public double getRate() {
        double rate;
        // 勝ち数/(勝ち数+負け数)
        rate = (double) win / ((double) win + (double) lose);
        return rate;
    }

    // 成績を出力する
    public void report() {
        double rate;
        rate = getRate();
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + rate + "です。");

    }

}
