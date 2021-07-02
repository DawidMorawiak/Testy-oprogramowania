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
public class DELETETest {
    @Mock
    private javax.swing.JPanel studLL;
    @Mock
    private javax.swing.JPanel facLL;
    @Mock
    private javax.swing.JTextField t1;
    @Mock
    private javax.swing.JLabel l1;
    @Mock
    private javax.swing.JButton bb;
    @Mock
    private javax.swing.JSeparator s1;
    @Mock
    private javax.swing.JSeparator s2;

    @Test
    public void teststudLLMouseClicked() {

        DELETE delete = new DELETE();
        ReflectionTestUtils.setField(delete,"t1",t1);
        ReflectionTestUtils.setField(delete,"l1",l1);
        ReflectionTestUtils.setField(delete,"bb",bb);
        ReflectionTestUtils.setField(delete,"s1",s1);
        ReflectionTestUtils.setField(delete,"s2",s2);
        delete.studLLMouseClicked(null);
        verify(t1,times(1)).setVisible(true);
        verify(l1,times(1)).setVisible(true);
        verify(bb,times(1)).setVisible(true);
        verify(s1,times(1)).setVisible(true);
        verify(s2,times(1)).setVisible(false);
    }


    @Test
    public void testfacLLMouseClicked() {

        DELETE delete = new DELETE();
        ReflectionTestUtils.setField(delete,"t1",t1);
        ReflectionTestUtils.setField(delete,"l1",l1);
        ReflectionTestUtils.setField(delete,"bb",bb);
        ReflectionTestUtils.setField(delete,"s1",s1);
        ReflectionTestUtils.setField(delete,"s2",s2);
        delete.facLLMouseClicked(null);
        verify(t1,times(1)).setVisible(true);
        verify(l1,times(1)).setVisible(true);
        verify(bb,times(1)).setVisible(true);
        verify(s1,times(1)).setVisible(false);
        verify(s2,times(1)).setVisible(true);
    }

}
