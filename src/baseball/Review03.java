package baseball;

public class Review03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BaseBallTeam yakult = new BaseBallTeam();
		yakult.setName("東京ヤクルトスワローズ");
		yakult.setWin(80);
		yakult.setLose(59);
		yakult.setDraw(4);
		
		int yakultWin = yakult.getWin();
		int yakultLose = yakult.getLose();
		yakult.getRate(yakultWin,yakultLose);
		yakult.report();
		BaseBallTeam dena = new BaseBallTeam();
		dena.setName("横浜DeNAベイスターズ");
		dena.setWin(73);
		dena.setLose(68);
		dena.setDraw(2);
		
		int denaWin = dena.getWin();
		int denaLose = dena.getLose();
		dena.getRate(denaWin,denaLose);
		dena.report();
		BaseBallTeam tigers = new BaseBallTeam();
		tigers.setName("阪神タイガース");
		tigers.setWin(68);
		tigers.setLose(71);
		tigers.setDraw(4);
		
		int tigersWin = tigers.getWin();
		int tigersLose = tigers.getLose();
		tigers.getRate(tigersWin,tigersLose);
		tigers.report();
		BaseBallTeam giants = new BaseBallTeam();
		giants.setName("読売ジャイアンツ");
		giants.setWin(68);
		giants.setLose(72);
		giants.setDraw(3);
		
		int giantsWin = giants.getWin();
		int giantsLose = giants.getLose();
		giants.getRate(giantsWin,giantsLose);
		giants.report();
		BaseBallTeam carp = new BaseBallTeam();
		carp.setName("広島東洋カープ");
		carp.setWin(66);
		carp.setLose(74);
		carp.setDraw(3);
		
		int carpWin = carp.getWin();
		int carpLose = carp.getLose();
		carp.getRate(carpWin,carpLose);
		carp.report();
		BaseBallTeam dragons = new BaseBallTeam();
		dragons.setName("中日ドラゴンズ");
		dragons.setWin(66);
		dragons.setLose(75);
		dragons.setDraw(2);
		
		int dragonsWin = dragons.getWin();
		int dragonsLose = dragons.getLose();
		dragons.getRate(dragonsWin,dragonsLose);
		dragons.report();

	}

}
