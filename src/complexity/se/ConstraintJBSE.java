package complexity.se;

import java.util.List;

import jbse.mem.Clause;

public class ConstraintJBSE extends Constraint {
	
	private Clause clause; 

	public ConstraintJBSE(Clause clause) {
		super();
		this.clause = clause;
	}
	
	@Override
	public String toString() {
		return this.clause.toString();
	}

	@Override
	public Constraint mkNot() {
		return this; //TODO: compute not
	}

	@Override
	public boolean isInconsistent(List<Constraint> slice) {
		return false;
	}
	

}
