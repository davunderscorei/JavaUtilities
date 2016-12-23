package main.java.uk.co.davunderscorei.utilities;

/**
 * Created by davin on 23/12/2016.
 */
public interface Delegate<TInput, TOutput> {
    TOutput call(TInput input);
}
