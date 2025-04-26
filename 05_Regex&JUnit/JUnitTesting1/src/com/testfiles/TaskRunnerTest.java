package com.testfiles;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.test.TaskRunner;

import java.util.concurrent.TimeUnit;
public class TaskRunnerTest {

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void testLongRunningTask() {
        String result = TaskRunner.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
