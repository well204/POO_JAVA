import java.util.ArrayList;
import java.util.List;

class AgendaStar extends Agenda {
    // SE o contato existir e for do tipo ContatoStar altere o atributo star dele
    public void star(String name, boolean value) {
        if (findContact(name) != null && findContact(name) instanceof ContactStar) {
            ((ContactStar) findContact(name)).setStar(value);
        }
    }

    // filtre em uma nova lista apenas os contatos que forem do tipo ContatoStar e
    // que estão favoritados
    public List<Contact> getStarred() {
        List<Contact> result = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            if (contact instanceof ContactStar && ((ContactStar) contact).getStar()) {
                result.add(contact);
            }
        }
        return result;
    }
}