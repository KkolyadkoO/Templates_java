package lab9.task1.interfaces;

import lab9.task1.models.File;

public interface FileState {
    void open(File file);
    void close(File file);
    void lock(File file);
    void unlock(File file);
    void printStatus();
}
