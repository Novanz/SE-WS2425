import java.util.List;

public class Inventory {

	private List<Medium> stock;
	private int numberOfMediums;

	public boolean istAusleibar() {
		// TODO - implement Col.istAusleibar
		throw new UnsupportedOperationException();
	}

	public void addMedium(Medium medium) {
		// TODO - implement Col.addMedium
		throw new UnsupportedOperationException();
	}

	public void removeMedium(Medium medium) {
		// TODO - implement Col.removeMedium
		throw new UnsupportedOperationException();
	}


	public void searchMedium(String title) {
		// TODO - implement Col.searchMedium
		throw new UnsupportedOperationException();
	}

	public List<Medium> getStock() {
		return stock;
	}

	public void setStock(List<Medium> stock) {
		this.stock = stock;
	}

	public int getNumberOfMediums() {
		return numberOfMediums;
	}

	public void setNumberOfMediums(int numberOfMediums) {
		this.numberOfMediums = numberOfMediums;
	}
}