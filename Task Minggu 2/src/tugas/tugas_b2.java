

package tugas;

public class tugas_b2 {
    public static void main(String[] args) {
        
        tugas_b1 p1 = new tugas_b1("Indah", 19);
        
        tugas_b1 p2 = new tugas_b1("April", 18);
        
        
        if(p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
        
    }
}
