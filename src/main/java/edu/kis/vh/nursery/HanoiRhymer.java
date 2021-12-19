package edu.kis.vh.nursery;

// alt + ← oraz alt + → zmienia pomiędzy aktualnie otwartymi plikami w naszym edytorze
//źle sformatowane wiersze to: 5, ,14,15
public class HanoiRhymer extends DefaultCountingOutRhymer {
	
	private static final int NONE_REJECTED = 0;
	private int totalRejected = NONE_REJECTED;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
