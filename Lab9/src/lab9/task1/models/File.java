package lab9.task1.models;

import lab9.task1.interfaces.FileState;

public class File {
    private FileState state;

    public File() {
        this.state = new ClosedState();
    }

    public void setState(FileState state) {
        this.state = state;
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    public void lock() {
        state.lock(this);
    }

    public void unlock() {
        state.unlock(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
