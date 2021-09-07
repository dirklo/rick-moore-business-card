package com.businesscard.rickmoorebusinesscard;

public class Card {

    private final long id;
    private final String name;
    private final String description;
    private final String portfolio;
    private final String gitHub;
    private final String linkedIn;


    public Card(long id, String name, String description, String portfolio, String gitHub, String linkedIn) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.portfolio = portfolio;
        this.gitHub = gitHub;
        this.linkedIn = linkedIn;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getGitHub() {
        return gitHub;
    }

    public String getLinkedIn() {
        return linkedIn;
    }
}
