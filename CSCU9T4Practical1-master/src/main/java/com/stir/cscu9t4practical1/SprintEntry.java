package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
	private int recovery;
	private int repetitions;
	
	public SprintEntry(String n, int d, int m, int y, int h, int min,
			int s, float dist, int recovery, int repetitions) {
		super(n, d, m, y, h, min, s, dist);
		this.recovery = recovery;
		this.repetitions = repetitions;
	}
	
	public int getRecovery() {
		return recovery;
	}
	
	public int getRepetitions() {
		return repetitions;
	}
	
	public String getEntry() {
		String result = getName() + " sprined " + getRepetitions() +
				"x" + getDistance() + "m in" + getHour() + 
				":" + getMin() + ":" + getSec() + " with "
				+ getRecovery() + " minutes recovery on" + getDay() +
				"/" + getMonth() + "/" + getYear() + "\n";
		return result;
	}
}
