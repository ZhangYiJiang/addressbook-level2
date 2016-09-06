package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Represents the addition or removal of a tag from a person 
 * Guarantees: immutable
 */
public class Tagging {
    public enum Action {
        ADDING, REMOVING
    }
    
    private Person person; 
    private Tag tag; 
    private Action action; 
    
    public Tagging (Person person, Tag tag, Action action) {
        this.person = person;
        this.tag = tag;
        this.action = action;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public Tag getTag() {
        return tag; 
    }
    
    public Action getAction() {
        return action; 
    }
    
    /**
     * Retrieve the shorthand representation of the provided action 
     * @param action
     * @return 
     */
    public static String getActionShorthand(Action action) {
        switch (action) {
        case ADDING:
            return "+";
        case REMOVING:
        default:
            return "-";
        }
    }
    
    @Override
    public String toString() {
        return getActionShorthand(action) + " " + person.toString() + " " + tag.toString(); 
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true; 
        }
        
        if (!(other instanceof Tagging)){
            return false;
        }
        
        Tagging obj = (Tagging) other;
        return this.person.equals(obj.getPerson()) && 
                this.action.equals(obj.getAction()) && 
                this.tag.equals(obj.getTag());
    }
}
