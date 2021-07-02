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
public class SEARCHTest {
    @Mock
    private javax.swing.JTextField t1;
    @Mock
    private javax.swing.JLabel l1;
    @Mock
    private javax.swing.JButton b1;
    @Mock
    private javax.swing.JPanel stBut;
    @Mock
    private javax.swing.JPanel faBut;
    @Mock
    private javax.swing.JPanel maBut;

    @Test
    public void teststButMouseClicked() {

        SEARCH search = new SEARCH();
        ReflectionTestUtils.setField(search, "t1", t1);
        ReflectionTestUtils.setField(search, "l1", l1);
        ReflectionTestUtils.setField(search, "b1", b1);
        search.stButMouseClicked(null);
        verify(t1, times(1)).setVisible(true);
        verify(l1, times(1)).setVisible(true);
        verify(b1, times(1)).setVisible(true);
    }
}