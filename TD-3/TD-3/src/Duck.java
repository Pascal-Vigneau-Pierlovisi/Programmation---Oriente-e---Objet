public class Duck<E> {
    E riri;
    E fifi;
    E loulou;

    public Duck(E riri, E fifi, E loulou){

        this.riri = riri;
        this.fifi = fifi;
        this.loulou = loulou;
    }

    public String toString(){
        return "Riri : " + riri + " | Fifi : " + fifi + " | Loulou : " + loulou;
    }

    public static void main(String[] args) {
        Duck<String> triplet1 = new Duck<>("Riri", "Rifi", "Loulou");
        System.out.println(triplet1.toString());
        Duck<Integer> triplet2 = new Duck<>(1, 2, 3);
        System.out.println(triplet2.toString());
        Duck<?> triplet3 = new Duck<>("Riri", 2, 3.14);
        System.out.println(triplet3.toString());

    }

}
