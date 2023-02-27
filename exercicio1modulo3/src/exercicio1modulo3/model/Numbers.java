package exercicio1modulo3.model;

import java.util.HashSet;
import java.util.Set;

public class Numbers {

	private final Set<Integer> numberList = new HashSet<>();

    public Numbers() { }

    public Set<Integer> getNumberList() {
        return numberList;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numberList=" + numberList +
                '}';
    }
	
}
