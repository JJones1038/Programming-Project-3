
public class Couple {
    
    private Person bride;
    private Person groom;
    
    public Couple(Person br, Person gr){
        bride = br;
        groom = gr;
    }
    
    public Person getGroom(){
        return groom;
    }
    
    public Person getBride(){
        return bride;
    }
}
