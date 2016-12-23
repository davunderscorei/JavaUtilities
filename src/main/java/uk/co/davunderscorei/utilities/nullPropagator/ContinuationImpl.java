package main.java.uk.co.davunderscorei.utilities.nullPropagator;

import main.java.uk.co.davunderscorei.utilities.Delegate;

/**
 * Created by davin on 23/12/2016.
 */
class ContinuationImpl<TInput> implements Continuation<TInput> {
    private final TInput value;

    public ContinuationImpl(TInput value) {
        this.value = value;
    }

    @Override
    public TInput getValue() {
        return this.value;
    }

    @Override
    public <TOutput> Continuation<TOutput> then(Delegate<TInput, TOutput> delegate) {
        TOutput result = this.value == null ? null : delegate.call(this.value);

        return new ContinuationImpl(result);
    }
}
