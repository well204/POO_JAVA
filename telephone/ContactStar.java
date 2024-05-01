import java.util.List;

class ContactStar extends Contact {
    private boolean star;

    // contrutor default
    public ContactStar(String name, List<Fone> fones, boolean star) {
        super(name, fones);
        this.star = star;
    }

    // muda o prefixo e o valor de star

    void setStar(boolean value) {
        this.prefix = value ? "@ " : "- ";
        this.star = value;
    }

    boolean getStar() {
        return this.star;
    }
}