package com.mediator;

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements Party {
    private final List<PartyMember> members;

    public PartyImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember partyMember) {
        members.add(partyMember);
        partyMember.joinedParty(this);

    }

    @Override
    public void act(PartyMember partyMember, Action action) {
        for (var member : members) {
            if (!member.equals(partyMember)) {
                member.partyAction(action);
            }
        }


    }
}
