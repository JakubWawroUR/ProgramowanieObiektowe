public class Okrag extends Punkt {
    double promien;
    Punkt punkt;
    public Okrag(Punkt punkt, double promien) {

        this.promien = promien;
    }
    public void getPowierznia(){
        System.out.println(Math.PI * promien * promien);
    }
    public void getSrednica(){
        System.out.println(promien*promien);
    }
    public void setPromien(double p){
        promien = p;
    }
    public void getPromien(){
        System.out.println(promien);
    }
    public void wSrodku(Punkt test){
        if((x- test.x)*(x-test.x)+(y-test.y)*(y-test.y) <= promien*promien){
            System.out.println("znajduje sie wewnatrz");
        }else{
            System.out.println("Nie znajduje sie");
        }
    }
}
