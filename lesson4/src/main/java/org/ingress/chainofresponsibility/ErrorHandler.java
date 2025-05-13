package org.ingress.chainofresponsibility;

class ErrorHandler extends Handler {
    public void handleRequest(String request) {
        if (request.equals("ERROR")) {
            System.out.println("ErrorHandler handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("No handler could process the request.");
        }
    }
}