package main.java.uk.co.davunderscorei.utilities.nullPropagator;

import main.java.uk.co.davunderscorei.utilities.Delegate;

/**
 * Created by davin on 23/12/2016.
 */
public interface Continuation<TInput> {
    <TOutput> Continuation<TOutput> then(Delegate<TInput, TOutput> delegate);
    TInput getValue();
}
