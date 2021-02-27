package clase;

public class Zookeeper {
	private String nume;

	public Zookeeper(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	// clasa aceasta are o metoda "feed"
	public void feed(Animal a) {
		System.out.println("Ingrijitorul "+this.nume+" hraneste animalul "+a.getNume());
	}
}
