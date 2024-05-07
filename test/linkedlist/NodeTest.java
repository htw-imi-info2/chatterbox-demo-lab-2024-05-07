package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }
    @Test
    public void testToString(){
        Node list = new Node("a", new Node("b", new Node("c", null)));
        assertEquals("abc", list.toString());
    }
}