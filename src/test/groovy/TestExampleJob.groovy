import com.lesfurets.jenkins.unit.declarative.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

//https://github.com/jenkinsci/JenkinsPipelineUnit
class TestUnitBasic extends DeclarativePipelineTest {
    // Setup environment for running unit tests
    @Override
    @BeforeEach
    public void setUp() throws Exception {
        super.setUp()
    }

    @Test
    public void should_execute_without_errors() throws Exception {
        def script = loadScript("job/TestUnitBasic.jenkins")
        script.run()
        assertJobStatusSuccess()
        printCallStack()
    }
}