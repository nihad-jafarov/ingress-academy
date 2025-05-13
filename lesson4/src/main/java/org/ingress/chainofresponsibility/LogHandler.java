package org.ingress.chainofresponsibility;

class LogHandler extends Handler {
    public void handleRequest(String request) {
        if (request.equals("LOG")) {
            System.out.println("LogHandler handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}