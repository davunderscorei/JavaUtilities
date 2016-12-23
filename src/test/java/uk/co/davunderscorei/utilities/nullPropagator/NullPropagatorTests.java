package test.java.uk.co.davunderscorei.utilities.nullPropagator;

import main.java.uk.co.davunderscorei.utilities.nullPropagator.NullPropagator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class NullPropagatorTests {
    Start start;
    End value;

    @Test
    public void givenStartIsNull_whenICallGetValue_thenValueIsNull() {
        givenStartIsNull();
        whenICallGetValue();
        thenValueIsNull();
    }

    @Test
    public void givenMiddleIsNull_whenICallGetValue_thenValueIsNull() {
        givenMiddleIsNull();
        whenICallGetValue();
        thenValueIsNull();
    }

    @Test
    public void givenEndIsNull_whenICallGetValue_thenValueIsNull() {
        givenEndIsNull();
        whenICallGetValue();
        thenValueIsNull();
    }

    @Test
    public void givenEndIsNotNull_whenICallGetValue_thenValueIsNogtNull() {
        givenEndIsNotNull();
        whenICallGetValue();
        thenValueIsNotNull();
    }

    private void givenStartIsNull() {
        this.start = null;
    }

    private void givenMiddleIsNull() {
        this.start = new Start();
        this.start.middle = null;
    }

    private void givenEndIsNull() {
        this.start = new Start();
        this.start.middle = new Middle();
        this.start.middle.end = null;
    }

    private void givenEndIsNotNull() {
        this.start = new Start();
        this.start.middle = new Middle();
        this.start.middle.end = new End();
    }

    private void whenICallGetValue() {
        this.value = new NullPropagator<>(this.start).then(s -> s.middle).then(m -> m.end).getValue();
    }

    private void thenValueIsNull() {
        assertNull(this.value);
    }

    private void thenValueIsNotNull() {
        assertNotNull(this.value);
    }

    public class Start {
        public Middle middle;
    }

    public class Middle {
        public End end;
    }

    public class End {
    }
}
