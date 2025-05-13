package org.ingress.iterator;

class NameRepository implements Container<String> {
    private String[] names = {"Alice", "Bob", "Charlie"};

    public Iterator<String> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        int index = 0;

        public boolean hasNext() {
            return index < names.length;
        }

        public String next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}