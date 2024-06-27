package com.mediator;

public interface Party {
    void addMember(PartyMember partyMember);
    void act(PartyMember partyMember,Action action);
}
