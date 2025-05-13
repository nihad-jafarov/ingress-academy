package org.ingress.iterator;

interface Container<T> {
    Iterator<T> getIterator();
}