package main.java.uk.co.davunderscorei.utilities.nullPropagator;

import main.java.uk.co.davunderscorei.utilities.Delegate;

/**
 * Created by davin on 23/12/2016.
 */
public class NullPropagator<TInput> implements Continuation<TInput> {
    private final ContinuationImpl<TInput> continuation;

    public NullPropagator(TInput value) {
        this.continuation = new ContinuationImpl(value);
    }

    public TInput getValue() {
        return this.continuation.getValue();
    }

    public <TOutput> Continuation<TOutput> then(Delegate<TInput, TOutput> delegate) {
        return this.continuation.then(delegate);
    }
}
