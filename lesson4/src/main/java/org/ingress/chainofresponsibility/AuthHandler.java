package org.ingress.chainofresponsibility;

class AuthHandler extends Handler {
    public void handleRequest(String request) {
        if (request.equals("AUTH")) {
            System.out.println("AuthHandler handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}