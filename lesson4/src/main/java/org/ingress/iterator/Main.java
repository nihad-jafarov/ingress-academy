package org.ingress.iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();
        Iterator<String> it = repo.getIterator();

        while (it.hasNext()) {
            System.out.println("Name: " + it.next());
        }
    }
}
