package com.mediator;

public class PartyMemberBase implements PartyMember {
    protected Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " joins the party");

        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this+" "+action.getDescription());
    }

    @Override
    public void act(Action action) {
        System.out.println("<=============================================>");
        System.out.println(this +" " +action.getDescription());
        if (party != null) {
            party.act(this, action);
        }
    }

    @Override
    public String toString() {
        return "PartyMemberBase{" +
                "party=" + party +
                '}';
    }
}
