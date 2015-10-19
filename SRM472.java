public class SRM472 {

	public String theWinner(int n) {

		return (n % 5 == 0 || n % 5 == 2) ? "Hanako" : "Taro";
	}

}
