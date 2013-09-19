package lab;

public class S_Director {

	S_StableBuilder stable;
	public S_Director(S_StableBuilder stable) {
		this.stable=stable;
	}

	public void buildStable() {
		stable.buildStable();

		stable.buildRoom(0, 1);
		stable.buildRoom(1, 1);
		stable.buildRoom(2, 1);
		stable.buildRoom(0, 0);
		stable.buildRoom(0, 2);

		stable.buildRoom(3, 1);
		stable.buildRoom(2, 0);
		stable.buildRoom(1, 0);
		stable.buildRoom(2, 2);
		stable.buildRoom(1, 2);

		stable.buildDoors(2, 1, 3, 1, "box");
		stable.buildDoors(2, 1, 2, 0, "box");
		stable.buildDoors(2, 1, 2, 2, "box");
		stable.buildDoors(1, 1, 1, 0, "box");
		stable.buildDoors(1, 1, 1, 2, "box");

		stable.buildDoors(0, 1, 0, 0, "door");
		stable.buildDoors(0, 1, 0, 2, "door");

		stable.setSides(0, 1, 1, 1);
		stable.setSides(2, 1, 1, 1);

	}

}
