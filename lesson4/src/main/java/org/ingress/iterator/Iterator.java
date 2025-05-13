package org.ingress.iterator;

interface Iterator<T> {
    boolean hasNext();
    T next();
}