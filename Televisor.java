package zadaci;

public class Televisor {

	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;

	
public Televisor(int brojKanala,String nazivKanala,int jacinaTona) {
	
	setBrojKanala(brojKanala);
	this.nazivKanala = nazivKanala;
	setJacinaTona(jacinaTona);
	
	
	}
	

public int getBrojKanala() {
	return brojKanala;
}


public void setBrojKanala(int brojKanala) {
	//this.brojKanala = brojKanala;
	if(brojKanala >=1) {
		this.brojKanala = brojKanala;
	}else {
		System.out.println("Broj kanala mora biti veci ili jednako 1");
		this.brojKanala=1;
	}
}     


public String getNazivKanala() {
	return nazivKanala;
}


public void setNazivKanala(String nazivKanala) {
	this.nazivKanala = nazivKanala;
}


public int getJacinaTona() {
	return jacinaTona;
}


public void setJacinaTona(int jacinaTona) {
	//this.jacinaTona = jacinaTona;
	if(jacinaTona>=0 && jacinaTona <=10) {
		this.jacinaTona = jacinaTona;
     }else {
    	 if(jacinaTona < 0) {
    		 this.jacinaTona = 0;
    	 }
    	 if(jacinaTona > 10) {
    		 this.jacinaTona = 10;
    	 }
     }
	
}


//public void pojacajTon() {
public void smanjiTon() {
	
	if(this.jacinaTona < 10) {
		//this.jacinaTona ++;
		
		//System.out.println("Ton je povecan na" + this.jacinaTona);
		System.out.println("Ton je smanjen na" + this.jacinaTona);
	}else {
		//System.out.println("Ton je vec na maksimumu");
		System.out.println("Ton je vec na minimumu");
	}
	
}

public void ispisi() {
	System.out.println("Broj kanala:" + this.brojKanala + " Naziv Kanala " + this.nazivKanala + " Jacina Tona " + this.jacinaTona);
}
}