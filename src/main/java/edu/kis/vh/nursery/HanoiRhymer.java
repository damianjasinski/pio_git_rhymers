package edu.kis.vh.nursery;

// alt + ← oraz alt + → zmienia pomiędzy aktualnie otwartymi plikami w naszym edytorze
//źle sformatowane wiersze to: 5, ,14,15
public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
