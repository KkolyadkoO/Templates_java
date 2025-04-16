package lab7.task2.abstructions;

import lab7.task2.AccessRequest;

public abstract class AccessHandler {
    private AccessHandler next;

    public AccessHandler linkWith(AccessHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(AccessRequest request);

    protected boolean checkNext(AccessRequest request) {
        if (next == null) {
            return true;
        }
        return next.check(request);
    }
}