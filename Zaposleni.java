package zadaci;

public class Zaposleni {
	
	
	//2.Kreirati klasu zaposleni koja ima sledece atribute: ime,prezime,godine_staza,plata
	//Voditi racuna koji tipovi podataka se vezuju za navedene atribute.
	//Obavezno je kreirati konstruktornkojim se objekat klase moze kreirati
	//kreirati gettere i settere metode kojima se moze pristupitit odredjenom atributu objekta,kao i  eventualno taj atribut 
	//izmijeniti pomocu seter metode
	//Klasa Zaposleni mora da sadrzi metodu koja vrsi ispisivanje zaposlenih(ime i prezime,godine staza)
	//kreirati makar 3 objekata klase Zaposleni mora da sadrzi metodu koja vrsi ispisivanje
	
	
	
	
	
	private String ime;
	private String prezime;
	private int godine_staza;
	private double plata;  //broj sa procentom da izlazi
	
	
		
		
	public Zaposleni(String ime, String prezime, int godine_staza, double plata) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine_staza = godine_staza;
		this.plata = plata;
	}


	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
		
		
	}

	public int getGodine_staza() {
		return godine_staza;
	}

	public void setGodine_staza(int godine_staza) {
		
		if(godine_staza < 0) {
			System.out.println("ne moze biti negativano");
			this.godine_staza = 0;
		}else {
		this.godine_staza = godine_staza;
		}
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
		
	}
	
	public void provjeriUvecaj() {
		
		if(this.plata < 800 && this.godine_staza > 10) {
			double staraPlata = this.plata;
			double novaPlata = staraPlata*1.06;
			System.out.println("Stara plata od:" + staraPlata + " je uvecana" + novaPlata);
		}else {
			System.out.println("ne ispunjava uslove o povecanju placu");
		}
	}
	
	public void ispisi() {
		System.out.println("Zaposleni: " + ime + " " + prezime + " u nasoj firmi radi " + godine_staza);
		
	}
	
	//public void najvecaPlata() {
		
	}
	
	     
	