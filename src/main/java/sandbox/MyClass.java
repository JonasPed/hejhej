package sandbox;

import java.util.List;

public class MyClass {
	private String op;
	private List<List<String>> sorIdAndParentSorIdPairs;

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public List<List<String>> getSorIdAndParentSorIdPairs() {
		return sorIdAndParentSorIdPairs;
	}

	public void setSorIdAndParentSorIdPairs(List<List<String>> sorIdAndParentSorIdPairs) {
		this.sorIdAndParentSorIdPairs = sorIdAndParentSorIdPairs;
	}

	public abstract class InnerTest {
		public abstract String logic();
	}
}
