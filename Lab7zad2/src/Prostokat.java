

class Prostokat extends Figura {
	int wys=0;
	int szer=0;

	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	@Override
	public String opis(){
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}

	@Override
	void skaluj(float skala) {

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
