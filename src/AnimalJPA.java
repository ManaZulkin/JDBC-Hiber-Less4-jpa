import jakarta.persistence.*;

@Entity
public class AnimalJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column
    public String name;
    @Column
    boolean Tail;

    public AnimalJPA(String name, boolean tail) {
        this.name = name;
        Tail = tail;
    }

    public AnimalJPA() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTail() {
        return Tail;
    }

    public void setTail(boolean tail) {
        Tail = tail;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", Tail=" + Tail +
                '}';
    }
}
