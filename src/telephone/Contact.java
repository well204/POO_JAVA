import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private List<Fone> fones = new ArrayList<Fone>();
    protected String prefix = "- "; // utilizado no toString
    // Crie um ArrayList para o ATRIBUTO fones
    // Se a variável fones não for null, adicione todos os fones usando o método
    // addFone

    public Contact(String name, List<Fone> fones) {
        this.name = name;
        this.fones = fones == null ? new ArrayList<Fone>() : fones;
    }

    // Se fone for válido, insira no atributo fones
    // Se não, informe o erro
    public void addFone(Fone fone) {
        if (Fone.validate(fone.getNumber())) {
            fones.add(fone);
        } else {
            System.out.println("fail: invalid number");
        }
    }

    // Se o índice existir no ArrayList, remova o telefone com esse índice
    public void rmFone(int index) {
        for (int i = 0; i < fones.size(); i++) {
            if (i == index) {
                fones.remove(i);
            }
        }
    }

    // Use um contador para mostrar o índice do telefone
    // Use o toString do fone para adicioná-lo à saída
    // O resultado dever ficar assim:
    // - david [0:oi:123] [1:tim:9081] [2:claro:5431]
    public String toString() {
        int count = 0;
        String result = prefix + name + " ";
        for (Fone fone : fones) {
            result += "[" + count + ":" + fone.toString() + "]";

            count++;
        }
        return result + "\n";
    }

    // GETS e SETS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fone> getFones() {
        return this.fones;
    }

    // limpe a lista de fones
    // utilize o addFone para adicionar apenas os fones válidos
    public void setFones(List<Fone> fones) {
        this.fones.clear();
        for (int i = 0; i < fones.size(); i++) {
            if (fones.get(i).validate(fones.get(i).getNumber())) {
                this.fones.add(fones.get(i));
            }
        }
    }

    public void merge(Contact contact) {
        for (int i = 0; i < contact.getFones().size(); i++) {
            this.addFone(contact.getFones().get(i));
        }
    }

}