/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 *
 * @author Dawid Morawiak
 */
@ExtendWith(MockitoExtension.class)
public class ADDTest {
    @Mock
    private javax.swing.JPanel p1;
    @Mock
    private javax.swing.JPanel p2;
    @Mock
    private javax.swing.JPanel p3;
    @Mock
    private javax.swing.JPanel p4;


    /**
     * Test of main method, of class ADD.
     */
    @Test
    public void testB1ActionPerformed() {
        ADD add = new ADD();

        ReflectionTestUtils.setField(add, "p1", p1);
        ReflectionTestUtils.setField(add, "p2", p2);
        ReflectionTestUtils.setField(add, "p3", p3);
        ReflectionTestUtils.setField(add, "p4", p4);
        add.b1ActionPerformed(null);
        verify(p1, times(1)).setVisible(true);
        verify(p2, times(1)).setVisible(false);
        verify(p3, times(1)).setVisible(false);
        verify(p4, times(1)).setVisible(false);
    }

    @Test
    public void testB2ActionPerformed() {
        ADD add = new ADD();

        ReflectionTestUtils.setField(add, "p1", p1);
        ReflectionTestUtils.setField(add, "p2", p2);
        ReflectionTestUtils.setField(add, "p3", p3);
        ReflectionTestUtils.setField(add, "p4", p4);
        add.b2ActionPerformed(null);
        verify(p1, times(1)).setVisible(false);
        verify(p2, times(1)).setVisible(true);
        verify(p3, times(1)).setVisible(false);
        verify(p4, times(1)).setVisible(false);

    }
    @Test
    public void testB3ActionPerformed() {
        ADD add = new ADD();

        ReflectionTestUtils.setField(add, "p1", p1);
        ReflectionTestUtils.setField(add, "p2", p2);
        ReflectionTestUtils.setField(add, "p3", p3);
        ReflectionTestUtils.setField(add, "p4", p4);
        add.b3ActionPerformed(null);
        verify(p1, times(1)).setVisible(false);
        verify(p2, times(1)).setVisible(false);
        verify(p3, times(1)).setVisible(true);
        verify(p4, times(1)).setVisible(false);

    }
    @Test
    public void testjRadioButton1ActionPerformed() {
        ADD add = new ADD();

        ReflectionTestUtils.setField(add, "p1", p1);
        ReflectionTestUtils.setField(add, "p2", p2);
        ReflectionTestUtils.setField(add, "p3", p3);
        ReflectionTestUtils.setField(add, "p4", p4);
        add.jRadioButton1ActionPerformed(null);
        verify(p1, times(1)).setVisible(false);
        verify(p2, times(1)).setVisible(false);
        verify(p3, times(1)).setVisible(false);
        verify(p4, times(1)).setVisible(true);

    }
}
