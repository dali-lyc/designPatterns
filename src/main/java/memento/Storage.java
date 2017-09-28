package memento;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class Storage {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Storage(Memento memento) {
        this.memento = memento;
    }

}
