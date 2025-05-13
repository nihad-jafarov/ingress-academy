package org.ingress.observer;

class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String name) {
        this.channelName = name;
    }

    public void update(String news) {
        System.out.println(channelName + " received news: " + news);
    }
}