import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Agenda {
    protected List<Contact> contacts = new ArrayList<Contact>();

    public Agenda() {
        this.contacts = new ArrayList<Contact>();
        if (contacts == null) {
            this.contacts = new ArrayList<Contact>();
        }
    }

    // retorna a posição do contato com esse nome no vetor ou -1 se não existir.
    private int findPosByName(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // retorna o objeto contato com esse nome ou null se não existir
    // utilize o método findPos
    public Contact findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return contacts.get(i);
            }
        }
        return null;
    }

    // se nenhum contato existir com esse nome, adicione
    // se ja existir, faça o merge adicionando os telefones
    // se tiver adicionado um novo contato, ordene a lista para ficar em ordem
    // alfabética
    public void addContact(Contact contact) {
        int pos = findPosByName(contact.getName());
        if (pos == -1) {
            contacts.add(contact);
        } else {
            // add contato utilizando merge
            contacts.get(pos).merge(contact);

        }

        // ....
        // o código para ordenação da lista já está pronto logo abaixo, não precisa
        // mexer nele.
        this.contacts.sort(new Comparator<Contact>() {
            @Override
            public int compare(Contact arg0, Contact arg1) {
                return ((Contact) arg0).getName().compareTo(((Contact) arg1).getName());
            }
        });
    }

    // Utilize o método findPos
    public void rmContact(String name) {
        if (findPosByName(name) != -1)
            contacts.remove(findPosByName(name));
    }

    // Monte uma lista auxiliar procurando no .toString() de cada contato
    // se ele possui a substring procurada.
    public List<Contact> search(String pattern) {
        List<Contact> result = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            if (contact.toString().contains(pattern)) {
                result.add(contact);
            }
        }
        return result;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public String toString() {
        String result = "";
        for (Contact contact : contacts) {
            result += contact.toString();
        }
        return result;
    }
}