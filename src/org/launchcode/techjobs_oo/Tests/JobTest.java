package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.assertEquals;
public class JobTest {
    @Before

    @Test
    public void testSettingJobId() {
       Job test_job_a = new Job();
       Job test_job_b = new Job();
        assertEquals(test_job_a.getId(), test_job_b.getId()-1, .001);
    }

}
