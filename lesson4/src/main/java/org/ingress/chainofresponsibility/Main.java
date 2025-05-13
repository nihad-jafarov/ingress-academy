package org.ingress.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Handler auth = new AuthHandler();
        Handler log = new LogHandler();
        Handler error = new ErrorHandler();

        auth.setNext(log);
        log.setNext(error);

        auth.handleRequest("LOG");
        auth.handleRequest("AUTH");
        auth.handleRequest("ERROR");
        auth.handleRequest("UNKNOWN");
    }
}
