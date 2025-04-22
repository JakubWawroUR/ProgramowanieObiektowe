

class Trojkat extends Figura{
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst,String kolor){

		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	public String opis(){
		return "Trojkat o wymairach: "+wys+"  "+podst;
	}
	public void skaluj(float skala) {
		this.podst = Math.round(this.podst * skala);
		this.wys = Math.round(this.wys * skala);
	}

	@Override
	public float getPowierzchnia() {
		return 0;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}