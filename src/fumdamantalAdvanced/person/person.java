package fumdamantalAdvanced.person;

public class person {
    private String nanme;
    public String a;

    public person(String nanme) {
        this.nanme = nanme;
    }

    public person() {
    }

    public String getNanme() {
        return nanme;
    }

    public void setNanme(String nanme) {
        this.nanme = nanme;
    }

    public void eat(){
        System.out.println("eat");
    }

    public void eat(int x){
        System.out.println(x);
    }


}
