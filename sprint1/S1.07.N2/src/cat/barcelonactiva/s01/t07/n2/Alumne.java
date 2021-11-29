package cat.barcelonactiva.s01.t07.n2;

@FileDestinationAnnotation(Folder="c:/prova/", FileName="alumne.json")
public class Alumne {

	public Alumne() {

	}

	public Alumne(int id, String nom, String cognoms) {
		this.id = id;
		this.nom = nom;
		this.cognoms = cognoms;
	}

	private int id;
	private String nom;
	private String cognoms;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	@Override
	public String toString() {
		return "Alumne [id=" + id + ", nom=" + nom + ", cognoms=" + cognoms + "]";
	}

}
